package Override;

public class AirplaneMain {

	public static void main(String[] args) {
		
		SuperSonicAirplane sa = new SuperSonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SuperSonicAirplane.SUPERSONIC;
		sa.fly();
		
		sa.flyMode = SuperSonicAirplane.NORMAL;
		sa.fly();
		sa.land();

	}

}
