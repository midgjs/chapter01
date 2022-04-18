package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {
		
		int i=1;
		
		while(true) {
			//조건이 되면 탈출
			if(i%6==0 && i%14==0) {
				System.out.println(i);
				break;
			} else {
				i = i+1; //else생략하고 i= i+1 만 써도 가능
			}
			
			
			
		}
		
		
	}

}
/*
		int i=1;
		
		while(true) {
			
			if(i%6==0 && i%14==0){
				//if문이 true
				System.out.println(i);
				break;
			}
			
			i++;
			
		}
*/