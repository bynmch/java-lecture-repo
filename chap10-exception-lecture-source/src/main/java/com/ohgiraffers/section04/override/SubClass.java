package com.ohgiraffers.section04.override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass {

    /* 설명. 부모 클래스의 메소드와 동일한 레벨의 예외 throws 시 문제없음. */
//    @Override
//    public void method() throws IOException {
//
//    }

    /* 설명. 부모 클래스의 메소드와 달리 예외를 발생시키지 않아도 됨. */
//    @Override
//    public void method() {
//    }

    /* 설명. 부모 클래스의 메소드에서 발생한 예외보다 자식 타입 예외는 가능.(feat. 더 적은 예외 발생) */
    @Override
    public void method() throws FileNotFoundException {
    } // IOException이 부모이기 때문에 다형성으로 에러 안남.

    /* 설명. 부모 클래스의 메소드에서 발생한 예외보다 부모 타입의 예외는 불가능.(feat. 더 많은 예외 발생) */
//    @Override
//    public void method() throws Exception {
//    } // 부모의 메소드 보다 상위 예외 타입을 발생시키면 catch블럭에서 커버가 안 됨.
//    // 자식의 메소드에서 다른 예외 상황을 만들면 부모타입에서 만든 예외 상황이 범위가 더 좁기 때문에 감당 안됨.
}
