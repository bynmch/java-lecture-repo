package com.ohgiraffers.section04.constructor;

import java.util.Date;

public class User {
    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;

    public User() {
        System.out.println("기본 생성자 실행됨...");
    }

    public User(String id, String pwd, String name) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
    }

    public User(String id, String pwd, String name, Date enrollDate) {
//        this.id = id;
//        this.pwd = pwd;
//        this.name = name;
        this(id, pwd, name);
        this.enrollDate = enrollDate;
    }

    public String getInfo() {
        return this.id + ", " + this.pwd + ", " + this.name + ", " + this.enrollDate;
    }
}
/* 필기. 
 *  public User() {}: 기본 생성자
 *  작성하지 않아도 작성된, "명시적으로 작성하는 걸 권장"
 *  반드시 생성자를 실행해야 객체가 생성됨.
 *  소괄호부분이 어떻게 구성되는 지에 따라 다른 생성자를 만들 수 있다.
 *  생성자에서 this. 의 의미는 해당 생성자로 생성될 객체를 뜻한다.
 *  소괄호안의 '갯수, 타입, 순서'가 다르면 다른 생성자이다.
 *  어떤 생성자를 사용할지 자동으로 인식해서 객체를 생성한다.
 *  매개변수가 존재하는 생성자만 선언하면 기본 생성자는 자동으로 생성해주지 않는다.
 *  그래서 기본 생성자를 명시적으로 선언해주어야 한다.(습관들이기)
 *  alt + insert -> constructor: 생성자 단축키
 *  this()는 같은 클래스의 다른 생성자를 참조할 때 사용
 *  1. 첫 줄에 사용할 것
 *  2. 다른 생성자 하나만 추가 사용 가능
 *  목적: 코드 줄이기 ㅋ
* */