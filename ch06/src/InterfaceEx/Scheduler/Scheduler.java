package InterfaceEx.Scheduler;

public interface Scheduler {

	//다음 전화를 가져오기
	public void getNextCall();
	
	//상담원에게 전화를 배분하기
	public void sendCallToAgent();
	
}
