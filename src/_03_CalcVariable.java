/* 자료형이란?
      -기본타입(Primitive Type): 숫자(byte, short, int, long, char' ', float, double)
                                 논리(boolean)
      -참조타입(Reference Type): 클래스, string" ", 인터페이스, array, 열거
*/
/* 정수 자료형
      -byte(1byte)
      -short(2byte)
      -int(4byte)
      -long(8byte)
      -> 시대의 변화에 따라 단위도 바뀌게 된다
*/
/* 문자 자료형
 *       -char(2byte, unicode): 문자자료형이지만 내부적으로는 숫자저장
 *       -utf-8: 영어 1byte, 한글 3byte
*/
/* 실수형(부동소수형)
 *       -double(8byte)
 *       -float(4byte)
 *       -> 무한대의 범위이기 때문에 근사치로 저장된다
 */
/* 메모리 공간
 *       -Data: 'Stack'에는 int 'Heap'에는 string, class, array(int[] 포함) 등..
 *       -Method
 * 
 */
public class _03_CalcVariable {
   public static void main(String[] args) {
      int num0=100;
      int num1=200;
      System.out.println(num0+num1);
      System.out.println(num0-num1);
      System.out.println(num0*num1);
      System.out.println(num0/num1);
   }
}