/* �ڷ����̶�?
      -�⺻Ÿ��(Primitive Type): ����(byte, short, int, long, char' ', float, double)
                                 ��(boolean)
      -����Ÿ��(Reference Type): Ŭ����, string" ", �������̽�, array, ����
*/
/* ���� �ڷ���
      -byte(1byte)
      -short(2byte)
      -int(4byte)
      -long(8byte)
      -> �ô��� ��ȭ�� ���� ������ �ٲ�� �ȴ�
*/
/* ���� �ڷ���
 *       -char(2byte, unicode): �����ڷ��������� ���������δ� ��������
 *       -utf-8: ���� 1byte, �ѱ� 3byte
*/
/* �Ǽ���(�ε��Ҽ���)
 *       -double(8byte)
 *       -float(4byte)
 *       -> ���Ѵ��� �����̱� ������ �ٻ�ġ�� ����ȴ�
 */
/* �޸� ����
 *       -Data: 'Stack'���� int 'Heap'���� string, class, array(int[] ����) ��..
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