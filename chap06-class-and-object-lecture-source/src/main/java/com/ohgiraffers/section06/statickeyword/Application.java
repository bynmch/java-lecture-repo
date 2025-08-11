package com.ohgiraffers.section06.statickeyword;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. static 키워드에 대해 이해할 수 있다. */
        StaticTest st1 = new StaticTest();

        /* 설명. 현재 두 필드가 가지고 있는 값 확인 */
        System.out.println("non-static field: " + st1.getNonStaticCount());
        System.out.println("static field: " + StaticTest.getStaticCount());

        /* 설명. 각 필드 값들을 증가 */
        st1.increaseNonStaticCount();
        StaticTest.increaseStaticCount();

        /* 설명. 두 필드 값 확인 */
        System.out.println("non-static field: " + st1.getNonStaticCount()); // 결과: non-static field: 1
        System.out.println("static field: " + StaticTest.getStaticCount()); // 결과: static field: 1

        /* 설명. 새로운 객체 생성 후 적용 */
        StaticTest st2 = new StaticTest();
        System.out.println("non-static field: " + st2.getNonStaticCount()); // 결과: non-static field: 0
        System.out.println("static field: " + StaticTest.getStaticCount()); // 결과: static field: 1

    }

}
