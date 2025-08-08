package com.ohgiraffers.section04.constructor;

public class Application {
    public static void main(String[] args) {

        User user1 = new User();
        System.out.println(user1.getInfo());

        User user2 = new User("user01", "pass01", "홍길동");
        System.out.println(user2.getInfo());
    }
}
/* 수업목표.  생성자 함수가 무엇인지 이해하고 선언 및 호출할 수 있다. */
/* 필기. 
 *  User()는 기본 생성자이다.
 *  생성자의 이름은 클래스 명과 동일
 *  매개변수가 있는 생성자
 *  객체가 생성될 때 초기화 하고 싶은 값을 매개변수로 가지는 생성자
* */