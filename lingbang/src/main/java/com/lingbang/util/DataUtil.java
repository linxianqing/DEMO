package com.lingbang.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by IntelliJ IDEA
 * User:    linxianqing
 * Date:    2017/5/4
 * Email:   linxianqinwork@qq.com
 */
public class DataUtil {
    private DataUtil() {
        throw new Error("请不要实例" + this.getClass().getName());
    }
    public static String getData() {
        SimpleDateFormat bartDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        return bartDateFormat.format(date).toString();
    }
}
