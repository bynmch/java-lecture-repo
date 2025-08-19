package com.ohgiraffers.section02.enumtype;

public enum Subject {
    JAVA,
    MARIADB,
    JDBC,
    HTML,
    CSS,
    JAVASCRIPT;         //enum타입에 추가적인 코드가 있을 경우 세미콜론을 빼먹지 않는다.

    Subject() {
        System.out.println("기본 생성자 호출됨...");
    }

    @Override
    public String toString() {
        return "@@@" + this.name() + "@@@";
    }
}
