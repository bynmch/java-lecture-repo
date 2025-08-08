package com.ohgiraffers.section01.array;

public class Application5 {
    public static void main(String[] args) {

        /* 수업목표. 1차원 배열을 사용해 무작위 카드 뽑기 */
        String[] shape = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] number = {"ACE", "2", "3", "4", "5", "6", "7", "8", "9", "10","JACK", "QUEEN", "KING"};

        int randomShape = (int)(Math.random() * 4);
        int randomNumber = (int)(Math.random() * 13);

        System.out.println("당신이 뽑은 카드는 \"" + shape[randomShape] + " " +  number[randomNumber] + "\"");
    }
}
/* 필기.
 *
 *
 * 단순 1차원 마무리.
* */