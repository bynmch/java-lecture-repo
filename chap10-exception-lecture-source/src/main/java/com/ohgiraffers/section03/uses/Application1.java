package com.ohgiraffers.section03.uses;

import java.io.*;

public class Application1 {

    public static void main(String[] args) {
        
        /* 수업목표. 예외처리를 많이 사용하는 io패키지와 관련된 try-catch 구문을 이해할 수 있다. */
        /* 설명.
         *  예외처리를 가장 많이 사용하게 되는 상황(io패키지 관련)에서 try-catch구문을 실제 상황과
         *  유사하게 사용해 보자.
         *  (아직 배우지 않았으니 입출력 관련 구문을 하나 하나를 신경쓰기 보다 전체 흐름과 구조에 신경쓰자.)
        * */

        System.out.println(new File("test.dat").getAbsolutePath());

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(new File("test1.dat")));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {

            /* 설명.
             *  예외처리 구문과 상관없이 반드시 수행해야 하는 경우 finally에 작성하는데
             *  보통 사용한 자원(resource)를 반납하는 용도로 사용하게 된다.
            * */
            try {

                /* 설명.
                 *  입출력에서 사용한 스트림(통로)을 닫아주는 용도의 메소드
                 *  NPE를 신경써야 된다.
                * */
                if(br != null) br.close(); // NPE(NullPointerException) 방지 코드
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
/* 필기.
 *  io패키지의 File클래스를 import하여
 *  파일을 인지할 수 있게 File 타입의 객체를 만듦.
 *  File 객체는 파일의 경로를 읽을 수 있는 기능(method())이 있다.
 *  BufferedReader객체와 FileReader객체는 (try구문 안의)리소스를 점유하고 있는 중?
 *
 *  finally문은 주로 try문에서 메소드나 입출력 스트림을 사용할 때 리소스를 반환하는 데에 사용된다.
 *  io패키지에는 예외상황을 발생시키는 메소드가 많다.
 *  대표적인 예시로 try문의 파일 입출력 스트림을 활용하여 리소스를 반환(close())하는 경우가 있다.
 *
* */