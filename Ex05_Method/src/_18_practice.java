import java.util.Random;

public class _18_practice {
	public static void main(String[] args) {
		Random random = new Random();
		int[] list = new int[5];
		
		//값 입력
		for(int i =0; i<list.length;i++) {
			list[i] = random.nextInt(100);
		}
		
		//비교 
		for(int j=0;j<list.length;j++) {
			for(int k=0;k<list.length-1-j;k++) {
				if(list[k+1] < list[k]) {
					int a =list[k] ;
					list[k] = list[k+1];
					list[k+1] = a;
				}
			}
		}
		
		//출력
		for(int i =0; i<list.length;i++) {
			System.out.print(list[i] + " / ");
		}
	}
}
