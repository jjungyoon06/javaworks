package chap09;

public class Chatting {
	
	void startChat(String chatID) {
		//String nickName = null;
		//nickName = chatID;
		String nickName = chatID;
		
		class Chat{
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}
			
			void sendMessage(String message) {
				
			}
		}
		
		Chat chat = new Chat();
		chat.start();
	}
}
