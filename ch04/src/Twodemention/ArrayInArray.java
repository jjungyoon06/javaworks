package Twodemention;

public class ArrayInArray {

	public static void main(String[] args) {
		
		int[][] mathScores = new int[2][3];
		//정수형 배열은 값을 입력하지 않으면 0
		System.out.println(mathScores.length); 	  //행의 길이
		System.out.println(mathScores[0].length); //열의 길이
		System.out.println(mathScores[1].length); //열의 길이
		
		for(int i= 0; i<mathScores.length; i++) {
			for(int j=0; j<mathScores[i].length; j++) {
				System.out.println("mathScores[" + i + "][" + j + "]" + mathScores[i][j]);
			}
		}
		System.out.println(); //값 초기화
		
		int[][] englishScore = new int[2][];
		englishScore[0] = new int[2];
		englishScore[1] = new int[3];
		
		for(int i= 0; i<englishScore.length; i++) {
			for(int j=0; j<englishScore[i].length; j++) {
				System.out.println("englishScore[" + i + "][" + j + "]" + englishScore[i][j]);
			}
		}
		
		int[][] javaScore = {
				{95, 80},
				{92, 96, 80}
		};
		
		for(int i= 0; i<javaScore.length; i++) {
			for(int j=0; j<javaScore[i].length; j++) {
				System.out.println("javaScore[" + i + "][" + j + "]" + javaScore[i][j]);
			}
		}
		
	}

}
