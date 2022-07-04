package Inheritance.cellphone;

public class DMBCellPhoneTest {

	public static void main(String[] args) {
		DMBCellPhone DMBCellPhone = new DMBCellPhone("자바폰", "검정", 10);
		
		System.out.println("모델 : " + DMBCellPhone.model);
		System.out.println("색상 : " + DMBCellPhone.color);
		System.out.println("채널 : " + DMBCellPhone.channel);

		DMBCellPhone.powerOn();
		DMBCellPhone.bell();
		DMBCellPhone.sendVoice("여보세요");
		DMBCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		DMBCellPhone.sendVoice("아~ 예 반갑습니다.");
		DMBCellPhone.hangUp();
		
		DMBCellPhone.turnonDMB();
		DMBCellPhone.changeChannelDMB(12);
		DMBCellPhone.turnoffDMB();
		
		
		
		
	}

}
