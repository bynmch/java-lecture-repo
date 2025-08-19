package com.ohgiraffers.section01.file;

import java.io.File;
import java.io.IOException;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 입출력 스트림에 대해 이해하고, 파일을 대상으로 하는 FileInputStream을 이해하기 위해서
                    File 객체 활용해보기 */
        File file = new File("src/main/java/com/ohgiraffers/section01/file/test.txt"); //프로젝트 이름기준 상대경로

        try {
            boolean isSuccess = file.createNewFile();
            System.out.println("파일 생성 여부: " + isSuccess
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("파일의 크기: " + file.length() + "byte"); // 영어 1바이트, 한글 3바이트
        System.out.println("파일의 경로: " + file.getPath());
        System.out.println("현재 파일의 상위 경로: " + file.getParent());
        System.out.println("파일의 절대 경로: " + file.getAbsolutePath());

        boolean isDeleted = file.delete();
        System.out.println("파일 삭제 여부: " + isDeleted);
    }
}
/* 필기.
 *  파일은 따로 존재하고 인식시키기 위해 객체로 만드는 것.
 *  File객체로 파일을 만드는 대표적인 예) 로그파일
 *
 * File 클래스는 파일을 다루기 위한 클래스이다.
 * file을 File 객체로 만들어 File클래스 내 존재하는 파일을 다루는 다양한 기능(메소드)를 사용할 수 있다.
 * io패키지 내에 있는 클래스에는 예외 상황을 발생시키는 메소드가 많다.
* */