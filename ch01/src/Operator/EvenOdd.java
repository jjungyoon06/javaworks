package Operator;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// 실습 예제 - 숫자 입력받아서 짝수/홀수 판별하는 프로그램 (조건 연산자 활용)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int n = sc.nextInt();
		
		String result;
		//result = (n % 2 == 0) ? "홀수" : "짝수";
		
		//if~else문
		if(n % 2 != 0) {
			result = "홀수";
		}else {
			result = "짝수";
		}
		System.out.println(result);
		
		sc.close();
		
		

	}

}
