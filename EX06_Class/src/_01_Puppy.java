/*<클래스의 목적>
 * 1)Method시대보다 더 복잡해져서 더 큰 단위가 필요하다.
 * 2)큰 프로그램을 적절한 단위로 이해하고 해결함
 * 3)Method를 재활용하려고 시도했더니 생각보다 잘 안됨.
 * 왜냐하면 Method는 결국 매개변수로 관련된 변수를 받아야 하니까
 * 또 Method는 자기와 관련있는 다른 Method를 필요로 하니까
 * 그래서 아예 관련있는 것들은 Class라는 이름으로 다 묶어버리자
 * 4)그래서 Class는 상당히 독립적인 형태를 취하고 있고 어느정도는 재사용성이 높아졌다.
 * 심지어는 객체지향 방법론이 나오고  나서 미래에는 개발자가 사라질 것이라고 예측한 전문가들도 있었다.
 * 5)객체지향에서 재사용성은 Framework의 제작으로 어느정도는 성공했지만 개발자가 없어질 일은 없다.
 * 6)식당클래스, 객체지향은 현실세계를 모델링했다고 표현
 * 식당 - 식당주인(매출,비법) / 위생공무원(청결, 규격) / 손님(맛, 가격)
 * 7)실제는 현실을 그대로 옮기는 것은 불가능하고 현재 내가 대상(object)에 대한 관심사(요구사항)에 대해서만 제한적으로 프로그래밍하게 된다.
 * 8)그러나 표준적인 기능들은 FrameWork라는 형태로 설계되어 자주 사용되게 된다.
 * 이 FrameWork를 사용하기 위해서 개발자가 필요하다.
 */
/*class = Field(명사) + Method(동사)
 * 
 */
public class _01_Puppy {
		//Field(멤버 변수)
		String leftEye = "왼쪽눈";
		String rightEye = "오른쪽눈";
		String mouth = "입";
		String nose = "코";
		String tail = "꼬리";
		String[] legs = new String[4];
		
		public void pretty() {
			System.out.println(tail+ "를 흔든다.");
		}
		
		public void eat() {
			System.out.println(nose + "를 킁킁 거린다");
		}
		
		public void sleep() {
			System.out.println(leftEye + " 을 감는다");
			System.out.println(rightEye + " 을 감는다");
		}
		
		public static void main(String[] args) {
			//푸들          모모
			_01_Puppy puppy = new _01_Puppy();
			puppy.pretty();
			puppy.eat();
			puppy.sleep();
		}

}
