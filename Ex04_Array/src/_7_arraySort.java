import java.util.Arrays;
/*배열의 정렬
 * 둘다 오름차순 정렬(작은 수 에서 큰 수로)
 * Arrays.sort(scores); -데이터가 적을 때
 * Arrays.parallelSort(scores); -데이터가 많을 때
 * 
 * 한 번에 문자열로  배열의 데이터를 확인하려고 할 땐 Arrays.toString(scores); ->배열의 모든 값이 문자열
 */
public class _7_arraySort {

	public static void main(String[] args) {
		int[] scores = {98,12,52,68,78,98,99,100,23,65};
		
		System.out.println(Arrays.toString(scores));
		//정렬
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
	}
}



/*
 * Arrays.toString(scores) ->배열 한번에 확인 가능
 */
