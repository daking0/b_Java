class Number{
	private int num;
	public Number(int num) {
		this.num = num;
		//this.getNum();
	}
	public int getNum() {
		return this.num;
	}
}

public class _10_ClassArray {
	public static void main(String[] args) {
		Number[] numArr = new Number[3];
		numArr[0] = new Number(3);	
		numArr[1] = new Number(3);	
		numArr[2] = new Number(3);
		for(Number num : numArr)
			System.out.println(num.getNum());
		System.out.println();
		
		Number[] numArr1 = new Number[] {
				new Number(2), 
				new Number(4),
				new Number(8)
		};
		
		for(int i=0; i < numArr1.length; i++)
			System.out.println(numArr1[i].getNum());
		}
}
