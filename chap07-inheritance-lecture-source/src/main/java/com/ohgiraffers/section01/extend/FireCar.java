package com.ohgiraffers.section01.extend;

public class FireCar extends Car {

    /* 설명. 자식 클래스의 생성자 */
    public FireCar() {
        super(); // 안적어도 자동 생성됨(모든 클래스에서도 적용)
        System.out.println("FireCar 클래스의 기본 생성자 호출됨...");
    }
    
    /* 설명. 부모로부터 물려받은 메소드가 아닌 자식이 추가한 메소드 */
    public void sprayWater() {
        System.out.println("불난 곳을 찾았습니다. 물을 뿌립니다. =========3");
    }
}
/* 필기.
 *  상속을 표현할 때는 클래스명 선언부에 extends [부모 클래스명]으로 선언한다.
 *  자식 클래스의 생성자를 선언하면 굳이 적지 않더라도 부모 클래스의 생성자를 의미하는 super()가
 *  자식 클래스의 생성자 블록 내에 자동으로 선언된다.
 *  자식 클래스에서는 부모 클래스에서 물려받은 메소드와 더불어 메소드를 추가로 생성할 수 있다.
 *  힙메모리 내 객체 생성 순서: Object -> Car -> FireCar
* */