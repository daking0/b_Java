import java.util.Scanner;   //ctrl + shift + o 하면 자동생성                                                    

public class _14_InputUserValue {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자 입력하세요.");
		int num = s.nextInt();
		System.out.println(num);

	}

}
