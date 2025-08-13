package com.ohgiraffers.section01.polymorphism;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. 다형성을 활용하여 자식 클래스 타입의 객체들을 연속하여 처리할 수 있다. */
        Animal[] animals = new Animal[5];
        animals[0] = new Rabbit();
        animals[1] = new Tiger();
        animals[2] = new Rabbit();
        animals[3] = new Tiger();
        animals[4] = new Rabbit();

        /* 설명. 상속 및 오버라이딩이 되어있는 상태라면 부모 타입의 메소드 호출만으로 동적 바인딩을 통해 한 줄 코딩이 가능함 */
        for (int i = 0; i < animals.length; i++) {
            animals[i].cry();
        }

        System.out.println();

        /* 설명. instanceof를 활용한 각 자식 타입 객체의 추가 메소드 실행 */
        ((Rabbit)animals[0]).jump();
//        ((Tiger)animals[0]).bite();         // 컴파일 에러는 없지만 런타임 시점에 에러 발생!(아주 심각한 에러)

        System.out.println();

        /* 설명. 오버라이딩하지 않은 자식 클래스의 메소드들은 instaceof와 함께 타입을 확인하고 다운 캐스팅하여 사용 */
        for (Animal animal : animals) {
            if(animal instanceof Rabbit) {
                ((Rabbit)animal).jump();
            } else if(animal instanceof Tiger) {
                ((Tiger)animal).bite();
            }
        }
    }
}
