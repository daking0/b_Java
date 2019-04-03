package javaLec.ExThread.ex03PriorityTest;

class MessageSendingThread extends Thread{
	String message;
	MessageSendingThread(String str){
		message = str;
	}
	
	public void run() {
		for(int i=0; i<1000000; i++) {
			System.out.println(message + "(" + getPriority()+ ")");
		}
	}
}

public class PriorityTest{
	public static void main(String[] args) {
		MessageSendingThread t1 =new MessageSendingThread("First");
		MessageSendingThread t2 =new MessageSendingThread("Second");
		MessageSendingThread t3 =new MessageSendingThread("Third");
		t1.start();
		t2.start();
		t3.start();
	}
}