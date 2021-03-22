package edu.tyut.selaba2.management.utils;

import edu.tyut.selaba2.management.constant.QQRobotConstant;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MD5Util {

    private MD5Util() {
    }

    private static final char[] hexChar = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'a', 'b', 'c', 'd', 'e', 'f'
    };

    /**
     * 获取一段字符串的MD5
     *
     * @param msg 文本信息
     * @return MD5值
     */
    public static String getHash(String msg) {

        // 获取 MD5 生成工具
        String hashType = "MD5";
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance(hashType);
        } catch (NoSuchAlgorithmException e) {
            System.err.println("[ERROR] 无法正常获取加密对象");
            return "";
        }

        byte[] bytes = QQRobotConstant.SECRET.getBytes();
        if (md5 != null)
            md5.update(bytes, 0, bytes.length);
        else
            return "";
        return toHexString(md5.digest());

    }

    /**
     * 内部成员
     *
     * @param b MD5的字节数组
     * @return MD5值
     */
    private static String  toHexString(byte[] b) {
        StringBuilder sb = new StringBuilder(b.length * 2);
        for (byte value : b) {
            sb.append(hexChar[(value & 0xf0) >>> 4]);
            sb.append(hexChar[value & 0x0f]);
        }
        return sb.toString();
    }

}