package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 배열의 복사 개념 중 얕은 복사에 대해 이해할 수 있다. */

        int[] originArr = {1, 2, 3};
        int[] copyArr = originArr; // originArr에는 주소만 있으니 주소만 복사

        System.out.println(Arrays.toString(originArr)); // 결과: [1, 2, 3]

        copyArr[1] = 100; // originArr의 배열값을 바꾼다. 서로에게 영향을 준다.
        System.out.println(Arrays.toString(originArr)); // 결과: [1, 100, 3]
        
        /* 설명. 메소드에서 배열을 반환하지 않아도 된다는 것을 이해해보기 */
        testMethod(originArr); // 결과: 메소드 안에서의 arr로 접근시 모습: [1, 100, 3]
        System.out.println("메소드 안에서의 변화가 반환하지 않아도 호출한 곳에 영향을 주는지: " + originArr[0]);
        // 결과: 메소드 안에서의 변화가 반환하지 않아도 호출한 곳에 영향을 주는지: 111
    }

    private static void testMethod(int[] arr) {
        System.out.println("메소드 안에서의 arr로 접근시 모습: " + Arrays.toString(arr));
        arr[0] = 111;
//        얕은 복사로 같은 대상만 건드리고 있다.
    }
}
// int[] arr = originArr; 자동으로 얕은 복사가 일어난다.
// originArr, copyArr, int[] arr 모두 같은 대상을 가리킨다.