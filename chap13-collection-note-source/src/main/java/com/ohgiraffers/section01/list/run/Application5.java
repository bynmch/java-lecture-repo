package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Application5 {

    public static void main(String[] args) {
        
        /* 수업목표. Queue에 대해 이해하고 활용할 수 있다. */
//        Queue que = new Queue();      //인터페이스이기 때문에 구현하는 하위 타입으로 객체를 생성해서 써야한다.
        Queue que = new LinkedList();   //LinkedList클래스는 Deque를 구현하며 Deque는 Queue를 상속받는다.
                                        //LinkedList클래스는 Queue를 구현하는 것과 같다.

        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("forth");
        que.offer("fifth");

        System.out.println("que = " + que);

        System.out.println("peek(): " + que.peek());
        System.out.println("que = " + que);

        System.out.println("poll(): " + que.poll());
        System.out.println("poll(): " + que.poll());
        System.out.println("poll(): " + que.poll());
        System.out.println("poll(): " + que.poll());
        System.out.println("poll(): " + que.poll());
        System.out.println("que = " + que);

        /* 설명. PriorityQueue를 활용하면 정렬된 상태를 활용할 수 있다.(내부적으로 힙정렬을 사용) */
//        Queue<Integer> priorityQue = new PriorityQueue<>();
//        priorityQue.offer(1);
//        priorityQue.offer(4);
//        priorityQue.offer(5);
//        priorityQue.offer(2);
//        priorityQue.offer(3);
//        System.out.println("priorityQue = " + priorityQue);

        Queue<String> priorityQue = new PriorityQueue<>();
        priorityQue.offer("first");
        priorityQue.offer("second");
        priorityQue.offer("third");
        priorityQue.offer("forth");
        priorityQue.offer("fifth");
        System.out.println("priorityQue = " + priorityQue);



    }
}
/* 필기.
 *  넣는 순서대로 나온다. 데이터의 저장을 히스토리로서 기록한다....
 *  Que는 LinkedList를 객체로 생성한다.
 *  LinkedList는 Que도 가능 Deq도 가능.
* */