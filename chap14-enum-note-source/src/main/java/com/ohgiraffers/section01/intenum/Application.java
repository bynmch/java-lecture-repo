package com.ohgiraffers.section01.intenum;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 단순 정수 열거 패턴을 쓰고 단점을 이해할 수 있다.(enum 아닐 때) */
        int subject1 = Subject.JAVA;
        int subject2 = Subject.HTML;

        /* 설명. 1. 둘 다 같은 상수이자 숫자일 뿐 런타임 시점에는 구분할 수 없다. */
        if(subject1 == subject2) {
            System.out.println("두 과목은 같은 과목이다.");
        }

        /* 설명. 2. 런타임에는 숫자로만 처리되기 때문에 변수명에 쓰인 이름(과목명)을 충분히 활용할 수 없다. */
        Scanner sc = new Scanner(System.in);
        System.out.println("과목 번호를 입력하세요(0~2): ");
        int fieldNo = sc.nextInt();

        String subName = "";
        switch (fieldNo) {
            case Subject.JAVA: subName = "JAVA"; break;
            case Subject.MARIADB: subName = "MARIADB"; break;
            case Subject.JDBC: subName = "JDBC";
        }

        System.out.println("선택한 과목명은: " + subName + "입니다.");

        /* 설명. 3. 같은 클래스에 속한 상수들을 순회(반복자/반복문)할 수 없다.
         *          (필드가 총 몇개이고 어떤 것들이 있는지)
        * */

        /* 설명. 4. 타입의 안정성을 보장할 수 없다. */
        printSubject(Subject.JAVA);
        printSubject(10);
    }

    private static void printSubject(int java) {

    }
}
/* 필기.
 *  Subject타입을 활용할 수 없다.(예시에서 과목의 개념을 활용할 수 없다.)
 *  필드 및 필드명을 활용할 수 없다.
 *  타입의 안정성을 확보할 수 없다.
* */