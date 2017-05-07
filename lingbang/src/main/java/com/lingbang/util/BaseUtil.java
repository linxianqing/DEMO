package com.lingbang.util;

import java.util.UUID;

/**
 * Created by IntelliJ IDEA
 * User:    linxianqing
 * Date:    2017/5/4
 * Email:   linxianqinwork@qq.com
 */
public class BaseUtil {
    private BaseUtil() {
        throw new Error("请不要实例" + this.getClass().getName());
    }

    private static UUID uuid = UUID.randomUUID();

    public static String getUUID() {
        return UUID.randomUUID().toString();
    }
}
