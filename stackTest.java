package ch;

import java.util.Stack;
import java.util.Scanner;

public class stackTest {
	public static void main(String[] args) {
		Stack<String> strmap = new Stack<>();
		Scanner sc = new Scanner(System.in);
		String A;
		while (true) {
			A = sc.nextLine();
			if ( A == "q") {
				break;
			}
			strmap.push(A);
		}
		for (String toString : strmap) {
			System.out.println(toString);
		}
		
		
	}
}
