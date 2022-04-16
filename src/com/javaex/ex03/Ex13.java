package com.javaex.ex03;

import java.util.Scanner;

public class Ex13 {

	//권장하지 않는 방식(직관적이지 않음)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		
		switch(month) {
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30일");
				break;
			
			case 2:
				System.out.println("28일");
				break;
		}
		
		
		
		sc.close();
		
		
	}

}
