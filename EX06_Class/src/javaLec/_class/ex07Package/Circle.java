package javaLec._class.ex07Package;
/*1)필드는 일반적으로 private으로 설정한다
 *2)대신 getter나 setter 메서드를 이용해서 값을 넣거나 가져올 수 있도록 한다
 *  getter나 setter는 일반적으로 default 이나 public이 많다
 *3)setter메서드에는 들어오는 값을 확인하는 코드를 넣을 수 있기 때문에
 *  직접 필드를 접근하는 것보다 안전성이 높아진다
 */

/*1)메서드는 기본적으로 default 이나 public을 전제로 한다.
 *->왜냐하면 호출을 기본으로 하기 때문에.
 *2)다만 메서드 중에는 내부에서만 동작하는 것이 있으므로 이런 메서드는 제한을 둔다.(private, protected) 
 */
public class Circle {
	private double rad; //직접 접근 못하도록 
	
	Circle(double r){
		rad = r;
	}
	
	public double getRad() { //get은 값을 데리고오는것
		return rad; //private이라 못얻으니까 get/set으로 부르면 얻을 수 있다
	}

	void setRad(double rad) { //set은 값을 받는것
		if(rad >0) //잘못되는 경우를 방지
			this.rad = rad;
	}

	double circleArea() {
		return rad*rad*3.14;
	}
}
