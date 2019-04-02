package javaLec.ExCollections.ex14HashMap;
/* Hash는 Hash알고리즘으로 정확한 위치에 데이터 저장/검색
 * Set : value값을 Hash화해서 저장/검색
 * Map : key/value가 있고 key를 Hash화해서 위치를 지정 후 저장하는 것은 value를 저장한다
 *		 key: 계좌번호 / value : 돈
 * Map == (유사어) Dictionary구조
 */
import java.util.HashMap;

public class IntroHashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> hMap = new HashMap<Integer, String>(); //<Integer, String> 앞에가 키 뒤에가 값ㅋ
		hMap.put(new Integer(3), "홍길동");
		hMap.put(5, "임꺽정");
		hMap.put(8, "장길산");
		System.out.println(hMap.get(8));
		System.out.println(hMap.get(5));
		System.out.println(hMap.get(3));
		hMap.remove(5);
		System.out.println(hMap.get(5));
	}
}
