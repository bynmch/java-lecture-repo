package com.ohgiraffers.section01.method;

public class Application3 {

    /* 설명. 전역변수(메소드들에서 쓸 수 있는 변수) */
    static int global = 10;

    public static void main(String[] args) {

        /* 수업목표. 메소드 전달인자(argument)와 매개변수(parameter)에 대해 이해하고 활용할 수 있다. */
        /* 설명.
         *  변수를 선언한 위치에 따라 변수는 구별해서 부를 수 읻사.
         *  1. 지역변수
         *  2. 전역변수
         *  3. 매개변수
         *  4. 클래스 변수
         *  5. 인스턴스 변수
        * */
        System.out.println("전역 변수: " + global);

        int local = 20;
        System.out.println("지역 변수: " + local);

        int age = 10;

        Application3 app = new Application3();
        app.testMethod(age);        // 메소드 선언부의 age와 다른 지역변수이다. 가독성 측면에서 의미가 같기에 같은 것으로 부여했을 뿐
    }
    
    /* 설명. int age는 매개변수이자 지역변수 */
    public void testMethod(int age) {
        System.out.println("당신의 나이는  " + age + "세 입니다.");
    }
}
/* 필기. 
*   메소드 중괄호 안의 변수 - 지역변수
*   클래스 영역의 변수 - 전역변수 
*   소괄호 안의 변수 - 매개변수, 메소드에서만 쓸 지역변수이기도 하다.
* */
