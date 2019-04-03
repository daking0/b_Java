package javaLec.ExThread.ex01ThreadUnderStand;
/* 1) Thread ����� �޴� Ŭ������ �����.
 * 2) run�޼��忡 �����ϰ� ���� ����� �����Ѵ�.(�˹ٻ����� ��Ű�� ���� ��)
 * 3) ������ ��ü�� start()�޼��带 ȣ���Ѵ�.
 * 4) run�޼��尡 ���۵ȴ�.
 */
//������� thread ����
class showThread extends Thread{ 
	String threadName;
	showThread(String threadName) {
		this.threadName = threadName;
	}
	
	public void run() {
		for(int i=0; i<100;i++) {
			System.out.println("�ȳ��ϼ���."+ threadName +" �Դϴ�.");
		}
		try {
			sleep(100);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class ThreadUnderStand {
	public static void main(String[] args) {
		showThread st1 = new showThread("�˹�A ������");
		showThread st2 = new showThread("�˹�B ������");
		st1.start();
		st2.start();
	}
}
