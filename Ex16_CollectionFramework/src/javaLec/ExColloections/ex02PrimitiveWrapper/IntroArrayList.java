package javaLec.ExColloections.ex02PrimitiveWrapper;

import java.util.ArrayList;
/* Array 구조
 * 1) 물리적으로 연속적인 구조를 가진다
 * 2) 순차적인 데이터 추가나 순차적인 출력에서는 가장 빠른 구조
 * 3) 검색 : 운 나쁘면 가장 뒤에서 찾는다.
 * 4) 삽입 : 중간에 넣을 때 뒤에 있는 데이터를 전부 뒤로 밀어야 함
 * 5) 삭제 : 중간값을 삭제할 때 뒤에있는 데이터를 전부 앞으로 당겨야 함
 * 6) 확장 : 물리적으로 연속된 공간을 확보하지 못하면 새로운 공간에 할당하고 전부 복사한다.  
 * 7) 검색 : 임의의 검색은 순차적으로 검색하다가 나타나면 땡큐
 * 			정렬시는 이진검색/보간검색을 통해 바로 index 점프
 * 고정적인 느낌이다.
 */
public class IntroArrayList {
	//Java에서 범용적으로 모든 클래스를 인자로 받는 메서드는 Object인 경우가 많다.
	public static void printInfo(Object obj) {
		System.out.print(obj.getClass() +":"+obj+"\n");
	}
	public static void main(String[] args) {
		//내부 구조가 배열이다
		//단, 데이터가 늘어나면 알아서 새로운 배열을 할당한다.
		ArrayList<Integer> list = new ArrayList<Integer>();
	
		//데이터의 저장
		list.add(11); //JDK1.5부터는 Primitive -> Integer로 자동변환
		list.add(22);
		list.add(33);
		
		//데이터 출력
		for(int i =0; i<list.size();i++) {
			System.out.println(list.get(i).getClass());
		}
		
		//데이터 삭제
		//array의 특성상 해당 이후의 배열을 전부 한 칸씩 앞으로 당긴다.
		list.remove(0); //인덱스 0번을 삭제
		for(int i =0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("---------------------");
		printInfo(new Integer(100)); //JDK 1.5이전
		printInfo(100);
		Integer i = 100;
		printInfo(i);
	}
}

/*
 * Array : 물리적인 연속
 *  ->전체 저장, 전체 출력 
 * LinkedList : 논리적인 연속
 * ->중간에 수시로 데이터 수정 
 */