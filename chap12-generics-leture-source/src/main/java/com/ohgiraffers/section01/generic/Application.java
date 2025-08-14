package com.ohgiraffers.section01.generic;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 제네릭(Generic)에 대해 이해할 수 있다. */
        MyGenericTest mgt = new MyGenericTest(); //구현의 편의성은 좋음
        mgt.setValue("Hello World!");
        mgt.setValue(1);
        mgt.setValue(3.14);
        mgt.setValue(new java.util.Date());

        boolean test = (boolean) mgt.getValue(); //타입 안정성이 좋지 않음(제네릭을 통해 만족시키자)

//        GenericTest<Object> gt1 = new GenericTest<>(); // 생성자 <>에 같은 자료형을 써주지 않아도 됨.
//        GenericTest<Object> gt1 = new GenericTest<Object>();
        GenericTest<Double> gt2 = new GenericTest<Double>(); //구체적인 타입으로 명시한다.
        GenericTest<String> gt3 = new GenericTest<String>();
        int test = gt2.getValue(); // 타입 안전성이 좋음(컴파일 오류를 띄움으로서 타입이 안정적임을 확인할 수 있다.)

        /* 설명.
         *  1. 제네릭 클래스는 다양한 자료형으로 변할 수 있어 클래스 하나만으로 활용가치가 높아진다.(구현의 편의성)
         *  2. 매개변수나 반환형도 제네릭 타입으로 지정되어 명확히 해당 타입에 대해 처리할 수 있다.(타입의 안정성)
         *
        * */

    }
}
