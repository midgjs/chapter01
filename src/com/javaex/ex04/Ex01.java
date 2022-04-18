package com.javaex.ex04;

public class Ex01 {

	public static void main(String[] args) {
		int i = 0; //초기값(1)
		
		while(i<5) { //조건식(2)
			System.out.println("I like java" + i);
			i = i+1; //i++; //증감식(3)
		}
		
	}

}
//초기값 + 조건식 + 증감식
//다섯번 반복 후 메모리 사라짐 // 흔적만 남은 것