package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int point = sc.nextInt();
		if(point>=90) { 
			System.out.println("A등급");
		}else if(point>=80) { // 90>point && point>=80 (중요)
			System.out.println("B등급");
		}else if(point>=70) { // 80>point && point>=70 (중요)
			System.out.println("C등급");
		}else if(point>=60) { // 70>point && point>=60 (중요)
			System.out.println("D등급");
		}else {
			System.out.println("F등급");
		}
		
		
		
		
		
		sc.close();
		
		
		
		
	}
}
