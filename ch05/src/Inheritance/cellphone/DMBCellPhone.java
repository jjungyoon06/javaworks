package Inheritance.cellphone;

public class DMBCellPhone extends CellPhone {
	int channel;
	
	DMBCellPhone(String model, String color, int channel){
		super(model, color);
		this.channel = channel;
	}
	
	void turnonDMB() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannelDMB(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	
	void turnoffDMB() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
