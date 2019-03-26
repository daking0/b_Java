package javaLec._class.ex10Access;

import java.util.Random;

import javaLec._class.ex09Access.Calculator;

public class CalcMain {
	public static void main(String[] args) {
		Random rand = new Random();
		Calculator calc = new Calculator();
		for(int i=0;i<3;i++) {
			int num1 = rand.nextInt(10)+1;
			int num2 = rand.nextInt(10)+1;
			System.out.println("µ¡¼À"+calc.addTwoNumber(num1, num2));
			System.out.println("»¬¼À"+calc.subTwoNumber(num1, num2));
		}
		calc.showOperatingTimes();
	}
}
