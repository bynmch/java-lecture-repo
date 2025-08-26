package com.ohgiraffers.section01.singleresponsibility.problem;

public class BadEmployee {
    private String name;
    private int workingHours;
    private int payRate;

    public BadEmployee() {
    }
    
    public void saveEmployee() {
        System.out.println("직원 정보를 데이터 베이스에 저장");
    }
    
    public void reportWorkingHour() {
        System.out.println("근무시간 보고");
    }
    
    public void applyPayRate() {
        System.out.println("급여 정산");
    }
    
}
/* 필기.
 *  한 클래스가 너무 많은 기능을 가지고 있음
 *  이중에 아무거나 하나라도 문제가 있으면 아예 클래스 자체를 못 씀.
* */