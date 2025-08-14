package com.ohgiraffers.section03.uses;

import java.io.*;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. try-with-resource구문을 이해하고 활용할 수 있다.(feat. finally를 안 쓴다. */
        try (BufferedReader br = new BufferedReader(new FileReader(new File("test.dat")))) {
            
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
/* 필기.
 *  try블럭에 쓰인 객체생성코드를 try블럭이 아닌 소괄호에 적으면 IOException을 알아서 작성해준다.
 *  소괄호 부분이 마치 finally의 ~close()까지 포함되는 것과 같음.
* */