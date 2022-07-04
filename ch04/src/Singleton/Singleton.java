package Singleton;

public class Singleton {

	//Singleton 객체 생성
	private static Singleton singleton = new Singleton();
	
	//생성자
	private Singleton() {}
	
	//getInstance() 매서드
	public static Singleton getInstance() {
		return singleton;
	}
}

