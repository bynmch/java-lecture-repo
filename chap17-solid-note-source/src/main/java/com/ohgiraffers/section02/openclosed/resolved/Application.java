package com.ohgiraffers.section02.openclosed.resolved;

/* 설명.
 *  Payment 인터페이스를 통해 새로운 결제 수단을 기존 코드의 수정없이 쉽게 추가할 수 있다.
 *  PaymentProcessor 클래스는 구체적인 결제 방식을 알 필요없이 Payment 인터페이스만 의존(결합)한다.
* */
public class Application {

    public static void main(String[] args) {

        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment(new CreditCardPayment());
        paymentProcessor.processPayment(new KakaoPayPayment());
        paymentProcessor.processPayment(new NaverPayPayment());

    }
}
/* 필기.
 *  PaymentProcessor 클래스를 건들지 않고도 인터페이스를 구현한 클래스만 추가해서(확장에는 열려 있음)
 *  오버라이딩한 메소드만 호출하면 변경을 해도 다른 클래스에는 영향이 없다.(변경에는 닫혀 있음)
 *  (processPayment메소드의 매개변수 타입에만 의존하며, 결제 방식에 대한 타입은 알 필요없다.)
 *  기존코드를 수정하지 않았으며, 추가만 했음(Payment인터페이스를 구현한 NaverPayPayment객체만 추가함.)
* */