package com.ohgiraffers.section02.dimensional;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 다차원 배열의 구조를 이해하고 사용할 수 있다. */
        /* 설명.
         *  다차원 배열
         *   다차원 배열은 2차원 이상의 배열을 의미한다.
         *  (일반적으로 최대 3차원 정도까지 고려하며 그 이상은 우리의 인지 범위 초과라 고려하지 않는다.)
        * */

        int[][] iArr1;
        int[][] iArr2;

        iArr1 = new int[3][2]; // 크기 2짜리 1차원 배열만 관리하는 정변배열
        iArr2 = new int[3][]; // 크기가 다를 수 있는 1차원 배열들을 관리하는 가변배열

        /* 설명. 정변 배열의 경우 */
        int num = 0;
        for (int i = 0; i < iArr1.length; i++) {
            for (int j = 0; j < iArr1[i].length; j++) {
                iArr1[i][j] = ++num;
            }
            System.out.println(Arrays.toString(iArr1[i]));
        }

//        for (int i = 0; i < iArr1.length; i++) {
//            System.out.println(Arrays.toString(iArr1[i]));
//        }

        /* 설명. 가변 배열의 경우 */
        iArr2[0] = new int[]{1, 3};
        iArr2[1] = new int[]{10, 20, 30, 40};
        iArr2[2] = new int[]{5, 7, 1};

        for (int i = 0; i < iArr2.length; i++) {
            System.out.println(Arrays.toString(iArr2[i]));
        }
    }
}
/* 필기.
 *  배열선언 시 대괄호는 자료형 옆에 붙여서 사용.
 *  뒤에것은 1차원 배열이고 앞은 뒤의 1차원 배열의 주솟값을 저장하는 배열
 *  int[][] arr = new int [3][2];
 *  마찬가지로 stackdp arr이 생김
 *  int[3] 만큼의 배열이 heap에 생김.
 *  int[][2] 인 배열이 3개 생김.
 *  int[][2]의 위치에 대한 주솟값이 int[3]의 배열에 각각 들어간다.
 *  arr에는 int[3]의 주소가 들어감.
 *  바둑판처럼 생각하지 않는다. 앞 []에는 뒤 []의 배열의 주소가 각각 들어감.
 *  뒤 []은 다른 길이의 1차원배열이 들어갈수 있다.(가변배열)
 *  iArr1이 가리키는 것은 앞 []을 의미한다.
* */