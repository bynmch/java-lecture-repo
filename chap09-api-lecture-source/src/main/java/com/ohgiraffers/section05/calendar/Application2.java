package com.ohgiraffers.section05.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. java.util.Calendar 클래스 사용법에 대해 이해할 수 있다. */
        /* 설명.
         *  java.util.Date 대비 개선점
         *  1. Timezone과 관련된 기능이 추가됨.
         *  2. 윤년 관련기능 내부적으로 추가
         *  3. 날짜 및 시간을 필드 개념으로 바꿔서 불필요한 메소드 갯수를 줄임
        * */

        java.util.Date today = new java.util.Date();
        java.util.Calendar calendar = java.util.Calendar.getInstance();

        System.out.println("today = " + today);
        System.out.println("calendar = " + calendar);

        int year = 2025;
        int month = 8 - 1; // 0~11 인덱스로 저장
        int dayOfMonth = 13;
        int hour = 11;
        int min =32;
        int sec = 30;

        Calendar current = new GregorianCalendar(year, month, dayOfMonth, hour, min, sec);
        System.out.println("current: " + current);

        System.out.println("current year: " + current.get(Calendar.YEAR));
        System.out.println("current year: " + current.get(1));
        System.out.println("current month: " + (current.get(Calendar.MONTH) + 1));
        System.out.println("current dayOfMonth: " + current.get(Calendar.DAY_OF_MONTH));
        System.out.println("current dayOfWeek: " + current.get(Calendar.DAY_OF_WEEK));
        System.out.println("current hour: " + current.get(Calendar.HOUR));
        System.out.println("current minute: " + current.get(Calendar.MINUTE));
        System.out.println("current second: " + current.get(Calendar.SECOND));
        System.out.println("current AM/PM: " + current.get(Calendar.AM_PM));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDateString = sdf.format(new java.util.Date(current.getTimeInMillis()));
        System.out.println("currentDateString = " + currentDateString);


    }
}
