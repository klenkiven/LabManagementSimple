package edu.tyut.selaba2.management.servlet;

import edu.tyut.selaba2.management.domain.VerificationCode;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GetVerificationServlet extends HttpServlet {

    VerificationCode ver = VerificationCode.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        // 跨域访问处理 作者NOTF
//        resp.setHeader("Access-Control-Allow-Origin","*");

        String verificationString =ver.getVerificationString();
        PrintWriter writer = resp.getWriter();
        writer.print(verificationString);
        writer.flush();
        writer.close();
    }
}
