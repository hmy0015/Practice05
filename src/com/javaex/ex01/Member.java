package com.javaex.ex01;

public class Member {
	private String id, name;
	private int point;
	
	public Member(String name, String id, int point) {
		this.name = name;
		this.id = id;
		this.point = point;
	}
	
	// id
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	// name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	// point
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	// showInfo
	public void showInfo() {
		System.out.println("회원정보 : " + name + "(" + id + "), " + point + "점");
	}
}
