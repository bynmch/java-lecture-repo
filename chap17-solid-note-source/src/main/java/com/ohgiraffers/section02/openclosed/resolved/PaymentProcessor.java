package com.ohgiraffers.section02.openclosed.resolved;

public class PaymentProcessor {
    public void processPayment(Payment payment) {
        payment.process();
    }
}
/* 필기.
 *  인터페이스로 구현한 클래스들의 오버라이딩된 메소드를 사용한다.
 *  어떤 결제타입이 매개변수로 들어 올지는 모른다.
 *  Credit이나 Kakao중 하나가 날라오고, 동적바인딩이 발생
* */