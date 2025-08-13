package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest {
    public void checkEnoughMoney(int price, int money) throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException{
        
        if(price < 0) {
            throw new PriceNegativeException("상품 가격은 음수일 수 없습니다.");
        }

        if(price < 0) {
            throw new MoneyNegativeException("가지고 있는 돈은 음수일 수 없습니다.");
        }

        if(money < price) {
            throw new NotEnoughMoneyException("가진 돈 보다 상품가격이 비쌉니다.");
        }
        System.out.println("가진 돈이 충분하시군요! 즐거운 쇼핑하세요~~!");
    }
}
/* 필기.
 *  프로그램에서 어떤 예외상황이 발생할지를 한 눈에 볼 수 있다.
 *  보통 개발단계에서 예외 상황을 정해놓고 개발을 시작한다.
 *  catch 블럭을 확인하고 아니면 건너뛴다.
 *  catch블럭은 이어서 여러 개를 쓸 수 있다.
 *  try블럭 안에서 발생하는 예외 타입의 종류만큼 가능하고, 각 상황별로 예외 처리를 달리 할 수 있다.
 *  try블럭 안에서 예외가 발생하면 이후 try블럭을 건너뛰고 catch 블럭을 순차적으로 타입 체크하며
 *  발생한 예외 타입과 일치하는 catch블럭이 동작함
 *  자식 타입의 예외 타입을 가진 catch블럭 일수록 위쪽에 작성하고 부모 타입 일수록 아래쪽에 작성해야 한다.
* */