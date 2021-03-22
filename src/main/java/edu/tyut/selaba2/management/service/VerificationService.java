package edu.tyut.selaba2.management.service;

import edu.tyut.selaba2.management.constant.AppointmentConstant;
import edu.tyut.selaba2.management.domain.VerificationCode;

/**
 * 验证服务
 *
 * @author KlenKiven
 */
public class VerificationService {

    private final VerificationCode ver = VerificationCode.getInstance();

    /**
     * 验证验证码是否正确
     *
     * @param verification 验证码
     * @return 状态码
     */
    public int checkVerificationValidity(String verification) {

        if ( ! verification.equals(ver.getVerificationString()))
            return AppointmentConstant.STATUS_FAIL_VERIFICATION;

        return AppointmentConstant.STATUS_SUCCESS;
    }

}
