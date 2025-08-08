package com.ohgiraffers.section06.singleton;

public class EagerSingleton {

    private static EagerSingleton eager = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return eager;
    }
}
/* 필기. 
 *  static 변수가 static 영역(method)영역에 생기고 heap영역내 주소값이 static 변수에 저장.
 *  eager라는 이름으로 static 영역에 변수 생성
 *  new로 heap에 EagerSingleton() 객체 생성
 *  eager에 객체 참조값 저장.
 *  private으로 기본생성자에 안하면 new와 다를 바 없다.
 *  static영역에 올라간 순간 인지 -> 인스턴스 생성 -> 참조값을 static 변수에 저장
 *  eager를 반환하는 메소드를 호출해서 사용.
 *  프로그램이 시작될 때 생성될 객체가 많다면 과부하가 올 수 있다.
 *  크기가 큰, 소수의 반드시 프로그램 시작 시 생성되어야 할 객체(무거운 객체)는 주로 eager
 *  생성 시점이 가장 중요.
* */

