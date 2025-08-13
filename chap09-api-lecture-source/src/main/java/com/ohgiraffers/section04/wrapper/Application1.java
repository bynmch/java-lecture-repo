package com.ohgiraffers.section04.wrapper;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. Wrapper클래스에 대해 이해할 수 있다. */
        int intValue = 20;

        /* 설명. 기본 자료형을 Wrapper 클래스 자료형으로 변환할 수 있다.(Boxing) */
        Integer boxing = Integer.valueOf(intValue);
        Integer autoBoxing = intValue; // 오토박싱 auto-boxing

        anythingMethod(intValue);

        /* 설명. Wrapper 클래스의 객체 주소값 확인 */
        Integer integerTest = 30;
        Integer integerTest2 = 30;
        System.out.println("== 비교: " + (integerTest == integerTest2));
        System.out.println("equals() 비교: " + integerTest.equals(integerTest2));
        System.out.println("integerTest 주소: " + System.identityHashCode(integerTest2));
    }

    private static void anythingMethod(Object obj) {
        /* 설명.
         *  int -> Integer(auto-boxing) -> Object(polymorphism)
         *  Object's toString() -> Integer's toString() (dynamic binding)
        * */
        System.out.println("obj: " + obj);
    }
}
