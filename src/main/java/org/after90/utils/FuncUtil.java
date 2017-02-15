package org.after90.utils;

/**
 * Created by zhaogj on 15/02/2017.
 */
public class FuncUtil {
    // 返回指定长度的随机数
    public static String getRandom(int nLength) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < nLength; i++) {
            sb.append((int) (Math.random() * 10));
        }
        return sb.toString();
    }
}
