package edu.tyut.selaba2.management.listener;

import edu.tyut.selaba2.management.task.VerificationGenTask;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 定时任务，每隔固定时间生成一次验证码
 */
public class VerificationCodeGenListener implements ServletContextListener {

    private final VerificationGenTask code = new VerificationGenTask();

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        code.startTask();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        code.endTask();
    }
}
