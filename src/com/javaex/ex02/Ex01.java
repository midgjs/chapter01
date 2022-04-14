package com.javaex.ex02;

public class Ex01 {
	
	public static void main(String[] args) {
		int i = 2345;
		double d = 3.14;
		char c = '한';
		String s = "한";
		String str = "굿모닝";
		String name = "이재훈";
				
		System.out.println("안녕하세요");
		System.out.println(str);
		/* 
		 println은 줄바꿈하고 끝남 
		 print는 줄바꿈 안하고 끝남
		*/
		
		System.out.print("안녕");
		System.out.println("하세요");
		
		System.out.println(str + str + "안녕하세요");
		System.out.println(str + i); // i가 정수형에서 문자열로 변경된다
		String var01 = str+i;
		System.out.println(str + " 랑 " + i); //공백도 문자
		
		System.out.println(str + d + i); //굿모닝3.142345
		
		System.out.println(i + i);
		System.out.println(d + d);
		System.out.println(i + d); //숫자끼리는 계산됨
		
		System.out.println(c);
		System.out.println(c + c); //글자를 코드값으로 읽어서 숫자로 연산된다. 
								   //실무상 대부분 문자열(String)로 처리한다.
		
		System.out.println(s);
		System.out.println(s + s);
		
		System.out.println("제 이름은 " + name + " 입니다.");
		
		System.out.println("====================");
		
		System.out.println("안녕\n하세요");
		System.out.println("안녕\t하세요");
		System.out.println("안\t하세요");
		System.out.println("안녕히\t하세요"); //\t는 처음 시작한 글자에서 부터 일정한 간격 띄어쓰기
		
		System.out.println("안녕\"하\"세요");
		System.out.println("안녕\\하\\세요");
		
	}
}
