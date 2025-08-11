package com.ohgiraffers.section01.extend;

public class RacingCar extends Car{

    /* 설명. 부모로부터 물려받은 메소드들의 기능 재정의 */
    public void run() {
        System.out.println("레이싱 자동차가 달립니다. 쌔애애애앵~");
    }

    public void soundHorn() {
        System.out.println("레이싱카는 경적따위 울리지 않습니다.");
    }
}

/* 필기.
 *  부모로부터 받은 메소드를 재정의 할 수 있다. = 오버라이딩 (= 기능 재정의)
* */