package com.ohgiraffers.section01.extend;

public class Car {
    private boolean runingStatus;

    public Car() {
        System.out.println("부모 클래스의 기본 생성자 호출됨...");
    }

    public void soundHorn() {
        if (runingStatus) System.out.println("빵~! 빵~!");
        else System.out.println("주행 중이 아니라면 경적을 울릴 수 없습니다.");
    }

    public void run() {
        runingStatus = true;
        System.out.println("자동차가 달리기 시작합니다.");
    }

    public void stop() {
        runingStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }
}
/* 필기.
 *  상속을 표현할 때는 클래스명 선언부에 extends [부모 클래스명]으로 선언한다.
 *  자식 클래스의 생성자를 선언하면 굳이 적지 않더라도 부모 클래스의 생성자를 의미하는 super()가
 *  자식 클래스의 생성자 블록 내에 자동으로 선언된다.
 *  자식 클래스에서는 부모 클래스에서 물려받은 메소드와 더불어 메소드를 추가로 생성할 수 있다.
 *  힙메모리 내 객체 생성 순서: Object -> Car -> FireCar
 *  부모로부터 받은 메소드를 재정의 할 수 있다. = 오버라이딩 (= 기능 재정의)
 * */