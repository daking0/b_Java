//Math.random() : 0~0.99999...까지의 double 랜덤호출
public class _7_Random {

	public static void main(String[] args) {
		for(int j =0; j < 10; j++) {
			for(int i =0; i< 10; i++) {
				int value = (int)(Math.random() * 100);
				System.out.print(value + ", ");
			}
			System.out.println();
		}
		

	}
}
