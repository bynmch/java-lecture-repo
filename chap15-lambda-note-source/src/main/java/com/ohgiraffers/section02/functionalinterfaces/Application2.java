package com.ohgiraffers.section02.functionalinterfaces;

import java.time.LocalDateTime;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class Application2 {

    public static void main(String[] args) {
        
        /* 수업목표. 표준 함수적 인터페이스 중 Supplier에 대해 이해하고 사용할 수 있다. */
        Supplier<LocalDateTime> supplier = new Supplier<>() {
            @Override
            public LocalDateTime get() {
                return LocalDateTime.now();
            }
        };
        System.out.println(LocalDateTime.now());
//                () -> LocalDateTime.now();
//        System.out.println(supplier.get());

        BooleanSupplier booleanSupplier = () -> {
            int random = (int) (Math.random() * 2);
            return random == 1 ? false : true;
        };

        System.out.println("랜덤 참/거짓 생성기: " + booleanSupplier.getAsBoolean());
    }
}
/* 필기.
 *  매개변수 없음
 *  두 줄 이상은 중괄호 필수
* */