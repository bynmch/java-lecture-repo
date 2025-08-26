package com.ohgiraffers.section04.interfacesegregation.reolved;

public class BasicPrinter implements PrintOnly {
    @Override
    public void print() {
        System.out.println("베이직 프린터");
    }
}
