package com.ohgiraffers.section06.singleton;

public class LazySingleton {

    private static LazySingleton lazy;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (lazy == null) lazy = new LazySingleton();
        return lazy;
    }
}
/* 필기.
 *  lazy는 프로그램 실행 됐을 때부터 인지된 상태로 진행
 *  lazy에는 한 번만 참조값이 채워지면 바뀌지 않고 그 값만 사용한다.
 *  lazy는 static 변수 생성 -> null 값이 static변수에 들어감 -> 메소드를 호출 ->
 *  -> lazy가 null일 때 인스턴스를 생성
 *
* */