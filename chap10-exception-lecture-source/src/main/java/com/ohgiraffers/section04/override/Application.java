package com.ohgiraffers.section04.override;

import java.io.IOException;

public class Application {

    public static void main(String[] args) {

        SuperClass superClass = new SuperClass();
        try {
            superClass.method();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

/* 필기.
 *  왜 자식의 메소드가 예외처리가 적어야 하나?
 *  부모 클래스 타입을 기준으로 애플리케이션 코드가 작성되어 있기 때문에
 *  자식 클래스에서 오버라이딩된 메소드의 예외 상황이 크면 부모 클래스의 메소드가 처리할 수 있는 범위가 더 적기 때문에
 *  다형성을 통해 catch 블럭에서 처리할 수 있는 예외 상황이 더 적어져 문제가 된다.
* */