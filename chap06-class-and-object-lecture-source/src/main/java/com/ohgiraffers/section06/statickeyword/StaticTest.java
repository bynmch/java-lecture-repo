package com.ohgiraffers.section06.statickeyword;

public class StaticTest {
    private int nonStaticCount;
    private static int staticCount;

    public StaticTest() {
    }

    public int getNonStaticCount() {
        return nonStaticCount;
    }

    public static int getStaticCount() {
        return staticCount;
    }

    public int increaseNonStaticCount() {
        return nonStaticCount++;
    }

    public static int increaseStaticCount() {
        return staticCount++;
    }

}
/* 필기.
 *  static 키워드?
 *   1. 프로그램이 실행될 때 정적 메모리 영역(static 영역 또는 클래스 영역)에 static멤버를 할당하고자 할 때 사용한다.
 *   2. 여러 인스턴스가 공유해서 사용하고자 할 목적으로 사용한다. (static 필드)
 *    (대표적인 예로 싱글톤(singleton) 객체 또는 설정값(DB 연결정보)를 담을 용도로 쓸 수 있다.)
 *  staticCount는 static영역에 StaticTest.staticCount로 필드 공간 생성.
 *  static 메소드에서 인스턴스 필드나 메소드를 활용할 수 없다.
 *  static 멤버는 프로그램이 실행됨과 동시에 사용될 수 있다. (객체와 별개이다.)
 *  메소드는 호출되면 스택영역에 올라간다.
 *
* */