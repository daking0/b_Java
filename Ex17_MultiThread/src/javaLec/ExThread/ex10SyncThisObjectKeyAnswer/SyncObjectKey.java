package javaLec.ExThread.ex10SyncThisObjectKeyAnswer;
/* at1.run()�� ȣ���ϴ� �����尡 num1�� ������ �ϰ� �ִ�.
 * �� �� at2.run()�� ȣ���ϴ� �����尡 num2�� ������ �ϰ� �ִٸ�
 * �� ���� ���ÿ� ������ �̷������ ������ ����.
 * �׷��Ƿ� �Ʒ�ó�� ������ synchronized�� �� �ٿ��ָ� �ӵ��� �������� ���� ����ȭ�� �ȴ�. 
 */
class IHaveTwoNum{
	int num1 =0;
	int num2 = 0;
	Object key = new Object();
	
	public void addOneNum1() {
		synchronized(this){ //���ο� object�� �����ϱ� this�� ��� ����
			num1 += 1;
		}
	} 
	
	public void addTwoNum1() {
		synchronized(this){
			num1 += 2;
		}
	}
	
	public void addOneNum2() {
		synchronized(key){
			num2 += 1;
		}
	}
	
	public void addTwoNum2() {
		synchronized(key){
			num2 += 2;
		}
	}
	
	public void showAllNums() {
		System.out.println("num1: "+ num1);
		System.out.println("num2: "+ num2);
	}
}

class AccessThread extends Thread{
	IHaveTwoNum twoNumInst;
	public AccessThread(IHaveTwoNum inst) {
		twoNumInst = inst;
	}
	
	public void run() {
		twoNumInst.addOneNum1();
		twoNumInst.addTwoNum1();
		twoNumInst.addOneNum2();
		twoNumInst.addTwoNum2();
	}
}

public class SyncObjectKey {
	public static void main(String[] args) {
		IHaveTwoNum numInst = new IHaveTwoNum();
		AccessThread at1 = new AccessThread(numInst);
		AccessThread at2 = new AccessThread(numInst);
		at1.start();
		at2.start();
	
		try {
			at1.join();
			at2.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		numInst.showAllNums();
	}
}
