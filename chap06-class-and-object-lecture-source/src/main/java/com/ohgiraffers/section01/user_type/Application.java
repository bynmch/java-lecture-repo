package com.ohgiraffers.section01.user_type;

import java.util.Arrays;

public class Application {
    public static void main(String[] test) {
        System.out.println(Arrays.toString(test));
        Member member1 = new Member();
        Member member2 = new Member();

        /* 설명. 사람 한 명씩 접근해 이름을 부여하는 느낌의 코드 */
        member1.name = "김철수";
        member2.name = "김영희";

        /* 설명. 김영희씨만 먼저 완성 */
        member2.age = 19;
        member2.gender = '여';
        member2.hobbies = new String[]{"볼링", "하키"}; // hobbies에는 다시 배열의 주소값이 들어간다.
        member2.id = "user02";
        member2.pwd = "pass02";

        System.out.println("김영희씨 이름과 나이: \n" + member2.name + "이고, 나이는 " + member2.age + "입니다.");

        int num = 1;
        testMethod(member2, num);
        System.out.println("개명 후 이름: " + member2.name);
        System.out.println("메소드를 호출할 때 넘겨준 num의 값: " + num);
    }

    private static void testMethod(Member m, int n) {
        System.out.println("개명하고 싶어!");
        m.name = "김용희";
        n += 10;
        System.out.println("메소드 안에서의 n의 값: " + n);
    }
}

/* 설명.
 *  객체지향프로그래밍(OOP)란?
 *  OOP(Object Oriented Programming language) / ex. java, python, c++,...
 *  : 추상화, 캡슐화, 상속, 다형성을 적용하여 "유지보수성"을 고려한 응집력 높고 결합도 낮은
 *    객체 위주의 개발방식을 추구하는 프로그래밍을 말한다.
 *
 *  설명.
 *   객체 지향의 특징(4대 특징)
 *   - 추상화(Abstraction)
 *   - 캡슐화(Encapsulation)
 *   - 상속(Inheritance)
 *   - 다형성(Polymorphism)
* */

/* 설명. 클래스 업시 여러 타입으로 여러 값을 관리할 경우 */
/* 설명.
 *  1. 많은 변수들을 따로 관리하기 어렵다. (한 묶음으로 생각하거나 코딩할 수 없다.)
 *  2. 메소드의 전달 인자로 전달할 값이 많아지므로 매개변수의 갯수가 늘어난다.
 *     (냄새나는 코드 -> 리펙토링의 징조)
 *  3. 메소드의 반환형으로는 하나의 타입만 가능하지만 클래스가 없이는 여러 속성을 반환하는 것이 불가능.
 * */

/* 설명.
 *  기본 자료형의 값을 넘길 때 vs 참조 자료형의 값을 넘길 때
 *  1. 기본 자료형은 메소드를 호출한 곳이 영향을 받지 않는다.
 *  2. 참조 자료형은 메소드를 호출한 곳이 영향을 받을 수 있다. (feat. 반환할 필요없다.)
 * */

/* 필기.
 *  new를 써서 힙영역에 객체를 올려놓는다. 각 칸은 크기가 다를 수 있다.
 *  stack에는 Member라는 타입의 member1라는 이름을 갖는 공간(변수)가 만들어진다.
 *  변수에는 객체가 존재하는 힙메모리영역의 주소가 들어간다.
 *  메모리에 올라간 객체를 인스턴스라고 부른다.
 *  new 연산자를 통해 클래스로 객체를 생성하는 과정을 '인스턴스화'라고 부른다.
 *  call by value vs call by reference (feat. java에서는?)
 *  유지보수를 위한...
 *  응집력이 높다: 모듈화가 잘 되어있다.
 *  결합도가 낮다: 엮여있는 코드가 적다.(여러 클래스 간 결합도 낮음)
 *  3대 특징: 캡슐화, 상속, 다형성 (면접 단골 질문)
 *
 * 필기.
 *  객체 지향 프로그래밍이란
 *  유지보수성을 위해 추상화, 캠슐화, 상속, 다형성의 특징을 통해
 *  응집력이 높고, 결합도가 낮은 객체 위주의 개발 방식을 추구하는 프로그래밍.
 *  여기서 응집력이 높다는 의미는 코드들 끼리 모듈화가 잘 되어있다는 것이고,
 *  결합도가 낮다는 것은 클래스들끼리 엮여있는 코드가 적다는 의미.
 *  추상화: 클래스를 구상하는 과정.
* */


