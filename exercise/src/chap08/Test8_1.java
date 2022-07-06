package chap08;

public class Test8_1 {

	public static void main(String[] args) {
		//1 0 X 0 0
		//2 0 0 X 0
		//3 
		printSound(new Cat());
		printSound(new Dog());
	}
	
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

}
