package com.ohgiraffers.section08.object_array;

public class Car {
    private String modelName;
    private int maxSpeed;

    public Car() {
    }

    public Car(String modelName, int maxSpeed) {
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    }

    public void driveMaxSpeed() {
        System.out.println(modelName + "차량이 최고 시속 " + maxSpeed + "(km/h)로 달립니다.");
    }
}
/* 필기.
 *  같은 타입의 값들로 동일한 작업 -> 배열로 처리할 수 있다.
 *  객체의 배열은 객체들의 주소값을 힙 내의 배열에 저장한다.
* */