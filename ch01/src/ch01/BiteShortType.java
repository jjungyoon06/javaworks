package ch01;

public class BiteShortType {

	public static void main(String[] args) {
		//정수 자료형
		//byte 자료형 범위 : -128 ~ 127 (총 256개 -2의8제곱 [8bit])
		byte bData = -128;
		System.out.println(bData);
		
		//byte bData2 = 128; 범위 초과이므로 오류
		
		//short 범위 : -32768 ~ 32767 (총 65536개 -2의16제곱 [16bit])
		short sData = 32767;
		System.out.println(sData);
		
		//short sData2 = 32768; 범위 초과이므로 오류
	}

}
