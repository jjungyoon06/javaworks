package chap07;

public class Test7_2 { 
	
	public static void main(String[] args) {
		
	//1 0 X 0 0
	
	//2 자동형변환 '스노우 타이어가 굴러갑니다' 출력
	
	//3 2
	
	/*
	 A a = new B();
	 B b = (B)a; //a가 B의 객체
	 */
	
	//4 X 0 0 0 X X
	
	//5
	Controller controller = new Controller();
	controller.setService(new MemberService());
	controller.service.login();
	
	controller.setService(new AService());
	controller.service.login();	
	
	}

	
	
}
