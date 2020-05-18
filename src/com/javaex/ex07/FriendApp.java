package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {
    public static void main(String[] args) {
        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");

        //친구정보 3명 입력 로직 --> 반복문 사용
        for(int i = 0; i < friendArray.length; i++) {
        	// 친구정보(이름) 입력받기
        	System.out.print("이름 : ");
        	String name = sc.next();

        	// 친구정보(핸드폰) 입력받기
        	System.out.print("핸드폰 : ");
        	String hp = sc.next();

        	// 친구정보(학교) 입력받기
        	System.out.print("학교 : ");
        	String school = sc.next();

        	friendArray[i] = new Friend(name, hp, school);
        	System.out.println("-----------------------------");
        }
        
        for (int i = 0; i < friendArray.length; i++) {
        	friendArray[i].showInfo();
        }
        sc.close();
    }
}
