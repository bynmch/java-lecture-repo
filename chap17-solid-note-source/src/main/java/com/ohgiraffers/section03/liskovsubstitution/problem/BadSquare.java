package com.ohgiraffers.section03.liskovsubstitution.problem;

public class BadSquare extends BadRectangle{
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);     //LSP 위반
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);     //LSP 위반
    }
}
/* 필기.
 *  부모 클래스의 규약을 지키지 않음
 *  각각의 메소드가 가로 혹은 세로만 변경하도록 규약을 설정해두었지만
 *  둘 다 변경하도록 오버라이딩함.
* */