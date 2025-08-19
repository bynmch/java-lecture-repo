package com.ohgiraffers.section03.map.run;

import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Application1 {

    public static void main(String[] args) {
        
        /* 수업목표. Map의 자료구조에 대해 이해하고 HashMap을 이용할 수 있다. */
        /* 설명. 1. Key가 중복되는 경우 */
        Map<Object, Object> hMap = new HashMap<>();
        hMap.put(new String("one"), new java.util.Date());  //동등하면 같은 키로써 판단(equals와 hashCode로)
        hMap.put(12, "red apple");
        hMap.put(33, 123.0);

        /* 설명. Key로 쓰인 객체는 e, h를 통해 동등함이 판별되면 같은 Key로 취급 */
        System.out.println("키가 \"one\"인 String으로 value를 추출한다면: " + hMap.get(new String("one")));

        System.out.println("hMap = " + hMap);

        /* 설명. Key값은 결국 동등 객체면 같은 Key값으로 보고 같은 Key를 가진 이후에 들어간 Entry(K + V)가 이전 것을 덮어씌움 */
        hMap.put(new BookDTO(1, "홍길동전", "허균", 50000), 10);
        hMap.put(new BookDTO(2, "홍길동전", "허균", 50000), 20);      //중복된 키면 덮어씌우니 주의..!
        System.out.println("hMap = " + hMap);
        System.out.println("20 꺼내보기: " + hMap.get(new BookDTO(2, "홍길동전", "허균", 50000)));

        /* 설명. 2. Value가 중복되는 경우 */
        hMap.put(44, 123.0);
        System.out.println("value가 중복되는 경우: " + hMap);

        /* 설명. Map을 활용해 보자. */
        Map<String, String> hMap2 = new HashMap<>();
        hMap2.put("one", "java17");
        hMap2.put("two", "mariaDB 10");
        hMap2.put("three", "servlet/jsp");
        hMap2.put("four", "vue");

        System.out.println("hMap2 = " + hMap2);

        /* 설명. Map에 담긴 값을 순회해서 확인하는 방법 */
        /* 설명. 1. keySet()을 활용해 Key를 Set으로 바꾸고 iterator를 돌리는 방법 */
        Set<String> keys = hMap2.keySet();
        Iterator<String> iter = keys.iterator();
        while(iter.hasNext()) {
            String key = iter.next();
            System.out.println("key: " + key + ", value: " + hMap2.get(key));
        }

        /* 설명. 2. entrySet()을 활용하는 방법(key와 value를 묶은 Entry 타입을 통해 key없이 value를 추출할 수 있다. */
        Set<Map.Entry<String, String>> entrySet = hMap2.entrySet();
        Iterator<Map.Entry<String, String>> iter2 = entrySet.iterator();
        while(iter2.hasNext()) {
            Map.Entry<String, String> entry = iter2.next();
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue() );
        }
    }
}
/* 필기.
 *  K + V -> Entry
 *  K 중복 안됨
 *  V 중복 허용
 *  equals()와 hashCode()가 반드시 오버라이딩 되어있어야 한다.
 *  제네릭 타입은 구체적으로 명시하는 것이 좋다.
 * 0819
 *  순회하고 싶으면 순회할 수 있는 형태로 바꾸기
 *  Set의 형태로 바꾸기
 *  keySet OR EntrySet
 *  key만얻으면 get(key)로 값을 얻어낼 수 있다.
 *  Entry는 Map안의 내부 인터페이스 -> Map.Entry<> 타입ㅇㅇ
 *  Hashtable: 동기화지원
 *  LinkedHashMap: 저장 순서 유지
 *
 *  Value Object / Data Transfer Object / ...
 *
 *
* */