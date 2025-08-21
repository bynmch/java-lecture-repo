package com.ohgiraffers.section03.reference;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 기존에 존재하는 메소드를 참조해 람다식을 적용할 수 있다.(feat. 굳이 람다식으로 적용할 필요없음) */
        BiFunction<String, String, Boolean> biFunction;

        String str1 = "METHOD";
        String str2 = "METHOD";

        boolean result = false;

        biFunction = String::equals;    //객체가 정해지지 않은 경우 non-static이더라도 클래스명으로 메소드 호출 가능
//        biFunction = (x, y) -> x.equals(y);
        result = biFunction.apply(str1, str2);
        System.out.println("result = " + result);

        /* 설명. non-static메소드를 참조하는 경우 클래스명이 아닌 참조변수를 활용할 수 있는 경우 */
        String prefix = "Hello ";
        List<String> names = Arrays.asList("Alice", "Bob");

        names.stream()
//                .map((name) -> prefix.concat(name))     //각 요소마다 람다식에 전달되어 람다식이 실행됨(그 결과를 Stream으로 만듦).
                .map(prefix::concat)                            //"prefix(객체의) concat메소드만 참조한다."
//                .forEach(name -> System.out.println(name));
                .forEach(System.out::println);
    }
}
/* 필기.
 *  메소드를 참조할 때에는 참조한 메소드를 호출하는 객체(prefix)가
 *  정해진 경우(참조변수(System.out))와 정해지지 않은 경우(클래스명(String))를 구분할 수 있어야 한다.
* */