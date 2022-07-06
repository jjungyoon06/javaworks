package chap09;

public class Test9_1 {

	public static void main(String[] args) {
		//1 0 0 0 X
		//2 3
		//3 
		Car myCar = new Car();
		
		Car.Tire tire = myCar.new Tire();
		
		Car.Engine engine = new Car.Engine();
		
		//4 
		//Chatting chat = new Chatting();
		//chat.startChat("hero");
		
		//5
		Checkbox checkbox = new Checkbox();
		checkbox.setOnSelectListener(new BackgroundChangeListener());
		checkbox.select();
	}//main

}
