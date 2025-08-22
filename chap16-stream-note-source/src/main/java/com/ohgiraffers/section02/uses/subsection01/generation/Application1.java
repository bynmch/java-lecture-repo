package com.ohgiraffers.section02.uses.subsection01.generation;

import java.util.Arrays;
import java.util.stream.Stream;

/* 설명.
 *   파이프라인(pipeLine)이란?
 *   - 일련의 연산체인
 *   - 1. 소스(Source): IntStream.range(1, 10) - 데이터 원본
 *   - 2. 중계연산(Intermediate Operator): .filter(), .map() - 데이터 가공(반환형이 Stream)
 *   - 3. 최종연산(Terminal Operator): .forEach() - 결과 처리(반환형이 Stream X)
 *
 * 설명.
 *   파이프라인의 특징
 *    - 1. 메소드 체이닝: 각 연산이 Stream을 반환해서 연속적으로 메소드 연결 가능
 *    - 2. 지연 평가: 최종 연산이 호출될 때까지 중계 연산은 실행되지 않음
 *    - 3. 읽기 전용: 원본 데이터는 변경되지 않음
 *    - 4. 단방향 흐름: 물이 파이프를 타고 흐르듯 데이터가 한 방향으로 처리됨
 *    - 5. 소모성: 스트림을 순회하고 나면 새로운 스트림을 생성해야 함(다시 되돌릴 수 없다)
* */

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
        
        /* 설명. Builder를 활용한 스트림 생성(feat. builder 패턴은 필요한만큼 조립해서 객체로 만드는 방법) */
        System.out.println("====== 배열을 Builder를 통해 Stream으로 변환 ======");
        Stream<String> builderStream =
//                Stream.<String>builder().add("홍길동").add("유관순").add("윤봉길").build();
                Stream.<String>builder().add(sArr[0]).add(sArr[1]).add(sArr[2]).build();
        builderStream.forEach(System.out::println);
    }
}
/* 필기.
 *  스트림이란 컬렉션과 배열을 함수 프로그래밍처럼 다루기 위해 만들어 놓은 API이고,
 *  스트림 타입으로 배열이나 컬렉션을 스트림 타입의 인스턴스를 생성하면, 그 스트림 타입의 인스턴스 메소드를 사용할 수 있고,
 *  그 메소드를 사용하여 만든 일련의 연산체인이 파이프라인이다.
* */