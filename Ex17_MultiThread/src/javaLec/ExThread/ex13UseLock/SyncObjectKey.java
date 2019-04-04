package javaLec.ExThread.ex13UseLock;

import java.util.concurrent.locks.ReentrantLock;

class IHaveTwoNum{
	int num1 =0;
	int num2 = 0;
	final ReentrantLock key1 = new ReentrantLock();
	final ReentrantLock key2 = new ReentrantLock(); //여기서는 key가 lock이다
	
	//같은키끼리는 한번에 실행 안됌
	public void addOneNum1() {
		key1.lock(); //바로 lock을 걸어버림(자물쇠)
		num1 += 1;
		key1.unlock(); //열쇠
	} 
	
	public void addTwoNum1() {
		key1.lock(); //위에서 lock걸고 먼저 실행하는 동안은 실행 불가능, unlock되야 실행
		num1 += 2;
		key1.unlock();
	}
	
	public void addOneNum2() {
		key2.lock();
		num2 += 1;
		key2.unlock();
	}
	
	public void addTwoNum2() {
		key2.lock();
		num2 += 2;
		key2.unlock();
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
