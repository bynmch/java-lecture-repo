package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application1 {

    public static void main(String[] args) {
        
        /* 수업목표. 컬렉션 프레임워크에 대해 이해할 수 있다. */
        /* 설명.
         *  배열보다 ArrayList가 좋은 점
         *  1. 미리 크기를 할당할 필요가 없다
         *  2. 들어있는 값(데이터)의 개수를 잘 파악할 수 있다.(size())
         *  3. 경우에 따라(제네릭 타입을 생략하면) 다양한 값을 한 번에 저장할 수 있다(Object[]과는 큰 차이없다).
         *  4. 중간에 값을 추가 및 삭제가 편리하다(feat. 속도는 다소 느릴 수 있다).
        * */
        ArrayList list = new ArrayList();
        list.add("apple");
        list.add(123);
        list.add(45.67);
        list.add(new java.util.Date());

        System.out.println("list = " + list);

        /* 설명. 넣은 데이터의 순서에 맞는 인덱스로 추출 */
        System.out.println("처음 넣은 값: " + list.get(0));
        System.out.println("두번째 넣은 값: " + list.get(1));
        System.out.println("세번째 넣은 값: " + list.get(2));

        /* 설명. 넣은 데이터의 양(size()) */
        System.out.println("넣은 데이터의 양: " + list.size());

        list.add(1, 10); //기존 값들은 인덱스가 뒤로 밀린다.
        System.out.println("list = " + list);

        list.set(1, "banana");  //기존 인덱스의 값 수정
        System.out.println("list = " + list);

        list.remove(1); //해당 인덱스의 값 삭제
        System.out.println("list = " + list);

        System.out.println();
        /* 설명. ArrayList를 활용한 정렬 */
        System.out.println("<<ArrayList를 활용한 정렬>>");
        /* 설명. 1. 문자열 데이터 정렬(feat. 오름차순) */
//        ArrayList<String> stringList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();    //필수는 아니지만 관례상 컬렉션은 다형성을 주로 적용한다.
//        List<String> stringList = new LinkedList<>();
        stringList.add("apple");
        stringList.add("orange");
        stringList.add("banana");
        stringList.add("mango");
        stringList.add("grape");

        System.out.println("==== 정렬 전 ====");
        System.out.println("문자열 데이터: " + stringList);
        System.out.println();

        /* 설명. 실제로는 ArrayList안에 있는 데이터인 String에 정의된 기준(오름차순)대로 정렬된다. */
        Collections.sort(stringList);   //사본을 만들어 정렬하지않고 원본 배열을 정렬한다.
        System.out.println("==== 정렬 후 ====");
        System.out.println("정렬된 문자열 데이터: " + stringList);

        /* 설명. 내림차순 하는 방법 */
        /* 설명. 다루는 Iterator와 해당 컬렉션의 제네릭 타입은 웬만하면 꼭 명시한다.(Iterator<String>) */
//        Iterator<String> iter = ((LinkedList<String>) stringList).descendingIterator();
//        while(iter.hasNext()) {
//            System.out.print(iter.next() + " ");    //제네릭을 적용하면 iter.next() 반환형이 명확해짐(타입안정성)
//        }

    }
}
/* 필기.
 *  <>를 안 넣으면 <Object>와 같다. 모든 타입이 가능.
 *  크기 지정할 필요 없다.
 *  경우에 따라 다양한 자료형 가능(feat. Object)
 *  출력이 용이하다(feat.Arrays.toString() 필요없다).
 *  Collection 인터페이스 계열은 정렬이 가능.
* */