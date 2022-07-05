package InterfaceEx.remotecontrol;

public class RemoteControlTest {

	public static void main(String[] args) {
		
		
		//Television tv = new Television();
		//RemoteControl rc = new RemoteControl();
		
		//인터페이스형 타입으로 객체 생성
		RemoteControl tv = new Television();
		RemoteControl audio = new Audio();
		
		
		
		tv.turnOn();
		tv.setVolume(12);
		tv.setMute(true);
		tv.setMute(false);
		RemoteControl.changeBattery();
		tv.turnOff();
		System.out.println("=========================");
		
		audio.turnOn();
		audio.setVolume(-1);
		audio.setMute(true);
		audio.setMute(false);
		RemoteControl.changeBattery();
		audio.turnOff();
		System.out.println("=========================");
		
	}

}
