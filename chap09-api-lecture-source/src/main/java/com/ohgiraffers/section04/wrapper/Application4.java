package com.ohgiraffers.section04.wrapper;

public class Application4 {

    public static void main(String[] args) {

        String b = Byte.valueOf((byte)1).toString();
        String s = Short.valueOf((short)2).toString();
        String i = Integer.valueOf(4).toString();
        String l = Long.valueOf(8L).toString();
        String f = Float.valueOf(4.0f).toString();
        String d = Double.valueOf(8.0).toString();
        String isTrue = Boolean.valueOf(true).toString();
        String ch = Character.valueOf('a').toString();

//        String byteStre = (byte) 1 + "";
    }
}
/* 필기.
 *  Wrapper
 *  1. 기능 / 2. 다형성 / 3. 문자열과의 변환(문자열 -> 기본 자료형)
* */