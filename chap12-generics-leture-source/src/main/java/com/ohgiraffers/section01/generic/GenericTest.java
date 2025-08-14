package com.ohgiraffers.section01.generic;

public class GenericTest <T> {
    private T value;

    public GenericTest() {
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
// <>안의 자료형을 바꿀 때 마다 필드, 생성자, getter/setter의 자료형도 함께 바뀜.