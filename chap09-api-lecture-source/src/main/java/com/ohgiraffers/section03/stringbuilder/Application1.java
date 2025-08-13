package com.ohgiraffers.section03.stringbuilder;

public class Application1 {

    public static void main(String[] args) {
        
        
        /* 수업목표. String과 StringBuilder(또는 StringBuffer)와의 차이정에 대해 이해하고 시용할 수 있다. */
        /* 설명.
         *  String은 불변 객체(immutable object), StringBuilder(또는 StringBuffer)는 가변 객체(mutable object)
        * */
        String testStr = "java";
        StringBuilder testSb = new StringBuilder("kotlin");

        for (int i = 0; i < 20; i++) {
            testStr += i;
            testSb.append(i);

            System.out.println("String의 경우: " + System.identityHashCode(testStr));
            System.out.println("StringBuilder의 경우: " + System.identityHashCode(testSb));
            System.out.println();
        }

        System.out.println("testStr = " + testStr);
        System.out.println("testSb = " + testSb);

        /* 설명. StringBuilder가 가변인 이유 */
        StringBuilder sb2 = new StringBuilder();
        System.out.println("StringBuilder의 초기 용량: " + sb2.capacity());

        StringBuilder sb3 = new StringBuilder("java");
        System.out.println("StringBuilder의 초기 용량(\"java\"): " + sb3.capacity());

        for (int i = 0; i < 30; i++) {
            System.out.println(sb3);
            sb3.append(i);
            System.out.println(sb3.capacity());
        }
    }
}
/* 필기.
 *  StringBuilder는 constant pool을 사용하지 않기 때문에 리터럴값을 받지 못한다.
 *  문자열의 변화가 많을 것 같다면 객체의 주소값이 바뀌지 않는 StringBuilder를 사용하도록 하자.
 *  헷갈리지 않도록 주의
 *  String은 주소값은 변하지만 주소에 들어있는 값이 변하지 않는 불변 객체
 *  StringBuilder는 주소는 변하지 않지만, 들어있는 값이 변하는 가변 객체
 *  여러 사용자가 하나의 객체를 사용하는 환경(멀티쓰레드)에서는 String으로 이용해서 객체가 변하지 않도록 하는 것이 유리함
 *  StringBuilder 비동기화 (속도가 빠름) / StringBuffer 동기화 (속도가 느림)
 *  동기화 처리란: 멀티쓰레드 환경에서 객체에 접근하는 사용자들의 순서를 보장하는 처리
 *  
 *  
* */