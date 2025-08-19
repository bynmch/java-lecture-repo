package com.ohgiraffers.section03.map.run;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. Properties에 대해 이해하고 활용할 수 있다. */
        /* 설명. Properties -> XML -> Annotation -> yml(yaml) */
        Properties prop = new Properties();
        prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
        prop.setProperty("url", "jdbc:oracle:thin:@localhost:1521:xe");
        prop.setProperty("user", "swcamp");
        prop.setProperty("password", "swcamp");

        System.out.println("prop = " + prop);
        System.out.println();

        try {
//            prop.store(new FileOutputStream("driver.dat"), "jdbc driver");
            prop.storeToXML(new FileOutputStream("driver.xml"), "jdbc driver xml version");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Properties prop2 = new Properties();
        System.out.println("읽어오기 전: " + prop2);
        System.out.println();
        try {
//            prop2.load(new FileInputStream("driver.dat"));
            prop2.load(new FileInputStream("driver.xml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("==== 읽어와서 담긴 값 ====");
        System.out.println("드라이버: " + prop2.getProperty("driver"));
        System.out.println("경로: " + prop2.getProperty("url"));
        System.out.println("아이디: " + prop2.getProperty("user"));
        System.out.println("패스워드: " + prop2.getProperty("password"));
    }
}
/* 필기.
 *  환경설정용으로 주로 쓰이는 클래스.
 *  외부 리소스로 파일 입출력을 하는 데 용이한 클래스.
 *  모두 String 타입이므로 제네릭을 사용하지 않는 클래스.
 *  Hashtable의 하위 클래스.
* */