package com.javaex.ex01;

public class Ex10 {
	public static void main(String[] args) {
		
		//논리연산자
		int a = 5;
		int b = 7;
		
		//논리 연산자 기본 &&
		System.out.println("&&연산자");
		System.out.println( true && true); //t
		System.out.println( true && false); //f 
		System.out.println( false && true); //f //앞쪽에 이미 false가 나와서 false가 
		System.out.println( false && false); //f //확정이라서 deadcode라고 나온다
		
		//논리 연산자 기본 ||
		System.out.println("||연산자");
		System.out.println( true || true); //t //앞쪽에 이미 true가 나와서 true가 
		System.out.println( true || false); //t //확정이라서 deadcode라고 나온다
		System.out.println( false || true); //t 
		System.out.println( false || false); //f
		
		//논리 연산자 응용
		System.out.println("응용");
		System.out.println( (a>b)&&(a<b) ); //f
		System.out.println( (a>b)&&(a>b) ); //f
		
		System.out.println("================");
		System.out.println( (a>b)||(a<b) ); //t
		System.out.println( (a>b)||(a==b) ); // f||f -> f
		
		//논리 연산자 기본 !
		System.out.println("================");
		System.out.println(a>b); //f
		System.out.println( !(a>b) ); //t
		
		System.out.println(a<b); //t
		System.out.println( !(a<b) ); //f
		
	}
}
