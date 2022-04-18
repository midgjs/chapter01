package com.javaex.ex03;

import java.util.Scanner;

public class Ex0501 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		int time = sc.nextInt();
		if(time<=8) {
			int pay = time*10000;
			System.out.println("임금은" +pay+ "원 입니다.");
		}else {
			int pay = 8*10000 + (time-8)*12000;
			//if나 else 중 한쪽으로만 처리되기 때문에 int pay로 써야한다.
			System.out.println("임금은 " +pay+ "원 입니다.");
		//{} 빠져나가면 메모리 사라진다.
		}
		sc.close();
		/*
		int time = sc.nextInt();
		int pay;
		if(8 >= time ) {
			pay =  time*10000;
		
		}
		else {
			pay = 8*10000 + 12000*(time-8);
			
		}
		System.out.println("임금은 " + pay + "원 입니다.");
		*/
	}
}
