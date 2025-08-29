package com.ohgiraffers.chap03.section01.graph_search;

public class Application5 {

    static int N;
    static int[] queens;            //1차원 배열이지만, 들어있는 값이 column의 위치를 나타내도록 할 예정
                                    //결과적으로 1차원 배열만으로 queen의 위치를 행과 열로 표시 가능

    static int count;

    public static int solution(int size) {
        count = 0;                  //테스트 케이스 시작할 때 이전 케이스의 값 초기화

        N = size;

        queens = new int[size];

        solveNQueen(0);             //첫 행부터 dfs로 문제를 풀기위한 메소드 호출

        System.out.println("count = " + count);

        return count;
    }

    private static void solveNQueen(int row) {
        if (row == N) {
            count++;
            return;
        }

        for (int col = 0; col < N; col++) {
            if (isSafe(row, col)) {     //현재 row와 col의 위치에 Queen을 놓아도 되는지 유효성 검사 메소드
                queens[row] = col;      //백트래킹에서 promising함수라고 불림
                solveNQueen(row + 1);
            }
        }
    }

    /* 설명. 현재 행에서 Queen을 놓으면 안되는 두 가지 규칙 체크 */
    private static boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++) {     //앞에 놓인 퀸의 갯수만큼 도는 반복

            /* 설명. 1. 같은 열에 있는지 */
            if (queens[i] == col) {
                return false;
            }

            /* 설명. 2. 대각선에 있는지 */
            if(Math.abs(queens[i] - col) == Math.abs(row-i)) {
                return false;
            }
        }
        return true;
    }
}
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Main {
//
//    private static int N;
//    private static int[] queens;
//    private static int count;
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int q = Integer.parseInt(br.readLine());
//        System.out.println(solution(q));
//    }
//
//    public static int solution(int size) {
//
//        /* 설명. 각 테스트 케이스별 solutionCount 초기화 */
//        count = 0;
//
//        N = size;
//        queens = new int[size];
//
//        solveNQueens(0);
//
//        return count;
//    }
//
//    private static void solveNQueens(int row) {
//        if (row == N) {
//            count++;
//            return;
//        }
//
//        for (int col = 0; col < N; col++) {
//            if(isSafe(row, col)) {
//                queens[row] = col;
//                solveNQueens(row + 1);
//            }
//        }
//    }
//
//    private static boolean isSafe(int row, int col) {
//        for (int i = 0; i < row; i++) {
//            if (queens[i] == col) {
//                return false;
//            }
//            if (Math.abs(queens[i] - col) == Math.abs(i - row)) {
//                return false;
//            }
//        }
//        return true;
//    }
//}
