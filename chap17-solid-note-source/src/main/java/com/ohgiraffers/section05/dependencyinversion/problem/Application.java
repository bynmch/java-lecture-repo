package com.ohgiraffers.section05.dependencyinversion.problem;

/* 설명.
 *  의존성 역전 원칙(Dependency Inversion Principle) - "자식에게 의존하면 자식 때문에 휘둘려!"
 *  - 고수준 모듈은 저수준 모듈에 의존해서는 안된다. (둘 다 추상화에 의존해야 한다.)
 *  - 추상화는 세부 사항에 의존해서는 안되고, 세부 사항이 추상화에 의존해야 한다.
* */
public class Application {

    public static void main(String[] args) {

        BadNotificationService badService = new BadNotificationService();
        badService.sendNotification(1, "중요 공지사항입니다.");  //1은 email
        badService.sendNotification(2, "중요 공지사항입니다.");  //2는 sms
    }
}
/* 필기.
 *  MemberService는 MemberRepository 객체가 생성되어야하는 의존 관계, 강한 결합을 가지고 있다.
 *  인터페이스를 만들어서 두 클래스 간 의존 관계를 깬다.
 *  MemberService는 인터페이스를 의존하게 되고, MemberRepository도 구현한 인터페이스를 의존한다.
 *  (MemberRepository가 의존하는 인터페이스가 생성할 때 의존성 역전 현상이 발생)
 *  두 클래스간 인터페이스를 생성하여 의존하는 클래스의 의존성을 낮추고 결합을 약화시킨다.
* */