
public class _17_InfRecul {
	public static void main(String[] args) {
		//showHi(3);
		showHi1(3);
	}
	
	//1을 검사하기 전에 다시 호출하므로 계속 반복한다.
//	public static void showHi(int cnt) {
//		System.out.println("Hi~");
//		showHi(cnt--); //1이 들어와도 여기서 0이 되버리니까
//		if(cnt == 1) //여기에 걸리지 않고 계속 돌아서 스택오버플로우 에러 발생
//			return;
//	}
	
	public static void showHi1(int cnt) {
		System.out.println("Hi~");
		if(cnt == 1) 
			return;
		showHi1(--cnt);
	}

}
