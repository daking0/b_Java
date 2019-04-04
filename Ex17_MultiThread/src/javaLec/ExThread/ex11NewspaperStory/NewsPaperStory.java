package javaLec.ExThread.ex11NewspaperStory;

class NewsPaper{
	String todayNews;
	
	public void setTodayNews(String news) {
		todayNews = news;
	}
	
	public String getTodayNews() {
		return todayNews;
	}
}

class NewsWriter extends Thread{
	NewsPaper paper;
	public NewsWriter(NewsPaper paper) {
		this.paper = paper;
	}
	public void run() {
		paper.setTodayNews("류현진이 2승을 거두었습니다~");
	}
}

class NewsReader extends Thread{
	NewsPaper paper;
	public NewsReader(NewsPaper paper) {
		this.paper = paper;
	}
	public void run() {
		System.out.println("오늘의 뉴스: " + paper.getTodayNews());
	}
}

public class NewsPaperStory {
	public static void main(String[] args) {
		NewsPaper paper = new NewsPaper();
		NewsReader reader = new NewsReader(paper);
		NewsWriter writer = new NewsWriter(paper);
		writer.start();
		reader.start();
		try {
			reader.join();
			writer.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
//wirte에게 제어권을 먼저 주려면 동기화해야한다.