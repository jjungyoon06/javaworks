package Methods;

public class CarTest {

	public static void main(String[] args) {
	
		Car myCar = new Car();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재 속도는 " + speed + "km/h 입니다.");
		}

}
