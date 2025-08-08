package com.ohgiraffers.section01.array;

import java.util.Arrays;
import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {

        /* 수업목표. 배열을 사용하는 예시를 작성할 수 있다. */
        int[] score = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + "번째 학생의 자바 점수를 입력해 주세요: ");
            score[i] = sc.nextInt();
        }
        System.out.println("현재까지 입력된 점수들: " + Arrays.toString(score));

        /* 설명. 합계(sum) 구하기 */

//        int sum = 0;
//        for (int i = 0; i < score.length; i++) {
//            sum += score[i];
//        }
//        System.out.println("합계 " + sum);

        /* 설명. 향상된 for문(또는 foreach문) 활용하기(feat. 처음부터 끝까지 순회) */
        int sum = 0;
        for (int s : score) {
            sum += s;
        }
        System.out.println("합계 " + sum);

        double avg = (double) sum / score.length;
        System.out.println("평균: " + avg);
    }
}
/* 필기.
 *  배열은 그 길이를 활용해야 할 때 length라는 변수에 접근해서 활용할 수 있다.
 *  (유지 보수 측면 및 입력된 크기의 배열이 할당될 대 사용할 것)
 *  == 향상 for문 ==
 *  int s = score[0];
 *  -> int s = score[1];
 *  -> int s = score[2];
 *  ...
 *  score 배열의 값들을 s에 하나씩 담는다.
 *  대괄호 없는 변수 활용 가능.
* */