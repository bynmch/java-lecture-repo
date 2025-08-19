package com.ohgiraffers.section02.enumtype;

public class Application {

    public static void main(String[] args) {

        /* 설명. 1. enum 타입은 최초 사용 시 singleton 객체가 주입되며 같은 값에 대해서 동일비교가 가능하다. */
        /* 설명.
         *  열거 타입으로 선언된 인스턴스는 싱글톤으로 관리되며 인스턴스가 각각 한 개임을 보장한다.
         *  작성한 순서에 따라 각각 다른 인스턴스가 생성되어 할당되며 최초 호출 때 enum의 생성자를
         *  활용해 생성된다.(lazy singleton 개념)
        * */
        Subject subject1 = Subject.JAVA;
        Subject subject2 = Subject.HTML;
        Subject subject3 = Subject.JAVA;

//        if (subject1 == subject2) {
        if (subject1 == subject3) { //실제로 같은 객체이다.
            System.out.println("두 과목은 같은 과목이다.");
        } else {
            System.out.println("두 과목은 다른 과목이다.");
        }

        /* 설명. 2. 상수 필드명을 문자열로 변경하기 쉽다. */
        System.out.println(Subject.JAVA.name());
        System.out.println(Subject.HTML.name());
        System.out.println(Subject.CSS.toString());

        /* 설명. 3. 상수 필드를 순회하며 연속처리할 수 있다. */
        Subject[] subjects = Subject.values();
        for (Subject subject : subjects) {
            System.out.println(subject.toString());
            System.out.println(subject.name());
            System.out.println(subject.ordinal());  //enum타입의 상수 필드의 순서를 인덱스 개념으로 활용할 수 있다.
        }

        /* 설명. 4. 타입의 안정성을 보장한다. */
        printSubject(Subject.JAVA);
//        printSubject(10);                           //Subject타입이 아니라면 전달할 수 없다.
    }

    private static void printSubject(Subject subject) {
    }
}
/* 필기.
 *  필드 하나가 객체이다
 *  동등 비교가 아닌 동일 비교이기 때문에 == 연산자를 사용한다.
 *  lazy singleton 객체이다.
 *  toString(): 오버라이딩해서 원하는 형태로 이름을 사용하고 싶다.
 *  ordinal(): 마치 배열처럼 열거된 순서를 반환한다.
 *  enum타입에 추가적인 코드가 있을 경우 세미콜론을 빼먹지 않는다.
 * */