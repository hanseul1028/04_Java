package loop.practice;

import java.util.Scanner;

/**
 * 기능 제공용 클래스
 */
public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);

	/**
	 * 1번 문제
	 */
	public void practice1(){
		System.out.print("1 이상의 숫자를 입력하세요");
		int num = sc.nextInt();
		
		if(num >= 1 ) {
		
			for(int i =1 ; i <= num ; i++) {
				System.out.print(i + " ");
			}
		}else {
			System.out.print("1 이상의 숫자를 입력하세요");
		}
	} // p1
	
	
	
	/**
	 * 2번 문제
	 */
	public void practice2() {
		System.out.print("1 이상의 숫자를 입력하세요");
		int num = sc.nextInt();
		
		if(num >= 1 ) {
			
			for(int i = num ; i >= 1 ; i--) {
				System.out.print(i + " ");
			}
		}else {
			System.out.print("1 이상의 숫자를 입력하세요");
		}
	}
	
	/**
	 * 3번 문제 (?)
	 */
	 public void practice3(){
		 System.out.print("정수를 하나 입력하세요 : ");
		 int num = sc.nextInt();
		 
//		 int count = 0;
		 for(int i = 1 ; i <= num ; i++) {
//			 count++;
			 System.out.print(i + "+ ");
		 }
	 }
	

/**
 * 4번 문제
 */
	 public void practice4(){
		 
		 System.out.print("첫 번째 숫자 : ");
		 int num1 = sc.nextInt();
		 System.out.print("두 번째 숫자 : ");
		 int num2 = sc.nextInt();
	 
		 if(num1 > 1 && num2 > 1) {
			 
			  int start = num1;
				int end = num2;
				
				if(num1 > num2) {
					start = num2;
					end = num1;
				}
			
				for(int i = start ; i <= end ; i++) {
					System.out.print(i + " ");
			 }
			}else{
			 System.out.print("1 이상의 숫자를 입력해주세요");
		 }
	 }
	 
/**
 * 5번 문제
 */
	 
	 public void practice5(){
		 System.out.print("숫자 : ");
		 int dan = sc.nextInt();
		 System.out.println("==== " + dan + "단 ====");
		 
		 for(int i =1 ; i <= 9 ; i++) {
			 System.out.printf("%2d x %2d = %2d\n", dan, i, dan*i);
		 }
	 }
	 
	 
/**
 * 6번 문제
 */
	
	 public void practice6(){
			
		System.out.print("숫자 : ");
		int start = sc.nextInt();
		
			if(start >= 2 && start <= 9) { 
		
			 
			 for(int dan = start ; dan <= 9 ; dan++) {
				 System.out.println("==== " + dan + "단 ====");
	
				 for(int i = 1 ; i <= 9 ; i++) {
					 System.out.printf("%2d x %2d = %2d\n", dan, i, dan*i);
				 }
			 }
			}else {
				System.out.print("2 ~ 9 사이 숫자만 입력해주세요");
			
			}
	 }
	 
	 
/**
 * 7번 문제
 */
	 public void practice7(){
		 
		 System.out.print("정수 입력 : ");
		 int num = sc.nextInt();
		 
		 for(int i = 1 ; i <= num ; i++) {
			 
			 for(int j = 1; j <= i ; j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	 }
	 
	 
/**
 * 8번 문제
 */
	 
	 public void practice8(){
		 System.out.print("정수 입력 : ");
		 int num = sc.nextInt();
		 
		 for(int i = num ; i >= 1 ; i--) {
			 
			 for(int j = 1; j <= i ; j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	 }	 
	
/**
 * 9번 문제(?)
 * 
 * 
****
ㅁ***
ㅁㅁ**
ㅁㅁㅁ*

 */
	
	 public void practice9(){
		 System.out.print("정수 입력 : ");
		 int num = sc.nextInt();
		 
	 for(int i = num ; i >= 1 ; i--) {
		 
		 		// 공백
			 for(int j = 1; j <= num - i ; j++) {
			 System.out.print("ㅁ");
				}
					
					 // 별
					 for(int u = 1 ; u <=  i  ; u++) { 
				  	System.out.print("*");
									 
					 }
				
					 System.out.println();
				 }
	 		
			 
		 }
	 
	 
/**
 * 10번 문제
 */
	 
	 public void practice10(){
		 
	 }
	 
/**
* 11번 문제
*/
	 
	 public void practice11(){
		 
	 }
	 
/**
* 12번 문제
*/
	 
	 public void practice12(){
		 
	 }
	 
/**
 * 13번 문제
 */
	 public void practice13(){
		 System.out.print("자연수 하나를 입력하세요 : ");
			int num = sc.nextInt();
			
			int count = 0; // 개수 저장용 변수
			
			
				// 1에서 입력 받은 수 까지 중에 
				for(int i = 1 ; i <= num ; i++) {
					
					// 2 와 3의 배수
					if(i % 2 == 0 || i % 3 == 0 ) {
						System.out.print(i + " ");
					}
					
					if(i % 2 == 0 && i % 3 == 0 ) {
						count++;
					}
				}
				System.out.println();
				System.out.print("count : " + count);
	 }
	 
/**
 * 14번 문제
 */
	 public void practice14(){
		 System.out.print("숫자 : ");
		 int num = sc.nextInt();
		 
		 if(num > 2) {
			
			 for(int i = 2 ; i < num ; i++ ) {
				 if(num % i == 0) {
					 System.out.print("소수가 아닙니다.");
					 return;
				 }
			 }
			 System.out.print("소수입니다.");
			
			 
			 }else {
				 System.out.print("잘못 입력하셨습니다.");
			 }
		 }
	 

/**
 * 15번 문제
 */

	 public void practice15(){
		 System.out.print("숫자 : ");
		 int num = sc.nextInt();
		 
		 if(num < 2) {
			 System.out.print("잘못 입력하셨습니다.");
			 return;
		 }
		 
		 for(int i = 2 ; i < num ; i++ ) {
			 if(num % i == 0) {
				 System.out.print("소수가 아닙니다.");
				 return;				 
			 }
		 }
			 System.out.print("소수입니다.");
		 
		 
	 
	 } 
	 
	 
} // 마지막


































