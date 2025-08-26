package com.ohgiraffers.section01.singleresponsibility.problem;

/* 설명.
 *  단일 책임의 원칙(Single Responsibility Principle) - "클래스의 책임이 너무 많거나 노출되면 안돼!"
 *  - 한 클래스는 하나의 책임만 가져야 된다.
 *  - 클래스가 변경되어야 하는 이유는 오직 하나여야 한다.
 *  - 캡슐화를 통해 클래스의 책임을 명확히 하고 구현 세부사항을 숨긴다.
* */

public class Application {

    public static void main(String[] args) {

        BadEmployee badEmp = new BadEmployee();
        badEmp.saveEmployee();          //사원 정보 DB 저장
        badEmp.reportWorkingHour();     //근무 시간 보고
        badEmp.applyPayRate();          //직원의 급여 계산
    }
}
/* 필기.
 *  적용 안했을 때
 *  한 클래스에 속한 기능이나 속성이 많으면 안된다.
 *  숨긴다 -> 은닉화
 *
 * Application 입장에서는 기능이 어떤 속성을 가지고 있는지는 모른다.(good)
 * 하지만 기능이 너무 많아서 하나의 클래스에서 하나의 기능이 문제가 발생하면 클래스전체를 못 쓴다.
 * 최소한의 문제만 딱 골라서 고치기 위해서
* */