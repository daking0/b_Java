package javaLec.ExThread.ex04PriorityTest;
/* �������� lifeCycle
 * 1) New : ������ ��ü�� ����
 * 2) Runnable :start() ȣ�� �Ǿ��� ��
 * 3) Blocked : sleep(), join(), CPU�Ҵ��� �ȵǴ� ����  ->�����ִ� ���µ�
 * 4) Dead : run() ������ �Ϸ�, ������ ���� �޸� ����
 * 
 * �������� �޸�
 * 1)�޼��� ����(static���� ����) -����
 * 2)���� ���� - ������ ���� ���� ����  
 * 3)�� ���� -�����ϴ� �޸�
 */
class MessageSendingThread extends Thread{
	String message;
	MessageSendingThread(String str,int prio){
		message = str;
		setPriority(prio); //�켱���� �Ҵ�
	}
	
	public void run() {
		for(int i=0; i<1000000; i++) {
			System.out.println(message + "(" + getPriority()+ ")");
			try {
				sleep(1); //���� �����带 1ms���� ������� ����
				//1�� �����ϰ� ��� �ٸ� �ֵ鿡�� �Ѱ��ش�
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class PriorityTest{
	public static void main(String[] args) {
		MessageSendingThread t1 =new MessageSendingThread("First", Thread.MAX_PRIORITY);
		MessageSendingThread t2 =new MessageSendingThread("Second", Thread.NORM_PRIORITY);
		MessageSendingThread t3 =new MessageSendingThread("Third", Thread.MIN_PRIORITY
				);
		t1.start();
		t2.start();
		t3.start();
	}
}


//�켱������ ��ٰ��ؼ� ��Ȯ�� ������ �������°� �ƴ�