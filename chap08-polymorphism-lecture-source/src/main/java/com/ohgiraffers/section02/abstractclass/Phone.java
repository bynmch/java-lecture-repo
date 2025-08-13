package com.ohgiraffers.section02.abstractclass;

public class Phone extends Product {

    public Phone() {
        super();
    }

    @Override
    public void abstractMethod() {
        System.out.println("오버라이딩 Good!");
    }
}
/* 필기.
 *  자식 클래스에서 오버라이딩하도록 강제성을 띈다.
* */