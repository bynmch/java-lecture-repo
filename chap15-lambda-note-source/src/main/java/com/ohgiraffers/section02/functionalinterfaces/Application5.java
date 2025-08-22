package com.ohgiraffers.section02.functionalinterfaces;

import java.util.function.Predicate;

public class Application5 {

    public static void main(String[] args) {

        /* 수업목표. 표준 함수적 인터페이스인 Predicate에 대해 이해하고 사용할 수 있다. */
        Predicate<Object> predicate =
//                new Predicate<>() {
//
//            @Override
//            public boolean test(Object value) {
//                return value instanceof String;
//            }
//        };
//        System.out.println("문자열인가? " + "123" instanceof String);
//        System.out.println("문자열인가? " + 123 instanceof String);
                value -> value instanceof String;
        System.out.println("문자열인가?" + predicate.test("123"));
        System.out.println("문자열인가?" + predicate.test(123));
        
    }
}
/* 필기.
 * 함수형 인터페이스 매개변수 및 반환형 정리
 *  1. Consumer: 매개변수 o, 반환: x
 *  2. Supplier: 매개변수 x, 반환: o
 *  3. Function: 매개변수 o, 반환: o
 *  4. Operator: 매개변수 o, 반환: o /매개변수와 반환형 타입 일치
 *  5. Predicate: 매개변수: o, 반환: o /반환형이 boolean형
* */