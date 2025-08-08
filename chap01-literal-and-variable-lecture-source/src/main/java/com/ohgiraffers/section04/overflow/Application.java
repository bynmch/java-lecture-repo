package com.ohgiraffers.section04.overflow;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 오버플로우에 대해 이해할 수 있다. */
        /* 설명.
         *   자료형 별 값의 최대 범위를 벗어나는 경우
         *   발생한 carry를 버림처리하고 부호 비트를 반전시켜 순환한다.
         *   */

        byte num1 = 126;

//        num1 = num1 + 1;    // num1은 자동으로 int로 인식
        num1++;     // 개념 상 num1 = num1 + 1;
        num1++;     // 최대 범위를 넘어가면 최솟값이 출력.
        num1++;


        System .out.println("현재 num1에 있는 값: " + num1);

        byte num2 = -127;

        num2--;     // num2 = num2 - 1;
        num2--;

        System .out.println("현재 num2에 있는 값: " + num2);

        num2 = (byte)(num2 - 1);
        System .out.println("현재 num2에 있는 값: " + num2);

    }
}
