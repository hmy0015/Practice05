package com.javaex.ex06;


public class CConverterApp {
    public static void main(String[] args) {

        // double dollar;
        CConverter.setRate(1118.70);
        double won = CConverter.toKWR(100);
        double dollar = CConverter.toDoller(100);
        
        //100만원을 달러로 출력하기
        System.out.println("백만원은 " + (dollar * 10000) + "달러입니다.");

        
        //100달려를 원으로 출력하기
        System.out.println("백달러는 " + won + "입니다.");
        
    }

}
