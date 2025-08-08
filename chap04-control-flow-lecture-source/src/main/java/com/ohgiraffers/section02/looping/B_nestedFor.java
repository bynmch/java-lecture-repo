package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_nestedFor {
    /* 설명. 구구단 */
    public void printGugudanFromTwoToNine() {

        /* 설명.
         *  2단
         *   2 * 1 = 2
         *   2 * 2 = 4
         *   ...
         *  9단
         *   9 * 1 = 9
         *   9 * 2 = 18
         *   ...
         *   9 * 9 = 81
         * */
        for (int dan = 2; dan <= 9; dan++) {
            System.out.println(dan + "단");
            printGugudan(dan);
            System.out.println("==============");
        }
    }
    /* 설명. 단수가 넘어오면 해당 단수의 구구단 출력을 담당하는 메소드 */
    private static void printGugudan(int dan) {
        for (int su = 1; su <= 9; su++) {
            System.out.println(dan + " * " + su + " = " + (dan * su));
        }
    }
    /* 설명. 별찍기 */
    public void testForExample() {
        /* 설명.
         *  양의 정수 하나를 입력: 5
         *      *
         *     **
         *    ***
         *   ****
         *  *****
         * */
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수 하나를 입력: ");
        int input = sc.nextInt();

        for (int i = 0; i < input; i++) {

            /* 설명. 공백찍기 */
            for (int j = 0; j < input - (i + 1); j++) {
                System.out.print(" ");
            }

            /* 설명. 별찍기 */
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
/* 필기.
 *  중첩반복문은 기하학적(2차원 행렬의 흐름으로 해석)으로 해석하는 것이 편하다.
 *  행을 다 훑고 다음 행으로 넘어간다.(행과 열별로 규칙찾기)
 *  같은 스코프내 같은 변수이름으로 선언할 수 없다.
* */