package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. 표준입출력(콘솔과의 입출력) 스트림을 이해하고 활용할 수 있다. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("문자열 입력: ");

        try {
            String input = br.readLine();
            System.out.println("input = " + input);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        BufferedWriter bw = null;
        OutputStreamWriter osw = null;
        osw = new OutputStreamWriter(System.out);
        bw = new BufferedWriter(osw);

        try {
            bw.write("println이 좋은 거구나");
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
               if(bw != null) bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
/* 필기.
 *  System.in: 콘솔 입력스트림의 기반 스트림격
 *  스트림의 업그레이드: Scanner가 close()해줌.
 *  최외각의 보조스트림만 닫으면 내부의 스트림들도 모두 닫힘(리소스가 반환됨).
* */