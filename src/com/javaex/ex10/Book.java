package com.javaex.ex10;

public class Book {
    int bookNo, stateCode;
    String title, author;
    
    public Book(int bookNo, String title, String author) {
    	this.bookNo = bookNo;
    	this.title = title;
    	this.author = author;   	
    	this.stateCode = 1;
    }
    
    //
    public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	//

	public void rent() {
		// 대여 기능
		this.stateCode = 0;
		System.out.println(title + "이(가) 대여되었습니다.");    	
    }
    
    public void print() {
    	if (stateCode == 0) {
    	System.out.println("No." + bookNo + " / 책 제목 : " + title + " / 작가 : " + author + " / 대여 유무 : 대여중" + "\t");
    	}
    	else if (stateCode == 1) {
        	System.out.println("No." + bookNo + " / 책 제목 : " + title + " / 작가 : " + author + " / 대여 유무 : 재고 있음" + "\t");
    	}
    }
    
}
