package com.ohgiraffers.section01.literal;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 값을 직접 연산하여 출력할 수 있다. */
        System.out.println("====== 정수와 정수의 연산 ======");
        System.out.println(123 + 456);  // 한 줄 복사: ctrl + d
        System.out.println(123 - 456);
        System.out.println(123 * 456);
        System.out.println(123 / 456);
        System.out.println(123 % 456);

        System.out.println("====== 실수와 실수의 연산 =======");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 1.0);     // 실수는 정확하지 않고 근사한 값이다.

        System.out.println("====== 정수와 실수의 연산 ======");
        System.out.println(123 / 5);    // 정수끼리의 나눗셈은 정수가 나온다.


        System.out.println("====== 문자와 정수의 연산 ======");
        System.out.println('a' + 1);    // 결과는 숫자로 나온다.
        System.out.println((char) ('a' + 1));   // 문자로 다시 바꿀 수도 있다. (이후에 배움. 타입 캐스팅(타입 변환)
        System.out.println('a' % 2);  

        System.out.println("====== 문자열과 문자열의 연산 ======");
        System.out.println("Hello" + " World!~");
//        System.out.println("Hello" - " World!~");   // 문자열은 뺄셈은 안됨.

        System.out.println("====== 문자열과 다른 형태의 값 연산 ======");
        System.out.println("hello" + 123);      // "hello" + "123"
        System.out.println("hello" + true);     // "hello" + "true"
        System.out.println(123 + 1 + "hello " + 123.0 + 2);     // "124" + "hello " + "123.0" + "2"
        System.out.println(123 + 1 + "hello " + (123.0 + 2));   // 소괄호 내 연산이 먼저 수행. "124" + "hello " + "125.0"




        /* 필기. 정수 나눗셈은 실수값 안 나오니 실수 나눗셈 하기 */
    }
}
