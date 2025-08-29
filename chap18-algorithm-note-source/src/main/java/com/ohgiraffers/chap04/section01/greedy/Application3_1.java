package com.ohgiraffers.chap04.section01.greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Application3_1 {

    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    public static Integer solution(String input) throws IOException {
        int max_count = 0;
        BufferedReader br = toBufferedReader(input);
        int N = Integer.parseInt(br.readLine());
        ArrayList<Time> timeList = new ArrayList<>();

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            timeList.add(new Time(start, end));
        }

        Collections.sort(timeList);
//        timeList.sort(null);

//        timeList.stream().forEach(System.out::println);

        int lastEndTime = 0;
        for (int i = 0; i < N; i++) {
            if (timeList.get(i).start == timeList.get(i).end) {
                max_count++;
                continue;
            }
            if (timeList.get(i).start >= lastEndTime) {
                max_count++;
                lastEndTime = timeList.get(i).end;
            }
        }

        return max_count;
    }
}

/* 설명. 각 회의 시간 객체를 만들 수 있는 클래스 */
class Time implements Comparable<Time> {
    public int start, end;

    public Time(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Time o) {
        return this.end - o.end;            //end시간으로 오름차순 정렬
    }

//    @Override
//    public String toString() {
//        return "Time{" +
//                "start=" + start +
//                ", end=" + end +
//                '}';
//    }
}