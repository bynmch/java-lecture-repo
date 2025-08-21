package com.ohgiraffers.section02.functionalinterfaces;

import java.time.LocalTime;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 표준 함수적 인터페이스 중 Consumer에 대해 이해하고 사용할 수 있다. */
//        Consumer<String> consumer = (str) -> {
//            System.out.println(str + "(이)가 입력됨");
//        };

        Consumer<String> consumer = str -> System.out.println(str + "(이)가 입력됨");

        consumer.accept("피카츄");
        consumer.accept("hello");

        BiConsumer<String, LocalTime> biConsumer =
                (str, time) ->
                        System.out.println(str + "(이)가 " + time +"에 입력됨");
        biConsumer.accept("Hello", LocalTime.now());

        ObjIntConsumer<Random> objIntConsumer =
                (random, bound) ->
                        System.out.println("1부터" + bound + "까지의 난수 발생: " + (random.nextInt(bound) + 1));
        objIntConsumer.accept(new Random(), 10);
    }
}
/* 필기.
 *
 *
 * 1. Math 활용(int형): (int)(Math.random() * 갯수) + 초기값
 * 2. Random 활용(double형): new Random().nextInt(갯수) + 초기값
 *
* */