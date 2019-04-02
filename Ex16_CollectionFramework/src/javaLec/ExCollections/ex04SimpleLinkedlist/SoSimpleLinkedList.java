package javaLec.ExCollections.ex04SimpleLinkedlist;

//���� ��ũ�� ����Ʈ Ŭ����
//class Box<T>{
//	T item; //�����ϰ� ���� ��
//	Box<T> prevBox; //�� ���������� ����Ű�� ��������
//	Box<T> nextBox; //�� ���������� ����Ű�� ��������
//	void store(T item) {
//		this.item = item;
//	}
//	T pullOut() {
//		return item;
//	}
//}

//����
class Box<T>{
	T item; //�����ϰ� ���� ��
	Box<T> nextBox; //�� ���������� ����Ű�� ��������
	void store(T item) {
		this.item = item;
	}
	T pullOut() {
		return item;
	}
}


public class SoSimpleLinkedList {
	public static void main(String[] args) {
		Box<String> boxHead = new Box<String>();
		boxHead.store("First String");
		
		boxHead.nextBox = new Box<String>();
		boxHead.nextBox.store("Second String");
		
		boxHead.nextBox.nextBox = new Box<String>();
		boxHead.nextBox.nextBox.store("Third String");
		boxHead.nextBox.nextBox = null;
		
		Box<String> dBox = boxHead;
		while(true) {
			if(dBox ==null)
				break;
			System.out.println(dBox.pullOut());
			dBox = dBox.nextBox;
		}
	}
}
