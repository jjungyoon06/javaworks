package Exception;

public class TryCatchFinally {

	public static void main(String[] args) {
		//실행 : run > run configuration
		//다중 catch ~ finally 구문
		//상위 Exception이 아래에 위치해야 함
		try {
		String data1 = args[0];
		String data2 = args[1];
		
		int value1 = Integer.parseInt(data1); //100
		int value2 = Integer.parseInt(data2); //a200
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}finally {
			System.out.println("다시 실행하세요");
		}

	}

}
