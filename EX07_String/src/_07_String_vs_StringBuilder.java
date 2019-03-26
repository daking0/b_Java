
public class _07_String_vs_StringBuilder {
	public static long getStringSpeed() {
		String str = "A";
		String target = "B";
		long start = System.currentTimeMillis(); 
		
		for(int i =0; i<90000;i++)
			str += target;
		
		long end = System.currentTimeMillis();
		
		return end - start;
	}
	public static long getStringBuilderSpeed() {
		StringBuilder str = new StringBuilder("A");
		String target = "B";
		long start = System.currentTimeMillis(); 
		
		for(int i =0; i<90000;i++)
			str.append(target);

		long end = System.currentTimeMillis();
		
		return end - start;
	}
	public static void main(String[] args) {
		long lStrTime = getStringSpeed();
		long lSBTime = getStringBuilderSpeed();
		System.out.println("String 시간: "+lStrTime);
		System.out.println("StringBuider 시간: "+lSBTime);
	}
}
