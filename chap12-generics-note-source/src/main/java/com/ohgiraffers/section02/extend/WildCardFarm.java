package com.ohgiraffers.section02.extend;

/* 설명.
 *  와일드카드(wildcard)
 *   제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 때 타입 변수를 제한할 수 있다.
 *   <?>: 제한 없음
 *   <? extends Type>: 와일드카드의 상한 제한
 *   <? super Type>: 와일드카드의 하한 제한
* */
public class WildCardFarm {

//    제네릭 클래스가 상속받은 클래스를 포함한 하위 타입만 들어갈 수 있다.
    public void anyType(RabbitFarm<?> farm) {
        farm.getRabbit().cry();
    }

//    Bunny를 포함한 하위 타입만 가능하다.
    public void extendsType(RabbitFarm<? extends Bunny> farm) {
        farm.getRabbit().cry();
    }

//    Bunny를 포함한 상위 타입만 가능하다.
    public void superType(RabbitFarm<? super Bunny> farm) {
        farm.getRabbit().cry();
    }
}
