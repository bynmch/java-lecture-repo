package com.ohgiraffers.section01.polymorphism;

public class Application1 {
    public static void main(String[] args) {
        
        /* 수업목표. 다형성과 타입 형변환에 대해 이해할 수 있다. */
        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();

        System.out.println();

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();

        System.out.println();

        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();

        System.out.println();

        Animal an1 = new Animal();  // 다형성 적용되지 않음.
        Animal an2 = new Tiger();   // 다형성 적용됨.(Animal) new Tiger() like, up casting
        Animal an3 = new Rabbit();  // 다형성 적용됨.

        Object obj = new Animal();  // 다형성 적용됨.

        /* 설명. Animal은 Tiger 또는 Rabbit 타입이 아니다. */
//        Tiger tr = new Animal();  // 다형성 적용되지 않음.
    }
}
