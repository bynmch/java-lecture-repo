package com.ohgiraffers.section01.list.comparator;

import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.Comparator;

public class DescendingAuthor implements Comparator<BookDTO> {


    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return -o1.getAuthor().compareTo(o2.getAuthor());
    }
}
/* 필기.
 *  implements할 떄 제네릭 타입 구체적으로 적어줘야... 안하면 다운 캐스팅해주어야하는 귀찮음이....
 *  자체 클래스에서 정렬할 때는 Comparable
 *  외부 클래스에서 정렬할 때는 Comparator
* */