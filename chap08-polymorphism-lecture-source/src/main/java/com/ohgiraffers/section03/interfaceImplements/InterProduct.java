package com.ohgiraffers.section03.interfaceImplements;

public interface InterProduct extends ParentInterProduct, AnotherInterProduct {
    
    /* 설명. 상수 필드 */
    public static final int MAX_NUM = 100;
    int MIN_NUM = 1;
    
    /* 설명. 추상 메소드 */
    public abstract void nonStaticMethod(int num);
    void nonStaticMethod2();

    /* 설명. JDK 1.8부터 추가된 body가 있는 메소드들 */
    /* 설명. static 메소드 */
    public static void staticMethod() {

    }

    /* 설명. non-static 메소드 */
    public default void defaultMethod() {

    }

    /* 설명. private 접근 제어자 메소드 */
    private void privateMethod() {

    }
}
/* 필기.
 *  인터페이스는 생성자를 가지지 않는다.
 *  클래스가 아니니까...
 *  추상 메소드를 강제로 오버라이딩하도록 만드는 강력한 규약.
 *  인터페이스는 프로그램의 기능과 상수를 정의하고 이를 다양한 클래스로 구현하기 위해 작성한다.
 *
 * 필기.(인터페이스 문법)
 *  public static final / public abstract는 고정(지동 생성)
 *  부모 인터페이스를 상속받을 수 있다.
 *  인터페이스끼리는 다중 상속이 가능하다.
 *  인터페이스에서 상속을 받으면 클래스에서 구현할 때는 모든 인터페이스를 삽입하지 않아도 된다.
 *  Product 클래스로 생성되는 객체는 인터페이스 포함 총 5개의 타입을 가진다.(다형성)
 *  JDK 1.8부터 바디있는 메소드 추가됨.
* */