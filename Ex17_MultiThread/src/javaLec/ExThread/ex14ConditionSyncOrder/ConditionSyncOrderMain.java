package javaLec.ExThread.ex14ConditionSyncOrder;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class StringComm{
	String newString;
	boolean isNewString;
	final ReentrantLock entLock =new ReentrantLock();
	final Condition readCond = entLock.newCondition();
	final Condition writeCond = entLock.newCondition();
	/* �ٸ� �����尡 �̹� lock�� �ɾ��� ���� ���Դ��
	 * ���� ���� �����ϸ� �ٸ� ������ �� ������ lock�� �Ǵ�.
	 * 
	 * 1) lock�� �ڹ���� ��ٴ�.
	 * 2) signal�̳� await�� ���� �����ȴ�.
	 * 3) lock�� ���� �Ļ��� condition��(await, signal)�� �ݵ�� lock~unlock �ȿ��� ����Ǿ�� �Ѵ�.
	 * 
	 * �̰������� condition�� ����ϱ� ���� ������ �����ϴ� �ǹ�
	 */
	public void setNewString(String news) {
		entLock.lock();
		try {
			if(isNewString == true) {//�ʱ� ���� isNewString�� false����
				writeCond.await(); //������ ������
			}
			newString = news;
			isNewString =true; //true�� ��ȯ
			readCond.signal(); //notify, await�� �ƿ��
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			entLock.unlock();
		}
	}
	
	public String getNewString() {
		String retStr = null;
		entLock.lock();
		try {
			if(isNewString == false) {
				readCond.await(); //wait, ������ ��� ����
			}
			retStr = newString;
			isNewString = false;
			writeCond.signal();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}finally {
			entLock.unlock();
		}
		return retStr;
	}
}

class StringReader extends Thread{
	StringComm comm;
	
	public StringReader(StringComm comm) {
		this.comm = comm; //������ ����
	}
	
	public void run() {
		String[] strs = {"���", "��", "�ҵ���", "�޷�", "����"};
		String readStr;
		for(int i=0; i < 5; i++) {
			//1�� ~ 3�� �̸��� �ð����� �������� �ܾ� ����
			int num = (int)(Math.random()*2000)+1000; //1000���� 2999����
			try{
				sleep(num);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			comm.setNewString(strs[i]);
		}
	}
}

class StringWriter extends Thread{
	StringComm comm;
	public StringWriter(StringComm comm) {
		this.comm = comm;
	}
	
	public void run() {
		for(int i=0; i <5; i ++) {
			System.out.println("read String: "+ comm.getNewString());
		}
	}
}
public class ConditionSyncOrderMain {
	public static void main(String[] args) {
		StringComm strComm = new StringComm();
		StringReader sr = new StringReader(strComm);
		StringWriter sw = new StringWriter(strComm);
		System.out.println("����� ������ ����...");
		sr.start();
		sw.start();
	}
}

/*
await / signal
lock / unlock
 */


