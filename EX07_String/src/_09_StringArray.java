
public class _09_StringArray {
	public static void main(String[] args) {
		String[] strArr = new String[] {"È«±æµ¿", "ÀÓ²©Á¤", "Robin"};
		for(String str : strArr)
			System.out.println(str);
		
		String[] strArr1 = new String[3];
		strArr1[0] = new String("Java");
		strArr1[1] = new String("C#");
		strArr1[2] = new String("C++");
		for(int i=0;i<strArr1.length;i++)
			System.out.println(strArr1[i]);
	}
}
