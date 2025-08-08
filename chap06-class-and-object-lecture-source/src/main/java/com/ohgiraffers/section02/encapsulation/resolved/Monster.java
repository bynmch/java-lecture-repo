package com.ohgiraffers.section02.encapsulation.resolved;

public class Monster {
    private String name;
    private int hp;

    public void setInfo1(String info1) {
        this.name = info1;
    }
    public void setInfo2(int info2) {
        if(info2 >= 0) {
            this.hp = info2;
        } else {
            this.hp = 0;
        }
    }

    public String getInfo() {
        return this.name + "의 hp는 " + this.hp;
    }
}
/* 필기. 
 *  private으로 캡슐화를 통해 직접 접근을 막아놓는다.
 *  애초부터 막아놓는다.
 *  우회해서 접근한다.(메소드)
* */