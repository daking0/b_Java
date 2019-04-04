package javaLec.ExThread.ex07ThreadSyncMethod;

class Calculator{
	int opCnt = 0;
	/* synchronized(=����ȭ) �� �޼��忡 ���Խ�Ű��
	 * �� �޼����� ������ ������ ������ �ٸ� ������� ������� �Ѿ�� �ʴ´�.
	 * ����ȭ�Ǵ� �� ������ ���Ͼ����尡 �Ǵ� ��
	 * 
	 * ����ȭ�� ����
	 * ���ÿ� ���� �� �����尡 ������ �� �����Ƿ� �����ϴ� ������ �ܿ��� �����¿� ���δ�
	 * ��, ���� �ð��� ������� �ȴ�.
	 */
	public synchronized 
	int add(int n1, int n2) {
		opCnt++;  //add�� min�� �����ϹǷ� ���Ⱑ ����ȭ�� ���
		return n1+n2;
	}
	
	public int min(int n1, int n2) {
		opCnt++; //����ȭ�� ���
		return n1-n2;
	}
	
	public void showOpCnt() {
		System.out.println("�� ���� ȸ��: "+opCnt);
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
