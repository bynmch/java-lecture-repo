package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator;

import java.sql.Date;

public class Application1 {
    public static void main(String[] args) {
        
        /* 수업목표. 패키지에 대해 이해할 수 있다. */
        /* 설명.
         *  1. 클래스의 소속
         *  2. 원래는 클래스명의 일부분
         *  3. 경우에 따라 생략 가능(import가 되었거나 같은 패키지의 클래스일 경우)
        * */

        Calculator cal = new Calculator();
//        com.ohgiraffers.section01.method.Calculator calc = new com.ohgiraffers.section01.method.Calculator();
        Calculator cal2 = new Calculator();

        System.out.println("cal의 합계: " + cal.plusTwoNumbers(100, 10));
        System.out.println("cal2의 합계: " + cal2.plusTwoNumbers(100, 10));
        System.out.println("static 메소드도 호출: " + Calculator.maxTwoNumbers(20, 10));

        /* 설명.  Date형을 통한 패키지 구분 확인*/
        java.util.Date utilDate = new java.util.Date(0L);
//        java.sql.Date sqlDate = new java.sql.Date(0L);
        Date sqlDate = new Date(0L);
    }
}
/* 필기.
 *   클래스는 원래 패키지이름을 포함하고 있다.
 *   import는 클래스는 해당 패키지에 존재하는 것이라고 정의내리는 것.
 *   import를 가져오는 것이라 해석하지 않는다.
 *   다른 패키지의 클래스도 줄여서 쓸 수 있다.
 *  */