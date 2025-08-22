package com.ohgiraffers.section02.functionalinterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Application3 {

    public static void main(String[] args) {

        /* 수업목표. 표준 함수적 인터페이스 중 하나인 Function에 대해 이해하고 사용할 수 있다. */
        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String str) {
                return Integer.parseInt(str);
            }
        };
        String str = "12345";
        System.out.println(Integer.parseInt(str));
//                str -> Integer.valueOf(str);
//        System.out.println(function.apply(str));
//        System.out.println(function.apply(str) instanceof Integer);

        BiFunction<String, String, Integer> biFunction =
                (str1, str2) -> Integer.valueOf(str1) + Integer.valueOf(str2);
        System.out.println(biFunction.apply("123", "456"));

    }
}
/* 필기.
 *  매개변수, 반환 있음
* */