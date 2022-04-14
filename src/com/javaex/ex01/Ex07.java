package com.javaex.ex01;

public class Ex07 {
	public static void main(String[] args) {
		
		double v01 = 5/4; //정수끼리계산 -> 정수가 나와야한다
						  //(1 --> 1.0 O) (1.25--> 1.0 x) 
		System.out.println(v01);
		
		double v02 = (double)5/4; //정수는 정수끼리 실수는 실수끼리만 연산가능
		System.out.println(v02);  //'자동형변환' -> 5.0/4.0 = 1.25
		
		double v03 = 5/(double)4; //정수는 정수끼리 실수는 실수끼리만 연산가능
		System.out.println(v03);  //'자동형변환' -> 5.0/4.0 = 1.25
		
		double v04 = (double)5 / (double)4;
		System.out.println(v04);
		
		int v05 = (int)1.3 + (int)1.8;
		System.out.println(v05);
		
	}
}
