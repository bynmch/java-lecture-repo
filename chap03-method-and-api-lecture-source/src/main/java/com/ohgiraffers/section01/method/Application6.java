package com.ohgiraffers.section01.method;

public class Application6 {
    public static void main(String[] args) {
        
        /* 수업목표. 다른 클래스에 작성한 메소드를 활용할 수 있다. */
        Calculator calc = new Calculator();

        int first = 100;
        int second = 50;

        /* 설명. 덧셈기능 */
        System.out.println("두 수의 합은? " + calc.plusTwoNumbers(first, second));

        /* 설명. 최소값 */
        System.out.println("두 수 중 최소값은? " + calc.minTwoNumbers(first, second));

        /* 설명. 최대값 */
        System.out.println("두 수 중 최대값은? " + Calculator.maxTwoNumbers(first, second));
    }
}
/* 필기.
 *  static메소드와 non-static 메소드의 호출방법은 다르다.
 *  어떻게.... -> 클래스명.메소드명()
 *  static메소드가 같은 클래스에 있으면 생략가능
* */