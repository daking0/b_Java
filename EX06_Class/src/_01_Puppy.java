/*<Ŭ������ ����>
 * 1)Method�ô뺸�� �� ���������� �� ū ������ �ʿ��ϴ�.
 * 2)ū ���α׷��� ������ ������ �����ϰ� �ذ���
 * 3)Method�� ��Ȱ���Ϸ��� �õ��ߴ��� �������� �� �ȵ�.
 * �ֳ��ϸ� Method�� �ᱹ �Ű������� ���õ� ������ �޾ƾ� �ϴϱ�
 * �� Method�� �ڱ�� �����ִ� �ٸ� Method�� �ʿ�� �ϴϱ�
 * �׷��� �ƿ� �����ִ� �͵��� Class��� �̸����� �� ���������
 * 4)�׷��� Class�� ����� �������� ���¸� ���ϰ� �ְ� ��������� ���뼺�� ��������.
 * ������� ��ü���� ������� ������  ���� �̷����� �����ڰ� ����� ���̶�� ������ �������鵵 �־���.
 * 5)��ü���⿡�� ���뼺�� Framework�� �������� ��������� ���������� �����ڰ� ������ ���� ����.
 * 6)�Ĵ�Ŭ����, ��ü������ ���Ǽ��踦 �𵨸��ߴٰ� ǥ��
 * �Ĵ� - �Ĵ�����(����,���) / ����������(û��, �԰�) / �մ�(��, ����)
 * 7)������ ������ �״�� �ű�� ���� �Ұ����ϰ� ���� ���� ���(object)�� ���� ���ɻ�(�䱸����)�� ���ؼ��� ���������� ���α׷����ϰ� �ȴ�.
 * 8)�׷��� ǥ������ ��ɵ��� FrameWork��� ���·� ����Ǿ� ���� ���ǰ� �ȴ�.
 * �� FrameWork�� ����ϱ� ���ؼ� �����ڰ� �ʿ��ϴ�.
 */
/*class = Field(���) + Method(����)
 * 
 */
public class _01_Puppy {
		//Field(��� ����)
		String leftEye = "���ʴ�";
		String rightEye = "�����ʴ�";
		String mouth = "��";
		String nose = "��";
		String tail = "����";
		String[] legs = new String[4];
		
		public void pretty() {
			System.out.println(tail+ "�� ����.");
		}
		
		public void eat() {
			System.out.println(nose + "�� ůů �Ÿ���");
		}
		
		public void sleep() {
			System.out.println(leftEye + " �� ���´�");
			System.out.println(rightEye + " �� ���´�");
		}
		
		public static void main(String[] args) {
			//Ǫ��          ���
			_01_Puppy puppy = new _01_Puppy();
			puppy.pretty();
			puppy.eat();
			puppy.sleep();
		}

}
