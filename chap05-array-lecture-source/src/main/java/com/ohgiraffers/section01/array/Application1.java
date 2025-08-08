package com.ohgiraffers.section01.array;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        
        /* 수업목표. 배열에 대해 이해하고 배열의 사용 목적을 이해할 수 있다. */
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;

        int sum = 0;

        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;

        System.out.println("sum = " + sum); // 결과: sum = 150

        int[] arr = new int[5];     // heap영역에 [0][0][0][0][0] 으로 저장. 첫 번째칸 이름 arr[0], 두 번째...
        System.out.println(arr[0]); // 결과: 0
        System.out.println(arr);    // 결과: [I@6b884d57

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for (int i = 0; i < 5; i++) {
            arr[i] = 10 * i +1;
        }
        /* 설명. 반복문없이 1차원 배열 출력하기 */
        System.out.println(Arrays.toString(arr)); // 결과: [1, 11, 21, 31, 41] ('배열'이 아닌, '배열의 이름'을 던진다는 것을 주의)
        
        /* 설명. 반복문으로 1차원 배열 출력하기 */
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " "); // 결과: 1 11 21 31 41
        }
    }
}
/* 필기.
 *  배열은 기본 자료형을 담는다고 해서 기본 자료형은 아니다. (참조 자료형)
 *  배열이 메모리에 저장되는 과정
 *  1. stack에 arr 이름있는 공간 생성 2. heap영역에 10칸(자료형에 맞게 값이 채워진 채로)이 올라감. 3. 주소값이 arr에 대입된다.
 *  RAM: stack / heap / method(+ static)
 *  ====== method영역 ======
 *  .java 형태로 소스 코드 저장 -> compile -> .class(byte code)로 소스 코드를 실행한다.
 *  class loader가 소스 코드 내 method를 메모리의 method영역에 올려놓는다.
 *  ====== stack영역 ======
 *  변수 및 호출된 메소드(method영역에서 호출된 녀석들)
 *  int num = 1;(변수선언) -> stack영역에 4byte(변수의 자료형 크기)만큼 할당(기본 자료형일 경우)
 *  기본 자료형이 아닌 자료형은 해당값이 들어있지 않다.
 *  배열을 선언했을 때, 배열의 이름이 붙은 공간이 stack영역에 생성되고, 배열이 존재하는 위치의 주소값이 배열 이름에 저장된다.
 *  ====== heap영역 ======
 *  실제 배열값들을 담는 공간
 *  int[] arr = new int[10]; // 10칸 짜리 배열 생성.
 *  배열을 10칸 생성한다 했을때, heap에 10칸이 붙어서 생성(like 기차)
 *  stack에 존재하는 변수 arr에는 실체가 있는 위치(heap내 위치)의 주소를 할당(대입)한다.
 *  => 참조 자료형 (Reference Type)
 *  자바는 실제 메모리 주소와 차이 있음. (보안 문제로 만든이가 어쩌구...)
 *  Arrays클래스 에서 제공되는 toString() : 배열형태로 반환
* */