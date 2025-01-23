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
		 System.out.print("정수 입력 : ");
			int input = sc.nextInt();
		 
			for( int row = 1; row <= input ; row++) {
				//앞쪽 공백 추가 방법 1

		  for(int blank = 1; blank <= input - row ; blank++ ) {
		  	
		  	for (int col = 1 ; col <= 2 * row - 1 ; col++) {
		  		System.out.print("*");
		  	}
		  	System.out.println(); // 줄바꿈
		  }
		}
			
			// 방법 2
			for( int row = 1; row <= input ; row++) {
		  	
		  	for (int col = 1 ; col <= 2 * input - 1 ; col++) {
		  		
//		  	 if(col <= input - row) {
		  		if(input - row >= col || input + row <= col) {
		  		 System.out.print(" ");
		  	 }else
		  		System.out.print("*");
		  	}
		  	System.out.println(); // 줄바꿈
		}
	 } // 11번 끝
	 
/**
* 12번 문제
*/
	 
	 public void practice12(){
		 System.out.print("정수 입력 : ");
			int input = sc.nextInt();
			
			for(int row =1 ; row <= input ; row++) {
				for(int col = 1; col <= input ; col++) {
					
					if(row == 1 || row == input || col == 1 || col == input) {
						System.out.print("*");
					}else {
						System.out.print(" ");
						}
					}
				System.out.println(); // 줄바꿈
		 }
		 
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
	
	 
/**
 * 16번 문제
 */
	 public void practice16(){
		 System.out.print("숫자 : ");
		 int num = sc.nextInt();
		 
		 int count = 0 ; // 소수 개수를 세기 위한 변수
		 
		 //2 부터 입력 받은 수 까지 1개씩 접근하는 for문
		 for(int i = 2  ; i <= num ; i++) {
			 
			 boolean flag = true; // 깃발(신호 용도)
			 // true인 경우 : 소수 x
			 // false인 경우 : 소수 x
			 
			 // 1과 자기자신(num)을 뺀 정수를 한 개씩 접근(x)
			 for(int x = 2 ; x < i ; x++) {
				 
				 // 
				 if(i % x == 0 ) { // 1. 자기자신 빼고 나누어 떨어지는 수 존재
					 flag = false;
					 break;
				 }
			 }
			 
			 if(flag) { // 소수라고 판별된 경우 수행
				 System.out.print(i + " ");
				 count++;
			 }
		 }
		 System.out.printf("\n%d부터 %d까지 소수의 개수는 %d개 입니다\n", num, count);
	 }
	 
	 
} // 마지막


































