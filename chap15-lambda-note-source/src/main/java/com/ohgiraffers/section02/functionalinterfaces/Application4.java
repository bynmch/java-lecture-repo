package com.ohgiraffers.section02.functionalinterfaces;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Application4 {

    public static void main(String[] args) {

        /* 수업목표. 수업목표 표준 함수적 인터페이스 중 Opreator에 대해 이해하고 사용할 수 있다. */
        UnaryOperator<String> unaryOperator = new UnaryOperator<String>() {
            @Override
            public String apply(String str) {
                return "Hello " + str;
            }
        };
        System.out.println("Hello " + "World!");
//                str -> "Hello " + str;
//        System.out.println(unaryOperator.apply("World!"));

        BinaryOperator<String> binaryOperator = (str1, str2) -> str1 + str2;
        System.out.println(binaryOperator.apply("Nice to ", "meet u!"));
    }
}
