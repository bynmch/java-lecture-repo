package com.ohgiraffers.section05.dependencyinversion.resolved;

public interface MessageSender {
    void sendMessage(String message);
}
/* 필기.
 *  모든 클래스가 이 인터페이스를 의존하도록 만들기
* */