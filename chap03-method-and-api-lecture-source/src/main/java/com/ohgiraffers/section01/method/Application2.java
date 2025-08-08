package com.ohgiraffers.section01.method;

public class Application2 {
    public static void main(String[] args) {
        System.out.println("main() 시작됨...");
//        methodA();
//        methodB();

        Application2 app = new Application2();
        app.methodA();      // 접근 연산자(dot, .)를 활용해서 접근해서 호출한다.
        app.methodB();
        System.out.println("main() 종료됨...");

    }

    public void methodA() {
        System.out.println("methodA() 호출됨...");
        System.out.println("methodA() 종료됨...");
    }

    public void methodB() {
        System.out.println("methodB() 호출됨...");
        System.out.println("methodB() 종료됨...");
    }
}
/* 스택에서 pop 이후 호출돼서 쌓임
*   static이 없으면 non static 메소드 
*   static 메소드일 경우 메인 메소드에서 호출 가능.
*   non-static 메소드는 인식못함.
*   non-static 메소드일 경우 인식시키는 법: Application2 app = new Applicaton2() */