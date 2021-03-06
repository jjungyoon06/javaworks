package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		//LinkedList 객체 생성
		Queue<Message> messageQueue = new LinkedList<>();
		
		//Message 객체 생성
		Message mail = new Message("sendMail", "이양파");
		Message sms = new Message("sendSms", "박마늘");
		Message katalk = new Message("sendKatalk", "오감자");

		//객체 넣기(삭제)
		messageQueue.offer(mail);   //0번 인덱스
		messageQueue.offer(sms);    //1번 인덱스
		messageQueue.offer(katalk); //2번 인덱스
		
		System.out.println("총 객체 수: " + messageQueue.size());
		
		//객체 빼기(0번 인덱스가 계속 나옴)
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSms":
				System.out.println(message.to + "님에게 문자를 보냅니다.");
				break;
			case "sendKatalk":
				System.out.println(message.to + "님에게 카톡을 보냅니다.");
				break;
			}
		}
	}

}
