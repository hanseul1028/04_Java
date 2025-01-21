package condition.service;

import java.util.Scanner;

/**
 * 기능(예제, 연습문제) 제공용 클래스
 */
public class ConditionService {

	// 필드(field) == 멤버 변수 == 인스턴스 변수
	// - 해당 클래스(객체) 내에서 언제든지, 어디서든지 사용 가능한 변수
	Scanner sc = new Scanner(System.in);
	
	/**
	 * 1 ~ 10 사이 난수 (정수)가 짝수인지 홀수인지 검사
	 */
	public void method1() {
		
		// Math.random() : 0.0 이상 1.0 미만 난수 발생
		int randomNumber = (int)(Math.random() * 10 + 1);
		
		// 2로 나눴을 때 나머지가 0인지 아닌지 결과를 저장
		// == 0 이면 짝수(true), 1이면 홀수(false)
		boolean result = randomNumber % 2 == 0;
		
		System.out.println("randomNumber : " + randomNumber);
		
		// 조건식 : 결과가 true 또는 false 가 되는 식
		if(result) { // true 인 경우
			System.out.println("짝수 입니다.");
		} else { // false 인 경우
			System.out.println("홀수 입니다.");
		}
	}
		
		/**
		 * 나이를 입력받아 "어린이", "청소년", "성인" 구분
		 * <pre>
		 * 13세 이하 "어린이"
		 * 13세 초과 19세 이하 "청소년"
		 * 19세 초과 "성인"
		 * </pre>
		 * 
		 */
		public void method2() {
			
			System.out.print("나이 입력 : ");
			int age = sc.nextInt();
			
			// if - else if - else 이용
			String result;
			
			if(age > 19) {
				result = "성인";
				
			} else if(age > 13) {
				result = "청소년";
				
			} else {
				result = "어린이";
			}
			
			System.out.println(result);
			
		}
		
		/**
		 * 나이를 입력받아 구분하기
		 * <pre>
		 * 13세 이하 "어린이"
		 * 13세 초과 19세 이하 "청소년"
		 * - 14 ~ 16 : 청소년(중)
		 * - 17 ~ 19 : 청소년(고)
		 * 19세 초과 "성인"
		 * 0 미만 100 이상 : "잘못 입력하였습니다"
		 * </pre>
		 */
		public void method3() {
			System.out.println("나이 입력 : ");
			int age = sc.nextInt();
			
			
			if(age < 0 || age >= 100) {
				System.out.println("잘못 입력하였습니다");
				return; 
			}
			
			String result;
			
			if(age > 19) {
				result = "성인";

			} else if(age > 13) {
				result = "청소년" + ((age <= 16) ? "(중)" : "(고)");
				
			} else {
				result = "어린이";
			}
			
			System.out.println(result);
			
		}
		
		// ----------------------------------------------------------
		/* switch - case - default */
		
		/*
		 * ConditionService에 작성된 메서드를 골라서 실행하는 메서드*/
		public void displayMenu() {
			
			System.out.println("1. method1()");
			System.out.println("2. method2()");
			System.out.println("3. method3()");
			
			System.out.println("메뉴 번호 입력 >> ");
			int input = sc.nextInt();
			
			// (중요) 같은 클래스 내 필드, 메서드는 이름만 부르면 호출 가능
			switch(input) {
			case 1 : method1(); break;
			case 2 : method2(); break;
			case 3 : method3(); break;
			default : System.out.println("없는 메뉴 번호입니다");
			
			}
			
		}
		
		public void method4() {
			System.out.println("[성적판별기]");
			
			System.out.print("이름 : ");
			String name = sc.next();
//			System.out.println(name);
			
			System.out.print("중간고사 점수(40%) : ");
			int num1 = sc.nextInt();
//			System.out.println(num1);
			
			System.out.print("기말고사 점수(50%) : ");
			int num2 = sc.nextInt();
//			System.out.println(num2);
			
			System.out.print("과제 점수(10%) : ");
			int num3 = sc.nextInt();
//			System.out.println(num3);
			

			double score = (num1*0.4 + num2*0.5 + num3*0.1);
			
		
			System.out.println();
			System.out.println(name + "의 최종 점수 :" + score );
					
			System.out.print("성적 : ");
			
			if(score >= 95) {
				System.out.printf("A+");
				
			} else if(score >= 90) {
				System.out.printf("A");
				
			} else if(score >= 85) {
				System.out.printf("B+");
				
			} else if(score >= 80) {
				System.out.printf("B");
				
			} else if(score >= 75) {
				System.out.printf("c+");
				
			} else if(score >= 70) {
				System.out.printf("C");
				
			} else if(score >= 65) {
				System.out.printf("D+");
				
			} else if(score >= 60) {
				System.out.printf("D");
				
			} else {
				System.out.printf("F");
			}
		
	}
}






























