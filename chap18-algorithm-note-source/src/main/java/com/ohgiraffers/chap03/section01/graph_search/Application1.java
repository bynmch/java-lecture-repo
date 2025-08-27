package com.ohgiraffers.chap03.section01.graph_search;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Application1 {
    
    static boolean[] visit;     //방문 배열
    static int[][] map;         //그래프를 2차원 배열로 매핑(인접리스트)
    static int count;           //오염된 컴퓨터의 수
    static int node, edge;      //node와 edge의 개념을 담을 변수
    
    /* 설명. 문자열에서 한 줄씩 읽어올 수 있는 BufferedReader를 반환하는 별도의 수업용 메소드 */
    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }
    
    public static Integer solution(String input) throws IOException {
        BufferedReader br = toBufferedReader(input);
        node = Integer.parseInt(br.readLine());        
        edge = Integer.parseInt(br.readLine());
        
        /* 설명. 노드와 간선에 대한 정보가 담긴 map(node의 번호와 인덱스 번호 일치를 위해 +1) */
        map = new int[node + 1][node + 1];

        /* 설명. 방문 배열(simple path(단순 경로)를 위한 것이지만, 실제로는 stackoverflow를 방지하기 위한 목적 */
        visit = new boolean[node + 1];

        /* 설명. 인접 리스트에 그래프 정보 작성(2차원 배열에 그래프 정보를 매핑한다.) */
        for (int i = 0; i < edge; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            /* 설명. 무방향 그래프는 매핑할 때 대칭이다. */
//            map[a][b] = 1;
//            map[b][a] = 1;
            map[a][b] = map[b][a] = 1;

        }
            dfs(1); //stack에 1번컴퓨터를 담는다..

        for (int i = 0; i < map.length; i++) {
            System.out.println(Arrays.toString(map[i]));
        } //매핑 잘 되었나 확인
        return count - 1;
    }

    private static void dfs(int start) {
        visit[start] = true;
        count++;

        for (int i = 1; i <= node; i++) {
            System.out.println(start + "컴퓨터와 연결된 " + i + "번 컴퓨터 방문 전 visit 배열: " + Arrays.toString(visit));
            if(map[start][i] == 1 && !visit[i]) {
                dfs(i);
            }
        }
    }
}
/* 필기.
 *  컴퓨터가 2차원배열을 읽을 때는 한 행의 모든 열을 방문하면서 읽는다는 컨셉을 기억한다.
 *  모든 배열의 인덱스를 방문할 때 문제에서 주어진 조건을 만족하는지를 살피면서 탐색하도록 코드를 작성한다.
 *  주어진 조건을 만족하면서 진행하는 것을 마치 유효성 검사를 수행하는 것으로 이해하면 좋다.
* */