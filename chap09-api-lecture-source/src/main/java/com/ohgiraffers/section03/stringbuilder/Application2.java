package com.ohgiraffers.section03.stringbuilder;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. StringBuilder의 자주 사용되는 메소드의 용법 및 원리를 이해할 수 있다. */
//        StringBuilder sb = new StringBuilder("javamariaDB");
        StringBuffer sb = new StringBuffer("javamariaDB"); // 내부적으로 thread-safe함.

        /* 설명. 1. delete() */
        System.out.println("delete(): " + sb.delete(2, 5)); // 인덱스 2, 3, 4를 삭제

        /* 설명. 2. deleteCharAt() */
        System.out.println("deleteCharAt(): " + sb.deleteCharAt(2)); // 인덱스 2인 문자 삭제

        /* 설명. 3. insert() */
        System.out.println("insert(): " + sb.insert(1, "vao")); // 인덱스 1부터 원하는 문자열 삽입 (밀어내기 & 삽입)
        System.out.println("insert(): " + sb.insert(0, "j"));
        System.out.println("insert(): " + sb.insert(sb.length(), "jdbc"));

        /* 설명. 4. reverse() */
        System.out.println("reverse(): " + sb.reverse());
    }
}
