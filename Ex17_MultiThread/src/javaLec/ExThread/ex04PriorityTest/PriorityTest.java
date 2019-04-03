package javaLec.ExThread.ex04PriorityTest;
/* 쓰레드의 lifeCycle
 * 1) New : 쓰레드 객체가 생성
 * 2) Runnable :start() 호출 되었을 때
 * 3) Blocked : sleep(), join(), CPU할당이 안되는 상태  ->멈춰있는 상태들
 * 4) Dead : run() 실행이 완료, 쓰레드 관련 메모리 해제
 * 
 * 쓰레드의 메모리
 * 1)메서드 영역(static영역 포함) -공유
 * 2)스택 영역 - 쓰레드 별로 따로 생성  
 * 3)힙 영역 -공유하는 메모리
 */
class MessageSendingThread extends Thread{
	String message;
	MessageSendingThread(String str,int prio){
		message = str;
		setPriority(prio); //우선순위 할당
	}
	
	public void run() {
		for(int i=0; i<1000000; i++) {
			System.out.println(message + "(" + getPriority()+ ")");
			try {
				sleep(1); //현재 쓰레드를 1ms동안 제어권을 중지
				//1번 실행하고 잠깐 다른 애들에게 넘겨준다
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


//우선순위를 줬다고해서 정확히 순서가 지켜지는건 아님