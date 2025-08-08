package com.ohgiraffers.section02.encapsulation.problem2;

public class Monster {
    String name;
//    int hp;
    int mp;

    public void setInfo2(int info2) {
//        this.hp = info2;
        this.mp = info2;
    }
}
/* 필기.
 *  클래스 필드를 직접 접근 했을 때 클래스 필드를 수정하면 오류가 난다. (강결합)
 *  hiding, 은닉화
 *  메소드를 만들어서 결합도를 낮춘다.
 *  모듈화("내 코드가 수정되었으면 내 것만 바꾸겠다.")
* */