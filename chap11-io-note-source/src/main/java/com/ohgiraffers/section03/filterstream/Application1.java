package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. BufferedWriter와 BufferedReader에 대해 이해하고 사용할 수 있다. */
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter((new FileWriter("src/main/java/com/ohgiraffers/section03/filterstream/testBuffered.txt")));
            
            /* 설명. 마지막에 덧씌운 보조 스트림의 메소드를 활용한다. */
            bw.write("눈이\n");
            bw.write("하늘에서\n");
            bw.write("내려온다\n");

            /* 설명. 내부적으로 버퍼가 다 차지 않으면 데이터의 출력이 일어나지 않는다.
             *      원하는 시점에 출력을 할 때는 flush()를 수동으로 작성해야 한다.
            * */
            bw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                
                /* 설명. 출력 스트림이 close()될 때는 내부적으로 flush()가 동작한다. */
                if (bw != null)
                    bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("src/main/java/com/ohgiraffers/section03/filterstream/testBuffered.txt"));

//            String oneLine = br.readLine();
//            System.out.println(oneLine);
            String input = "";
            while((input = br.readLine()) != null) {
                System.out.println(input);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
/* 필기.
 *  파일 객체와 통신하기 위해 기반 스트림을 사용하고 보조 스트림을 덧씌워 보조 스트림의 기능을 사용하게 한다.
 *  File 클래스는 파일을 인식 시키기 위함일뿐 기능이 없어서(?)
 *  버퍼의 사이즈를 모두 채우기까지 기다렸다가 출력할 때 버퍼만 거치도록 하면 속도가 빨라진다.
 *  close()메소드를 쓰면 스트림을 닫을 때 버퍼가 차지 않더라도 데이터가 내보내지는데 안 쓰면 내보내 지지 않음.(파일에 작성되지 않음.)
 *  flush()메소드는 버퍼에 있는 데이터를 원하는 시점(코드 내 지점)에 내보내는 메소드이다.
 *
* */