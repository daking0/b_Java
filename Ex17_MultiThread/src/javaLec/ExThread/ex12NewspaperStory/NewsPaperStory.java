package javaLec.ExThread.ex12NewspaperStory;

//class NewsPaper{
//	String todayNews;
//	boolean isTodayNews = false;
//	
//	public void setTodayNews(String news) {
//		todayNews = news;
//		isTodayNews = true;
//		synchronized(this) {
//			notifyAll(); //wait������ ��� �����尡 �����.
//			//notify(); //wait������ 1�� �����常 �����. ���� ���� �ָ� ����ǰ� ������ �����ִ�.
//		}
//	}
//	
//	public String getTodayNews() {
//		
//		if(isTodayNews == false) { //�ʱⰪ�� false�� �ٷ� ����
//			try {
//				synchronized(this) { //������ڸ��� �ᰡ������
//					/*notify(��ȣ)�� �� ������ ������ ������
//					 * �����尡 ���� ��� ����
//					 * synchronized(this) ����
//					 */
//					wait(); //���⼭ 2���� reader��ü������ ��� ���
//				}
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		
//		return todayNews;
//	}
//}
//
//class NewsWriter extends Thread{
//	NewsPaper paper;
//	public NewsWriter(NewsPaper paper) {
//		this.paper = paper;
//	}
//	public void run() {
//		paper.setTodayNews("�������� 2���� �ŵξ����ϴ�~");
//	}
//}
//
//class NewsReader extends Thread{
//	NewsPaper paper;
//	public NewsReader(NewsPaper paper) {
//		this.paper = paper;
//	}
//	public void run() {
//		System.out.println("������ ����: " + paper.getTodayNews());
//	}
//}
//
//public class NewsPaperStory {
//	public static void main(String[] args) {
//		NewsPaper paper = new NewsPaper();
//		NewsReader reader1 = new NewsReader(paper);
//		NewsReader reader2 = new NewsReader(paper);
//		NewsWriter writer = new NewsWriter(paper);
//		writer.start();
//		
//		try {
//			reader1.start();
//			reader2.start(); //����ȭ ���ϸ� null return
//			Thread.sleep(1000);
//			writer.start(); //notifyAll�� �ϸ鼭 ���� �����ִ� start�鵵 ���۵ȴ�
//			
//			reader1.join();
//			reader2.join();
//			writer.join();
//		}catch(InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//}




//writer�� ���� �����ϰ� ����� ������ Thread�� ���� ��������� �������ڸ��� ����� �Ѿ �� �ֵ���
//�׷��� writer ������ ���� �����ϰ� ������� ����ȭ �۾��� �ؾ��Ѵٱ�~
class NewsPaper {
String todayNews;

boolean isTodayNews = false;

public void setTodayNews(String news) {
   todayNews = news;
   isTodayNews = true; // �� ������ �־�!
   
   synchronized (this) { // ���ÿ� ������� �ʵ���
      notifyAll(); // wait������ ��� Thread�� ��� �����
      //notify();   //wait������ 1�� Thread�� �����
   }
}

public String getTodayNews() {
   if (isTodayNews == false) { // ���ÿ� ������� �ʵ���
      try {
         synchronized (this) { // ���� ���� ��ܹ���
            // notify (��ȣ)�� �ö����� ��� ����
            // Thread�� ���̵�� ����
            // synchronized (this) ����
            wait(); //�ΰ��� reader��üThread ��� ��� ���� 
         }
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
   }
   return todayNews;
}
}

class NewsWriter extends Thread {
NewsPaper paper;

public NewsWriter(NewsPaper paper) {
   this.paper = paper;
}

public void run() {// ������ �����Ѵ� ����
   paper.setTodayNews("�����̰� �����������ϴ�!");
}
}

class NewsReader extends Thread {
NewsPaper paper;

public NewsReader(NewsPaper paper) {
   this.paper = paper;
}

public void run() { // ������ �о���� ����
   System.out.println("������ ���� : " + paper.getTodayNews());
}
}

public class NewsPaperStory {
public static void main(String[] args) {
   NewsPaper paper = new NewsPaper();
   NewsReader reader1 = new NewsReader(paper);
   NewsReader reader2 = new NewsReader(paper);
   NewsWriter writer = new NewsWriter(paper);

   try {
      reader1.start();//1.reader ��ü�� run�� �ҷ�����
      reader2.start();//3.reader ��� ������ ���ٰ� 1�� �� writer ��������� ����� �����Ѵ�.
      Thread.sleep(1000);
      writer.start();//2.writer ��ü�� run�� �����̴پƾ�

      reader1.join();
      reader2.join();
      writer.join();
   } catch (InterruptedException e) {
      e.printStackTrace();
   }

}
}