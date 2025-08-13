package com.ohgiraffers.section01.exception;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int balance) throws ArithmeticException {
        System.out.println("가지고 계신 돈은 " + balance + "원입니다.");
        
        if(balance >= price) {
            System.out.println(price + "원 상품을 구입하기 위한 금액이 충분합니다.");
            return;
        } 
        
        /* 설명. 정상흐름이 아닌(예외) 상황에 대해 Exception을 상속받은 예외 타입의 객체를 발생 */
        throw new ArithmeticException("호주머니 사정이 딱하군요!");
    }
}
/* 필기.
 *  예외 상황이 발생하면 예외 타입의 객체가 반환
 *  catch의 매개변수 e로 대입
 *  e 객체의 getMessage()메소드 호출
 *  else의 로직 구문을 굳이 catch로 끌고와서 예외 상황을 처리한다는 것을 명확하게 보여주기 위함
 *  throw: 메소드를 호출하는 곳에 위임
 *  try블럭은 처리할 예외가 있는 적당한 범위를 감싼다.
 *  쓸데없이 너무 많으면 가독성 떨어짐.
 *  발생하는 예외마다 catch를 해야함.
 *  catch는 try블럭에서 발생하는 예외를 잘 명시하는 것이 좋다.
 *  예외 발생 부분 부터 블럭의 나머지 부분을 건너뜀.
 *  main메소드에서 예외 상황을 위임하면 JVM이 알아서 처리해준다.
* */