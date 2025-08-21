package com.ohgiraffers.section03.reference;

public class Member {
    private String memId;

    public Member() {
    }

    public Member(String memId) {
        this.memId = memId;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memId='" + memId + '\'' +
                '}';
    }
}
