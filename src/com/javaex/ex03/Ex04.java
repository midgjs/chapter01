package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		int time = sc.nextInt();
		if(8<time) {
			System.out.println("임금은" + 12000*time +"원 입니다.");
			
		}else if(time<=0) {
			System.out.println("임금은 0원 입니다.");
			
		}else {
			System.out.println("임금은" + 10000*time +"원 입니다.");
			
		}
		sc.close();
		
		
		
	}

}
