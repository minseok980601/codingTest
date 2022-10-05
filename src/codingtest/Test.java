package codingtest;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();	// 시
		int b = sc.nextInt();	// 분
		int c = sc.nextInt();	// 추가할 분
		
//		int bc = b + c;
		
		// 답
		
		while(b + c > 59) {
			if(a == 23) {
				a = 0;
			} else {
				a += 1;
			}
			c = c - 60;
		}
		System.out.println(a + " " + (b + c));
		
		// 오답(내가한것)
		
//		if (bc < 60) {
//			System.out.println(a + " " + bc);
//		} else if (bc > 59) {
//			a += 1;
//			bc = bc - 60;
//			if (a > 23) {
//				a = 0;
//				System.out.println(a + " " + bc);
//			}
//			
//			if (bc >= 60) {
//				a += 1;
//				bc = bc - 60;
//				System.out.println(a + " " + bc);
//			}
//
//		} 
		
		
	}
}
