package codingtest;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int king = 1;
		int queen = 1;
		int look = 2;
		int bishop = 2;
		int knight = 2;
		int pawn = 8;
		
		king = king - sc.nextInt();
		queen = queen - sc.nextInt();
		look = look - sc.nextInt();
		bishop = bishop - sc.nextInt();
		knight = knight - sc.nextInt();
		pawn = pawn - sc.nextInt();
		
		System.out.print(king + " ");
		System.out.print(queen + " ");
		System.out.print(look + " ");
		System.out.print(bishop + " ");
		System.out.print(knight + " ");
		System.out.print(pawn + " ");
		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		int d = sc.nextInt();
//		int e = sc.nextInt();
//		int f = sc.nextInt();
//		
//		System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f);
//		
//		
//		if (king == a) {
//			System.out.print(0);
//		} else if (a == 0) {
//			System.out.print(king);
//		} else if (king > a) {
//			king = -(king + a);
//			king++;
//			System.out.print(" " + king);
//		} else if (king < a) {
//			System.out.print(" " + (king - a));
//		}
//		
//		if (queen == b) {
//			System.out.print(" " + 0);
//		} else if (b == 0) {
//			System.out.print(" " + queen);
//		} else if (queen > b) {
//			queen = -(queen + b);
//			queen++;
//			System.out.print(" " + queen);
//		} else if (queen < b) {
//			System.out.print(" " + (queen - b));
//		}
//		
//		if (look == c) {
//			System.out.print(" " + 0);
//		} else if (c == 0) {
//			System.out.print(" " + look);
//		} else if (look > c) {
//			System.out.print(" " + c);
//		} else if (look < c) {
//			c = -(c - look);
//			System.out.print(" " + c);
//		}
//		
//		if (bishop == d) {
//			System.out.print(" " + 0);
//		} else if (d == 0) {
//			System.out.print(" " + bishop);
//		} else if (bishop > d) {
//			System.out.print(" " + d);
//		} else if (bishop < d) {
//			d = -(d - bishop);
//			System.out.print(" " + d);
//		}
//		
//		if (knight == e) {
//			System.out.print(" " + 0);
//		} else if (e == 0) {
//			System.out.print(" " + knight);
//		} else if (knight > e) {
//			System.out.print(" " + e);
//		} else if (knight < e) {
//			e = -(e - knight);
//			System.out.print(" " + e);
//		}
//		
//		if (pawn == f) {
//			System.out.print(" " + 0);
//		} else if (pawn == 0) {
//			System.out.print(" " + pawn);
//		} else if (pawn > f) {
//			pawn = (pawn - f);
//			System.out.print(" " + pawn);
//		} else if (knight < f) {
//			f = -(f - knight);
//			System.out.print(" " + f);
//		}

	}
}
