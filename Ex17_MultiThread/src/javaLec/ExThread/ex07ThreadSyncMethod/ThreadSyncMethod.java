package javaLec.ExThread.ex07ThreadSyncMethod;

class Calculator{
	int opCnt = 0;
	/* synchronized(=동기화) 을 메서드에 포함시키면
	 * 이 메서드의 연산이 끝나기 전에는 다른 쓰레드로 제어권이 넘어가지 않는다.
	 * 동기화되는 그 순간엔 단일쓰레드가 되는 것
	 * 
	 * 동기화의 단점
	 * 동시에 여러 개 쓰레드가 접근할 수 없으므로 연산하는 쓰레드 외에는 대기상태에 놓인다
	 * 즉, 연산 시간이 길어지게 된다.
	 */
	public synchronized 
	int add(int n1, int n2) {
		opCnt++;  //add와 min이 공유하므로 여기가 동기화의 대상
		return n1+n2;
	}
	
	public int min(int n1, int n2) {
		opCnt++; //동기화의 대상
		return n1-n2;
	}
	
	public void showOpCnt() {
		System.out.println("총 연산 회수: "+opCnt);
	}
}

class AddThread extends Thread{
	
	Calculator cal;
	
	public AddThread(Calculator cal) {
		this.cal = cal;
	}
	
	public void run() {
		for(int i =0; i<1000; i++) {
			System.out.println("1+2 = " + cal.add(1, 2));
			System.out.println("2+4 = " + cal.add(2, 4));
		}
//		System.out.println("1+2 = " + cal.add(1, 2));
//		System.out.println("2+4 = " + cal.add(2, 4));
	}
}

class MinThread extends Thread{
	
	Calculator cal;
	
	public MinThread(Calculator cal) {
		this.cal = cal;
	}
	
	public void run() {
		for(int i =0; i<1000; i++) {
			cal.min(2, 1);
			cal.min(4, 2);
//			System.out.println("1+2 = " + cal.add(1, 2));
//			System.out.println("2+4 = " + cal.add(2, 4));
		}
//		System.out.println("2-1 = " + cal.min(2, 1));
//		System.out.println("4-2 = " + cal.min(4, 2));
	}
}


public class ThreadSyncMethod {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		AddThread at = new AddThread(cal);
		MinThread mt = new MinThread(cal);
		at.start();
		mt.start();
		try {
			at.join();
			mt.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		cal.showOpCnt();
	}
}
