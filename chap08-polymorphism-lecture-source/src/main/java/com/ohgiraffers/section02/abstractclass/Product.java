package com.ohgiraffers.section02.abstractclass;

/* 설명. 0개 이상의 추상 메소드가 있을 때 추상 클래스가 될 수 있다.(1개 이상일 때는 반드시 추상 클래스가 된다.)  */
public abstract class Product {

    private int nonStaticField;
    private static int staticField;

    /* 설명. 자식 타입의 객체를 위해서는 쓰이는 생성자 */
    public Product() {
    }

    public void nonStaticMethod() {}
    public static void staticMethod() {}

    /* 설명. 추상 메소드(메소드의 바디(body, 중괄호)가 없음), abstract라는 키워드 사용, 불완전 메소드 */
    public abstract void abstractMethod();
}
/* 필기.
 *  일종의 규약을 가지는 클래스(자식 클래스에게 메소드를 완성시키라는 강제성)
 *  부모의 불완전 메소드를 호출하면 안되니 부모 객체를 만들 수 없도록 한다.
 *  불완전 메소드의 {} 구현부를 은닉화(자식 클래스에서 오버라이딩)하는 목적을 실현할 수 있다.
* */