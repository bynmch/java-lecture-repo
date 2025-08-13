package com.ohgiraffers.section02.abstractclass;

public class Application {

    public static void main(String[] args) {

        Phone smartPhone = new Phone();

        /* 설명. 객체를 생성할 수 없는 불완전한 클래스로서의 추상 클래스 */
//       Product product = new Product();    // 객체 생성 불가능하다. 추상 클래스가 되면 생성자를 통한 객체를 생헝할 수 없다.

        smartPhone.abstractMethod();
        smartPhone.nonStaticMethod();
        smartPhone.staticMethod();
        Product.staticMethod();

        Product p = new Phone();            // 부모 타입 변수에 자식 객체를 담을 수 있는 다형성
        p.abstractMethod();
        p.nonStaticMethod();
    }
}
