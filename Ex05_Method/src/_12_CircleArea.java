import java.util.Scanner;

/*원의 반지름 입력받기
 *원의 넓이 구하는 메서드 제작
 *원의 둘레 구하는 메서드 제작
 *사용해보세요
 */
public class _12_CircleArea {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("반지름을 입력하세요: ");
		double circle =scan.nextDouble();
		
		double care = carea(circle);
		System.out.println("넓이는 "+care);
		cference(circle);
	}
	
	public static double carea(double circle) {
		double carea = circle * circle * 3.14;
		return carea;
	}
	
	public static void cference(double circle) {
		double cference = circle * 2 * 3.14;
		System.out.println("둘레는 "+cference);
	}

}
