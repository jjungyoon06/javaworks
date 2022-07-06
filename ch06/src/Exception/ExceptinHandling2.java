package Exception;

public class ExceptinHandling2 {

	public static void main(String[] args) {
		//컴파일예외 (일반 예외)
		try {
			Class cls = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e);
		}

	}

}
