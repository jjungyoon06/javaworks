package type;

public class TypeConversion {

	public static void main(String[] args) {
		//묵시적 형변환
		int iNum = 20;
		float fNum = iNum; //작은 쪽에서 큰 쪽으로 저장 (자동 형변환)
		
		System.out.println(iNum); //20
		System.out.println(fNum); //20.0

		double dNum;
		dNum = iNum + fNum;		  //20 + 20.0
		System.out.println(dNum); //40.0
		
		//명시적 형변환
		double dNum2 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum2 = (int)dNum2 + (int)fNum2; //실수부분 손실
		int iNum3 = (int)(dNum2 + fNum2);
		System.out.println(iNum2); //1 + 0 = 1
		System.out.println(iNum3); //2.1 + 0.9 = 2+0 = 2
	}

}
