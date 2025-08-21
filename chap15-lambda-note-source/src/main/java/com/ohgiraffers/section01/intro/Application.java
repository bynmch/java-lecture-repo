package com.ohgiraffers.section01.intro;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 람다식에 대해 이해하고 활용할 수 있다.(feat.Functional Interface) */
        /* 설명. 1. 인터페이스를 구현하는 클래스로 하위 구현체를 만드는 방법 */
        Calculator cal = new CalculatorImpl();
        System.out.println("10과  20의 합은: " + cal.sumToNumbers(10, 20));   //동적 바인딩 발생.

        /* 설명. 2. 익명 클래스를 활용한 방식 */
        Calculator cal2 = new Calculator() {
            @Override
            public int sumToNumbers(int first, int second) {
                return first + second;
            }
        };
        System.out.println("2와 3의 합은? " + cal2.sumToNumbers(2, 3));

        /* 설명. 3. 람다식을 활용한 방식 */
//        Calculator cal3 = (first, second) -> {return first + second;};
        Calculator cal3 = (first, second) -> first + second;
        System.out.println("5와 7의 합은: " + cal3.sumToNumbers(5, 7));

    }
}
/* 필기.
 *  추상메소드가 한 개뿐인 인터페이스일 경우에만 쓰임.
 *
 *  람다식은 익명함수로, 함수형 인터페이스를 활용해 하위 구현체의 메소드를 오버라이딩하는 방식으로 작성한다.
 *  이때, 반드시 함수형 인터페이스는 추상메소드가 하나만 존재하므로 익명함수가 성립된다.
 *
 *  표현식 = 하나의 리터럴(값)이 나오는 식.
 *
 * 람다식 기본 규칙
 *  1. 구현하는 메소드의 body부분에서 실행 구문이 하나일 경우 중괄호가 생략할 수 있다..
 *  2. 실행될 구문이 표현식일 경우(return을 유추할 수 있는 경우)에는 return이 생략할 수 있다.
 *  3. 매개변수의 소괄호는 기본적으로는 생략할 수 없지만, 매개변수가 한 개라면 소괄호도 생략할 수 있다.
* */