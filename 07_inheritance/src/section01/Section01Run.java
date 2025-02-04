package section01;

public class Section01Run {

	public static void main(String[] args) {
		
		// 부모 객체 생성
		Parent p1 = new Parent();
		System.out.println("Parent의 toString() : " + p1.toString());
		
		System.out.println("-------------------------------");
		
		// Child1 객체 생성
		Child1 c1 = new Child1();
		// *** Parent 객체 생성됨 ***
		// *** Child1 객체 생성됨 ***
		// -> 자식 객체 생성 시 부모 객체도 같이 생성된다
		
		System.out.println("Child1의 toString() : " + c1.toString());
		System.out.println("Child1 만의 필드 laptop : " + c1.getLaptop());

		System.out.println("-------------------------------");
		
		// child2 객체 생성
		Child2 c2 = new Child2();
		System.out.println("Child2의 toString() : " + c2.toString());
		System.out.println("Child2 만의 필드 car : " + c2.getCar());
		
		System.out.println("-------------------------------");
		
	// child3 객체 생성
			Child3 c3 = new Child3();
			System.out.println("Child3의 toString() : " + c3.toString());
			System.out.println("Child3 만의 필드 bitCoin : " + c3.getBitCoin());
	}
}


/* 
 * [상속]
 * - 부모의 코드(필드/메서드)를 자식이 자신의 것 처럼 사용하는 기술
 * 
 * [특징/장점]
 *  1. 재사용성 증가
 *  (한 번 작성한 부모 코드를 자식들이 재사용)
 *  
 *  2. 유지 보수성 증가
 *  (부모 코드만 수정하면 자식도 수정됨)
 *  
 *  3. 공통적인 규약 정의
 *  ( 물려받은 자식들의 형태가 부모와 비슷함)
 *   -> 부모 코드 수정, 추가, 제거 시 자식도 일괄 변경
 *   
 * [상속 키워드] : extends (확장하다)
 *  -> 부모의 필드/메서드를 상속 받은 자식의 크기가 커지기 때문에 "확장하다" 키워드 사용
 *  
 * [상속 주의사항]
 *  1. 부모의 생성자는 상속 X
 * 
 *  2. 부모의 private 필드/메서드는 상속 받은 자식도 직접 접근 불가능
 * 
 * [상속 메모리 구조]
 * - 자식 객체 생성 시 부모 객체가 같이 생성되어 자식 객체 내부에 배치됨
   * 
 * [super() 생성자]
 * - 자식 클래스에서 상위(부모) 클래스 생성자를 호출하는 구문
 * 
 * - 자식의 생성자 첫 번째 
 * 
 * [Object 클래스]
 * - 모든 클래스(객체)의 최상위 부모
 * - 모든 클래스(객체)가 공통적으로 가져야 하는 기능이 모여 있음
 * - 클래스 선언부에 아무런 상속 구문이 작성되지 않으면 컴파일러가 자동으로
 *   [extends Object] 추가
 *   
 *  [오버라이딩 vs 오버로딩]
 *  
 *  오버라이딩(Overriding, 덮어쓰기/재정의)
    - 상속 관계에서 부모의 메서드를 자식이 용도에 맞게 재정의 하는 것
    오버로딩(Overloading, 과적)
    - 하나의 클래스에 같은 이름의 멧서드를 여러 개 작성하는 기술
    
    ** 공통점 **
    - 메서드 이름이 동일해야 한다
    ** 차이점 **
    - 오버라이딩
        - 하위(자식) 클래스에 작성
        - 매개변수(개수, 순서, 개수)  동일
        - 반환형 동일
        - 접근 제어가자 같거나 넓은 범위
        - 예외처리 같거나 좁은 범위
    - 오버로딩
        - 같은 클래스에 작성
        - 매개변수(개수, 순서, 개수)  하나라도 다름
        - 반환형 관계 없음
        - 접근 제어자 관계 없음
        - 예외처리 관계 없음
---
 *  
 *    
 *   [final 예약어]
 *   - final class : 상속 불가 클래스
 *   - final method : 오버라이딩 불가 메서드
 *   - final variable : 값 대입 불가 변수 (상수)
 *   
 *   * 자바에서 클래스간의 상속은 단일 상속만 지원
 */




























