/* StringŬ������ ���ڿ��� ������ �Ұ����ϴ�. 
 * �׷��� ���ڿ��� ����Ǹ� ���� �Ҵ��Ѵ�.
 * 
 * StringBuilderŬ������ ���ڿ��� ������ �����ϴ�. 
 * ���ο� char[]�迭�� ������ �����Ѵ�.
 * ���ڿ��� ũ�Ⱑ �þ�� �ڵ����� �������� �ش�.
 * StringBuffer�� ��������(��, ��Ƽ�����忡 ����)
 * 
 * ���ۿ� Java String�� StringBuider �ð� ��
 */
public class _05_StringBuilder {
	public static void main(String[] args) {
		StringBuilder strBuf = new StringBuilder("AB");
		strBuf.append(25); //strBuf ���ο� �迭�� �������� �߰�
		System.out.println(strBuf); //AB25
		strBuf.append('Y').append(true);
		System.out.println(strBuf); //AB25Ytrue
		
		strBuf.insert(2, false); //�ε���2���� false �ֱ�
		System.out.println(strBuf);//ABfalse25Ytrue
		strBuf.insert(strBuf.length(), 'z'); // append('z')�� ����
		System.out.println(strBuf);//ABfalse25Ytruez
		}
}
