
public class _10_HexValue {

	public static void main(String[] args) {
		 // 10������ 16������ ���: ���� ������ ��� ����
	    System.out.format("%02X%n", 255);  // FF
	    System.out.format("%02x%n", 255);  // ff
	    System.out.format("%X%n"  , 10);   // A


	    String s = String.format("%02X%n", 10); // 16���� ���ڿ��� ��ȯ
	    System.out.println("���ڿ��� ���� ���: " + s); // ���ڿ��� ���� ���: 0A


	    // 10������ 16������: ������ ���
	    System.out.println(Integer.toHexString(255)); // ff
	    System.out.println(Integer.toHexString(255).toUpperCase()); // �빮�ڷ�: FF
	    System.out.println(Integer.toHexString(10).toUpperCase()); // A

	}

}
