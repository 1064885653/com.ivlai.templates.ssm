package com.ivlai.templates.ssm.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {

    /**
     * 打印自定义时间格式的日志信息
     *
     * @return 打印的日志信息
     */
    public static String WriteTimeLog(String timeFormat, String log) {
        String date = new SimpleDateFormat(timeFormat).format(new Date());
        String logInfo = "[" + date + "] " + log;
        System.out.println(logInfo);
        return logInfo;
    }

    /**
     * 打印 yyyy-MM-dd HH:mm:ss 时间格式的日志信息
     *
     * @return 打印的日志信息
     */
    public static String WriteTimeLog(String log) {
        return WriteTimeLog("yyyy-MM-dd HH:mm:ss", log);
    }


}
