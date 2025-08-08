package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {
    String name;
    int hp;

    public void setHp(int hp) {
        if (hp >= 0) {
            this.hp = hp;
        } else {
            this.hp = 0;
        }
    }
}
/* 필기.
 *  직접접근을 막기 위해서 메소드를 생성해서 접근.(우회, detour)
 *  외부에서 마음대로 변경할 경우 객체의 무결성이 깨질 수 있기 때문에
 *  이상한 값을 막기 위해 기능을 넣어준다.
 *  if문 내 hp는 가까운 곳부터 동일한 이름의 변수를 찾는다.
 *  매개변수와 구분하기 위해 this를 사용한다.
 *  this: 클래스로 만들어진 객체의 메소드를 호출할 때 사용.
 *  메소드는 힙에 올라가지 않는다.
 *  heap의 객체가 static영역에서 stack영역에 호출하여 사용
 *  monster1과 monster2가 setHp()를 호출할 때의 this는 달라진다.
* */

/* 설명.
 *  this. 의 의미
 *  1. 변수명이 동일할 시 지역변수가 우선적으로 인지되는 것을 방지하기 위해
 *     '명시적'으로 구분한다.(만약 변수 이름이 다르면 생략 가능, 컴파일 되면 자동으로 this.가 써진다.)
 *  2. non-static 메소드를 호출하는 해당 클래스 타입의 객체.
* */