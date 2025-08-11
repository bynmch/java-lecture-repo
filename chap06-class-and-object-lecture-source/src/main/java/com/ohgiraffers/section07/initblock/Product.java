package com.ohgiraffers.section07.initblock;

public class Product {
    private String name = "아이폰";      // 인스턴스 변수1
    private int price;                  // 인스턴스 변수2
    private static String brand;        // 클래스 변수

    /* 설명.  */
    {
        System.out.println("초기화 블럭 실행...");
        name = "폴드";
        price = 100;
        brand = "삼성";
    } // initblock(초기화 블럭)

    static {
//        price = 200; // static 초기화 블럭에서 인스턴스 변수(non-static)에 접근이 불가능하다.
        brand = "현대";
    }

    public Product() {
        System.out.println("Product 기본 생성자 호출됨...");
        brand = "퓨리오사AI";
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }
}
/* 필기.
 *  초기화 블럭은 생성자 이전에 실행되며 어떤 생성자로 생성하든 공통적인 로직이 있다면 작성한다.
 *  생성자 중 하나를 선택할 때 어떤 생성자를 선택할지 알고리즘을 구상(초기화 블럭에서)
 *  클래스 영역에서는 로직을 구성할 수 없다. 메소드 영역, 초기화 블럭, 생성자 블럭 안에서만 가능.
 *  객체를 만들 때 까지 코드 동작 순서: 필드 -> static 초기화 블럭 -> 초기화 블럭 -> 생성자
 *  생성자가 덮어씌울테니 초기화 블럭은 잘 사용하지 않는다.
 *  필드 주입이 아닌 생성자 주입을 권장하는 이유(= 생성자에서 초기화하자고 권장하는 이유)
 *  생성자가 객체를 생성할 때 마지막으로 실행하는 코드이니 위 코드들과 상관없이 생성자에서 덮어씌워버린다.
* */
