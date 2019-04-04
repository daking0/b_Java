package javaLec.ExThread.ex12NewspaperStory;

//class NewsPaper{
//	String todayNews;
//	boolean isTodayNews = false;
//	
//	public void setTodayNews(String news) {
//		todayNews = news;
//		isTodayNews = true;
//		synchronized(this) {
//			notifyAll(); //wait상태의 모든 쓰레드가 깨어난다.
//			//notify(); //wait상태의 1개 쓰레드만 깨어난다. 먼저 잡힌 애만 실행되고 나머진 잠들어있다.
//		}
//	}
//	
//	public String getTodayNews() {
//		
//		if(isTodayNews == false) { //초기값이 false라 바로 실행
//			try {
//				synchronized(this) { //실행되자마자 잠가버린다
//					/*notify(신호)가 올 때까지 쓰레드 대기상태
//					 * 쓰레드가 잠이 드는 상태
//					 * synchronized(this) 해제
//					 */
//					wait(); //여기서 2개의 reader객체쓰레드 모드 대기
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
//		paper.setTodayNews("류현진이 2승을 거두었습니다~");
//	}
//}
//
//class NewsReader extends Thread{
//	NewsPaper paper;
//	public NewsReader(NewsPaper paper) {
//		this.paper = paper;
//	}
//	public void run() {
//		System.out.println("오늘의 뉴스: " + paper.getTodayNews());
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
//			reader2.start(); //동기화 안하면 null return
//			Thread.sleep(1000);
//			writer.start(); //notifyAll을 하면서 위에 멈춰있던 start들도 시작된다
//			
//			reader1.join();
//			reader2.join();
//			writer.join();
//		}catch(InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//}




//writer가 먼저 동작하게 만들고 싶은데 Thread는 순서 상관없따고 시작하자마자 제어권 넘어갈 수 있따고
//그래서 writer 무조건 먼저 동작하게 만들려면 동기화 작업을 해야한다구~
class NewsPaper {
String todayNews;

boolean isTodayNews = false;

public void setTodayNews(String news) {
   todayNews = news;
   isTodayNews = true; // 나 데이터 있어!
   
   synchronized (this) { // 동시에 실행되지 않도록
      notifyAll(); // wait상태의 모든 Thread가 모두 깨어난다
      //notify();   //wait상태의 1개 Thread가 깨어난다
   }
}

public String getTodayNews() {
   if (isTodayNews == false) { // 동시에 실행되지 않도록
      try {
         synchronized (this) { // 들어가자 마자 잠겨버림
            // notify (신호)가 올때까지 대기 상태
            // Thread가 잠이드는 상태
            // synchronized (this) 해제
            wait(); //두개의 reader객체Thread 모두 대기 상태 
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

public void run() {// 뉴스를 저장한는 역할
   paper.setTodayNews("말랑이가 깨끗해졌습니다!");
}
}

class NewsReader extends Thread {
NewsPaper paper;

public NewsReader(NewsPaper paper) {
   this.paper = paper;
}

public void run() { // 뉴스를 읽어오는 역할
   System.out.println("오늘의 뉴스 : " + paper.getTodayNews());
}
}

public class NewsPaperStory {
public static void main(String[] args) {
   NewsPaper paper = new NewsPaper();
   NewsReader reader1 = new NewsReader(paper);
   NewsReader reader2 = new NewsReader(paper);
   NewsWriter writer = new NewsWriter(paper);

   try {
      reader1.start();//1.reader 객체의 run이 불러져와
      reader2.start();//3.reader 모두 대기상태 였다가 1초 후 writer 실행됐을때 깨어나서 진행한다.
      Thread.sleep(1000);
      writer.start();//2.writer 객체의 run이 움직이다아앙

      reader1.join();
      reader2.join();
      writer.join();
   } catch (InterruptedException e) {
      e.printStackTrace();
   }

}
}