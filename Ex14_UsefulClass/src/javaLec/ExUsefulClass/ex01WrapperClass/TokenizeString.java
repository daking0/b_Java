package javaLec.ExUsefulClass.ex01WrapperClass;

import java.util.StringTokenizer;

public class TokenizeString {
	public static void main(String[] args) {
		String strData = "11:22:33:44:55";
		StringTokenizer st = new StringTokenizer(strData,":");
		
		while(st.hasMoreElements())
			System.out.println(st.nextToken());
	}
}
