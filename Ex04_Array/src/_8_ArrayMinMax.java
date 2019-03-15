import java.util.Arrays;
import java.util.Scanner;

/*배열에 정수 10개 입력받기
 * 1)for문을 이용해서 비교방식으로 최소값과 최대값 구하기
 2)Arrays.sort를 이용해서 최소값과 최대값 구하기
 */
public class _8_ArrayMinMax {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] list = new int[10];
		
		//배열 입력받기
		for(int i =0; i<list.length;i++) {
			System.out.println((i+1) +"번째 입력하세요.");
			list[i] = scan.nextInt();
		}
		
		//1)for문 이용
		//최대값 찾기
		int most =0 , small = list[0];
		for(int i=0; i<list.length;i++) {
			if(most <= list[i]) {
				most = list[i];
			}
		}
		//최소값 찾기
		for(int i=0; i<list.length;i++) {
			if(small > list[i]) {
				small = list[i];
			}
		}
		
		System.out.println("큰 것은: "+ most + "이고, 작은 것은: "+small);
		
		//2)sort 이용
		Arrays.sort(list);
		System.out.println("큰 것은: "+ list[9] + "이고, 작은 것은: "+list[0]);

	}

}
