package javaLec.ExInterface.ex04_IWeek;

import java.util.Scanner;

class MeaningfulConst{
	public static void main(String[] args) {
		System.out.println("오늘의 요일을 선택하세요");
		System.out.println("1.월요일 2.화요일 3.수요일 ");
		System.out.println("4.목요일 5.금요일 6.토요일 7.일요일");
		System.out.print("선택: ");
		Scanner scan = new Scanner(System.in);
		int sel = scan.nextInt();
		switch(sel) {
		case IWeek.MON:
			System.out.println("주간 회의가 있습니다.");
			break;
		case IWeek.TUE:
			System.out.println("프로젝트 기획회의가 있습니다.");
			break;	
		case IWeek.WED:
			System.out.println("진행사항 보고가 있습니다.");
			break;
		case IWeek.THU:
			System.out.println("사내 축구시합이 있습니다.");
			break;
		case IWeek.FRI:
			System.out.println("프로젝트 마감일입니다.");
			break;
		case IWeek.SAT:
			System.out.println("가족과 여행을 떠납니다.");
			break;
		case IWeek.SUN:
			System.out.println("오늘은 휴일입니다.");
			break;
		}
	}
}