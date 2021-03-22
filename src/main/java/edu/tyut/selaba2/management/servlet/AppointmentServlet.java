package edu.tyut.selaba2.management.servlet;

import edu.tyut.selaba2.management.constant.AppointmentConstant;
import edu.tyut.selaba2.management.domain.Guest;
import edu.tyut.selaba2.management.domain.VerificationCode;
import edu.tyut.selaba2.management.service.GuestService;
import edu.tyut.selaba2.management.service.SpaceUsageRecordService;
import edu.tyut.selaba2.management.service.VerificationService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.AbstractCollection;

/**
 * 预约的主要对外Servlet
 *
 * 目前的项目，并不是完符合RESTful原则，在以后的重构过程中
 * 会增加相关原则的一些功能
 *
 * @author KlenKiven
 */
public class AppointmentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setHeader("content-type", "application/json");
//        // 跨域访问处理 作者NOTF
//        resp.setHeader("Access-Control-Allow-Origin","*");

        // 服务对象的生成
        // 这些对象，会重复使用，过多生成可能会占用服务器资源
        // TODO 最好使用单例对象，重构的时候可以注意一下
        SpaceUsageRecordService spaceUsageRecordService = new SpaceUsageRecordService();
        GuestService guestService = new GuestService();
        VerificationService verificationService = new VerificationService();

        // 获取 response 的相关信息
        Long id = Long.parseLong(req.getParameter("id"));
        String name = req.getParameter("name");
        int userCount = Integer.parseInt(req.getParameter("userCount"));
        Long tel = Long.parseLong(req.getParameter("tel"));
        Timestamp beginTime = null;
        Timestamp endTime = null;
        String verification = req.getParameter("verification");
        String beginTimeStr = req.getParameter("beginTime");
        String endTimeStr = req.getParameter("endTime");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try {
            beginTime = new Timestamp(simpleDateFormat.parse(beginTimeStr).getTime());
            endTime = new Timestamp(simpleDateFormat.parse(endTimeStr).getTime());
        } catch (ParseException e) {
            System.out.println("[ERROR] 日期时间转换错误");
        }

        // 业务逻辑处理
        int statusCode = AppointmentConstant.STATUS_SUCCESS;
        int verificationStatus = verificationService.checkVerificationValidity(verification);
        if (verificationStatus == AppointmentConstant.STATUS_SUCCESS){

            int guestCheckStatus = guestService.guestRecord(id, name, tel);
            if (guestCheckStatus == AppointmentConstant.STATUS_SUCCESS) {

                Guest guest = guestService.getGuestByID(id);
                int recordStatus = spaceUsageRecordService.spaceUseRecord(guest, beginTime, endTime, userCount);
                if (recordStatus != AppointmentConstant.STATUS_SUCCESS)
                    statusCode = recordStatus;

            } else
                statusCode = guestCheckStatus;

        } else
            statusCode = verificationStatus;

        PrintWriter writer = resp.getWriter();
        writer.print("{\"status\":"+ statusCode +"}");
        writer.flush();
        writer.close();
    }
}
