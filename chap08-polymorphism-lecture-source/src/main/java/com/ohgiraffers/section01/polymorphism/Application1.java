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

        an2.eat();              // 런타임 시점에는 오버라이딩된 자식 객체의 메소드가 동작(동적 바인딩)
        an3.eat();
//        an3.jump();           // 컴파일 시점에는 아직 an3는 정적 바인딩만 지원됨
        ((Rabbit)an3).jump();   // 강제로 알려주면(강제 다운 캐스팅) 추가 메소드 호출 가능

    }
}
/* 필기.
 *  자식 타입 객체면 부모 타입 변수에 대입 가능.
 *  컴파일 시점에는  부모 타입 변수가 자식 객체를 인지하지 못하고 있다.
 *  런타임 시점이 되어서야 자식 객체가 생성된다.
 *  컴파일 시점에 컴파일러가 인지하고 있는(프로그램 실행 전 인지하고 있는) 메소드를 정적 바인딩된 메소드라고 한다.
 *  런타임 시점에는 부모 클래스의 메소드와 오버라이딩된 메소드 모두 인식하고 실제로 실행하게 되면  오버라이딩된
 *  메소드를 호출하게 된다. => 동적 바인딩
 *  컴파일 시점에는 부모 타입의 변수로 자식의 추가적인 메소드를 호출할 수 없다. -> 호출하고자 한다면 다운 캐스팅이 필요하다.
 *  은닉화기술: 1. 필드 및 메소드 은닉(캡슐화) 2. 타입 은닉(다형성) 3. 구현 은닉
 *  캐스팅이란 코드레벨에서 문법검사기를 통과하기 위해 자료형을 맞춰주는 개념이다.
 *  다형성: 하위로 갈수록 타입이 많아지는 특성
 *  다형성을 적용하고 메소드를 오버라이딩하면 동적바인딩이 일어난다.
* */