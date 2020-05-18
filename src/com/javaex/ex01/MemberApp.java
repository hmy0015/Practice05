package com.javaex.ex01;

public class MemberApp {
	public static void main(String[] args) {
		Member userInfo1 = new Member("정우성", "jws", 50000);
		Member userInfo2 = new Member("유재석", "yjs", 30000);
		Member userInfo3 = new Member("이효리", "lhr", 40000);
	
		userInfo1.showInfo();
		userInfo2.showInfo();
		userInfo3.showInfo();
	}
}
