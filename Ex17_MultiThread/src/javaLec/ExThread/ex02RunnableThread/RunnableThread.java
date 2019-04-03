package javaLec.ExThread.ex02RunnableThread;

class Sum{
	int num;
	Sum(){
		num =0;
	}
	void addNum(int n) {
		num += n;
	}
	int getNum() {
		return num;
	}
}

/* Thread ����� 2��° ���
 * 1)�̹� �ٸ� Ŭ������ ����� ���� Ŭ������ Thread�� ����� ���� �� ����.(�ڹٴ� ���ϻ�Ӹ� �����ϱ� ������)
 * 2)�̷� ���� Runnable Interface�� ����� �޴´�.
 * 3)�׸��� run()�޼��带 �����Ѵ�. 
 * 4)ThreadŬ������ ��ü�� ����� �������� ���ڷ� Runnable�� ��ӹ��� ��ü�� �־��ش�.
 * 5)start()�� ȣ���ϸ� run()�� �����Ѵ�.
 */
class AdderThread extends Sum implements Runnable{
	int start, end;
	public AdderThread(int s, int e) {
		start = s;
		end =e;
	}
	
	public void run(){
		for(int i=start;i<end;i++) {
			System.out.println(i+"�� ���� �ݺ�");
			addNum(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
	
public class RunnableThread {
	public static void main(String[] args) {
		System.out.println("main ������ ����");
		AdderThread at1 = new AdderThread(1,50);
		AdderThread at2 = new AdderThread(51,100);
		Thread t1 = new Thread(at1);
		Thread t2 = new Thread(at2);
		t1.start();
		t2.start();
		try {
			//t1, t2�� ���������� ������
			t1.join(); //�� �� ���� ������ ��ٸ��� ���̰�(join����)
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1~100������ ��: "+ (at1.getNum() + at2.getNum()) );
		System.out.println("main ������ ����");
	}
}



