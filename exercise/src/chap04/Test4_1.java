package chap04;

public class Test4_1 {

	public static void main(String[] args) {
		//1.
		//if,switch
		
		//2.
		//4
		
		//3
		int score = 85;
		System.out.println("등급은 ");
		if(score < 70) {
			System.out.println("D");
		}else if(score < 80) {
			System.out.println("C");
		}else if(score < 90) {
			System.out.println("B");
		}else {
			System.out.println("A");
		}
		System.out.println("입니다.");
	
		//4
		System.out.println("어떤 혜택을 원하세요?");
		char grade = 'B';
		switch(grade) {
		case 'A' : System.out.println("VVIP 혜택을 받으실 수 있습니다.");
		case 'B' : System.out.println("VIP 혜택을 받으실 수 있습니다."); break;
		case 'C' : System.out.println("우수 혜택을 받으실 수 있습니다.");
		case 'D' : System.out.println("일반 회원 혜택을 받으실 수 있습니다."); break;
		default: System.out.println("VVIP 혜택을 받으실 수 있습니다.");
		}
		System.out.println("감사합니다.");
		
	}//main 닫기
}//class 닫기
