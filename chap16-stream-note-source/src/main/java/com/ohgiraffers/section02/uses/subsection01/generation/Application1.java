package com.ohgiraffers.section02.uses.subsection01.generation;

import java.util.Arrays;
import java.util.stream.Stream;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 배열 또는 컬렉션을 스트림에서 활용할 수 있다. */
        /* 설명. 1. 배열로 Stream생성 */
        String[] sArr = new String[]{"java", "mariaDB", "jdbc"};
        System.out.println("====== 배열 전체를 Stream으로 변환 ======");
        Stream<String> strStream1 = Arrays.stream(sArr);
//        strStream1.forEach(s -> System.out.println(s));
        strStream1.forEach(System.out::println);
        
        /* 설명. Stream으로 관리되는 요소들을 원하는 갯수만큼 반복할 수 있다. */
        System.out.println("====== 배열의 원하는 구간을 Stream으로 변환 ======");
        Stream<String> strStream2 = Arrays.stream(sArr, 0, 2);
        strStream2.forEach(System.out::println);
        
        /* 설명. Builder를 활용한 스트림 생성(feat. builder 패턴은 필요한만큼 조립해서 객체로 만드는 방법 */
        System.out.println("====== 배열을 Builder를 통해 Stream으로 변환 ======");
        Stream<String> builderStream =
//                Stream.<String>builder().add("홍길동").add("유관순").add("윤봉길").build();
                Stream.<String>builder().add(sArr[0]).add(sArr[1]).add(sArr[2]).build();
        builderStream.forEach(System.out::println);
    }
}
