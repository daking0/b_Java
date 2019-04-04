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
	/* 다른 쓰레드가 이미 lock을 걸었을 경우는 진입대기
	 * 내가 먼저 진입하면 다른 쓰레드 못 들어오게 lock을 건다.
	 * 
	 * 1) lock은 자물쇠로 잠근다.
	 * 2) signal이나 await에 의해 해제된다.
	 * 3) lock에 의해 파생된 condition들(await, signal)은 반드시 lock~unlock 안에서 제어되어야 한다.
	 * 
	 * 이곳에서는 condition을 사용하기 위한 영역을 설정하는 의미
	 */
	public void setNewString(String news) {
		entLock.lock();
		try {
			if(isNewString == true) {//초기 현재 isNewString은 false상태
				writeCond.await(); //쓰레드 대기상태
			}
			newString = news;
			isNewString =true; //true로 전환
			readCond.signal(); //notify, await을 꺠운다
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
				readCond.await(); //wait, 쓰레드 대기 상태
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
		this.comm = comm; //의존성 주입
	}
	
	public void run() {
		String[] strs = {"사과", "쌀", "소독약", "달러", "가방"};
		String readStr;
		for(int i=0; i < 5; i++) {
			//1초 ~ 3초 미만의 시간동안 간격으로 단어 전달
			int num = (int)(Math.random()*2000)+1000; //1000부터 2999까지
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
		System.out.println("입출력 쓰레드 실행...");
		sr.start();
		sw.start();
	}
}

/*
await / signal
lock / unlock
 */


