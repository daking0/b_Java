package javaLec.ExInterface.ex04_IWeek;

import java.util.Scanner;

class MeaningfulConst{
	public static void main(String[] args) {
		System.out.println("������ ������ �����ϼ���");
		System.out.println("1.������ 2.ȭ���� 3.������ ");
		System.out.println("4.����� 5.�ݿ��� 6.����� 7.�Ͽ���");
		System.out.print("����: ");
		Scanner scan = new Scanner(System.in);
		int sel = scan.nextInt();
		switch(sel) {
		case IWeek.MON:
			System.out.println("�ְ� ȸ�ǰ� �ֽ��ϴ�.");
			break;
		case IWeek.TUE:
			System.out.println("������Ʈ ��ȹȸ�ǰ� �ֽ��ϴ�.");
			break;	
		case IWeek.WED:
			System.out.println("������� ���� �ֽ��ϴ�.");
			break;
		case IWeek.THU:
			System.out.println("�系 �౸������ �ֽ��ϴ�.");
			break;
		case IWeek.FRI:
			System.out.println("������Ʈ �������Դϴ�.");
			break;
		case IWeek.SAT:
			System.out.println("������ ������ �����ϴ�.");
			break;
		case IWeek.SUN:
			System.out.println("������ �����Դϴ�.");
			break;
		}
	}
}