package com.ohgiraffers.section04.dto;

public class Application {
    public static void main(String[] args) {
        UserDTO user1 = new UserDTO();
        System.out.println(user1);

        UserDTO user2 = new UserDTO("user01", "pass01", "홍길동", new java.util.Date());
        System.out.println("user2 = " + user2);

        /* 설명. JSP, Spring Framework, Mybatis, ... 등에서 사용할 예정 */
        user2.setName("유관순"); // 직접접근과 다를 바 없으니 남발하지 않기
        System.out.println("user2 = " + user2.getName());
    }
}
