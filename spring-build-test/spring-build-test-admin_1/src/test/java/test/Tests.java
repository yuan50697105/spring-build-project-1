package test;

import cn.hutool.core.date.DateUtil;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class Tests {
    @Test
    void t1() {
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);
        Date date = new Date(currentTimeMillis);
        System.out.println("date = " + date);
        String format = DateUtil.format(date, "yyyy-MM-dd HH:mm:ss");
        System.out.println("format = " + format);
        String format1 = DateUtil.format(date, "yyyy-MM-dd hh:mm:ss aa");
        System.out.println("format1 = " + format1);
    }
}