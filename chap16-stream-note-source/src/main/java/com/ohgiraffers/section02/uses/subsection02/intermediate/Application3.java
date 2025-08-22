package com.ohgiraffers.section02.uses.subsection02.intermediate;

/* 설명.
 *  sorted()란?
 *  - 기본 (오름차순) 및 반대(내림차순) 적용
 *  - Comparator활용 포함
* */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Application3 {

    public static void main(String[] args) {
        
        /* 수업목표. sorted() 중계 연산자를 활용할 수 있다. */
        List<Integer> numbers = Arrays.asList(5, 10, 99, 2, 1, 35, 67, 23);

        /* 설명. 기본 정렬: 오름차순 */
        List<Integer> ascList = numbers.stream()
                                       .sorted() //들어있던 기준(Comparable)대로 정렬
                                       .collect(Collectors.toList()); //원하는 컬렉션 타입(toList, toSet, toMap ...)으로 바꿀 때 사용하는 최종연산
        System.out.println("ascList = " + ascList);

        /* 설명. 추가 정렬: 내림차순 */
        List<Integer> descList = numbers.stream()
                                        .sorted(new DescInteger())
                                        .collect(Collectors.toList());
        System.out.println("descList = " + descList);

        /* 설명. Comparator.reverseOrder() */
        List<Integer> descList2 = numbers.stream()
                                         .sorted(Comparator.reverseOrder()) //기본 정렬 기준(Comparable)을 뒤집는 용도로 사용 가능
                                         .collect(Collectors.toList());
        System.out.println("descList2 = " + descList2);
    }
}
/* 필기.
 *  Arrats.stream(배열)
 *  IntStream.of(나열)
 *  Arrays.asList(나열)
 *
 *  최종 연산을 지나지 않는다면 정렬(중계연산)도 안된다.
* */