/* 배열(Array)
 * 配 : 짝  列: 나란히 줄서있다
 * 같은 종류의 자료형끼리 연속되어 선언된다
 * ex)학생들의 국어점수
*/
public class _01_array {

	public static void main(String[] args) {
		//학생 5명의 국어점수 선언
		
		//int 자료형을 kor 대표명으로 '연속적으로' 5개 할당한다.
		int[] kor = new int[5];
		kor[0] = 88;
		kor[1] = 99;
		kor[2] = 90;
		kor[3] = 87;
		kor[4] = 79;
		
		for(int i =0 ; i < kor.length; i++) {
			System.out.println(kor[i]);
		}
//		System.out.println(kor[0]);
//		System.out.println(kor[1]);
//		System.out.println(kor[2]);
//		System.out.println(kor[3]);
//		System.out.println(kor[4]);
//		
		
	}
}
