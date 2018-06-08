package wuliu.centrin.com.gp.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by lile on 2018/6/5.
 */

public class MD5Utils {
    /**
     * ʹ��md5���㷨���м�??
     */
    public static String md5(String plainText) {
        byte[] secretBytes = null;
        try {
            secretBytes = MessageDigest.getInstance("md5").digest(
                    plainText.getBytes());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("û��md5����㷨??");
        }
        String md5code = new BigInteger(1, secretBytes).toString(16);// 16��������
        // �����������δ��32λ��??Ҫǰ�油0
        for (int i = 0; i < 32 - md5code.length(); i++) {
            md5code = "0" + md5code;
        }
        return md5code;
    }


    /**
     * md5加密的工具类
     *
     * @param password
     * @return
     */
    public static String encode(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("md5");
            byte[] results = digest.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for(byte b : results){
                int number = b&0xff;
                String hex = Integer.toHexString(number);
                if(hex.length()==1){
                    sb.append("0");
                }
                sb.append(hex);
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
