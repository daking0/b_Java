public class _01_HelloWorld {
   public static void main(String[] args) {
      System.out.println("Hello World");
      System.out.println("안녕하세요");
   }
}

/* High Level Language는 CPU가 이해할 수 있는 언어로 번역
 * 통역사(컴파일러, 인터프리터)
 *       1) 컴파일러:       소스코드 전체를 기계어로 번역
 *                       실행하면 바로 메모리로 전체가 로딩
 *                       속도가 빠름 
 *                       예) 모든 옷을 다 갖춰입고 있다
 *                      C, C++
 *       2) 인터프리터:    소스코드를 한줄씩 읽어서 번역 후 실행
 *                        1줄씩 메모리에 로딩
 *                        속도가 느림
 *                        예) 잠옷을 입고있다
 *                        Basic, Python, JavaScript
 *       3) 중간 방식:    컴파일러 + 인터프리터
 *                      예) 외출복을 준비하고 있다
 *                      Java - JVM(자바가상머신) 상에서 바이트코드를 번역
 *                      C#   - CLR(공통언어런타임)
 */

/* Oak → Java
 * 처음에는 C++언어 프로젝트로 진행하려고 했으나 C++은 컴파일 언어다 보니
 * 여러 기계에 사용하려면 해당 기계마다 컴파일 과정을 거쳐야 하므로 소스코드 그대로 사용하기 어렵다 → 결론에 도달함                                                         
*/