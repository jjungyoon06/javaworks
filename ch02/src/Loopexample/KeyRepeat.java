package Loopexample;

import java.util.Scanner;

public class KeyRepeat {

	public static void main(String[] args) {
		// "y" - 계속 반복, "n" - 반복 중단, 그 이와 키는 지원안함
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("계속 반복할까요?(y/n) ");
			String key = scan.nextLine(); //char는 지원하지 않음, 문자 입력
			
			
			//String 클래스의 메서드인 equals()는 문자열 비교할 때 사용
			//숫자를 비교할 때는 "==" 사용
			if(key.equals("y")) { //String형이므로 쌍따옴표 사용
				System.out.println("계속 반복");
			}else if(key.equals("n")) {
				System.out.println("반복 중단");
				break;
			}else {
				System.out.println("지원하지 않는 키입니다.");
			}
		}//while 닫기
		System.out.println("프로그램 종료");
		
		scan.close();
	} //main 닫기
}//class 닫기
