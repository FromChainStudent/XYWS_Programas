package com.example.administrator.xyws_program.util;

/**
 * Created by LENOVO on 2017/4/25.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeUils {
    public static String getDate(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd   HH:mm:ss");
        long newtime = Long.parseLong(date);
        String fa = dateFormat.format(new Date(newtime*1000));
        return fa;
    }
    public static String getDateday(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        long newtime = Long.parseLong(date);
        String fa = dateFormat.format(new Date(newtime*1000));
        return fa;
    }


}
