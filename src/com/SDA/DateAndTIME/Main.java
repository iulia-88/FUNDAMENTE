package com.SDA.DateAndTIME;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        int ora = localTime.getHour();
        int minute = localTime.getMinute();
        int secunde = localTime.getSecond();


        System.out.println(ora + ":" + minute + ":" + secunde);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        int day = localDate.getDayOfMonth();
        int month = localDate.getMonthValue();
        int year = localDate.getYear();

        System.out.println(day + "/" + month + "/" + year);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        String result = localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(result);
    }


}
