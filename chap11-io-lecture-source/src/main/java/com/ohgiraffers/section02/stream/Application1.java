package com.ohgiraffers.section02.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. FileInputStream을 이해할 수 있다. */
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt");

//            System.out.println((char)fis.read());
//            System.out.println((char)fis.read());
//            System.out.println((char)fis.read());
//            System.out.println((char)fis.read());

            int input = 0;
            while((input = fis.read()) != -1){
                System.out.println(input);
            } // nextToken()과 같다.

        } catch (FileNotFoundException e) {
            System.out.println("파일이 없거나 경로가 잘못됨");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(fis!=null) fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
/* 필기.
 *  경로를 잘못 쓰거나 파일이 없는 경우도 있기 때문에 예외 상황을 처리해주어야 한다.
 *  read()메소드를 호출할 때마다 byte를 쓰기 때문에 조건식에도 byte를 쓰고 실행문에도 byte를 쓰니
 *  한 루프당 2byte씩 읽는다. Token에 대해 이야기 하면서 이유를 설 명 해주심)
 *  변수에 담아서 사용할 것.
 *
 * Stream에는 바이트 단위로 처리하는 스트림과 문자 단위로 처리하는 기반 스트림이 나뉘어져 있다.
 * 스트림은 인코딩 방식에 따라 나위어져 있다.
 * 바이트 단위는 1바이트로 처리하며 영어, 숫자, 특수 기호만 가능
 * 문자 단위는 2바이트와 3바이트 체계로 인코딩하는 방식으로 나눌 수 있다.
 * 바이트 단위로 처리하는 스트림: InputStream / OutputStream
 * 문자 단위로 처리하는 스트림: Reader / Writer
 *
* */