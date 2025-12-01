package ch;
import java.util.Stack;


public class BaseStackTest {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println("스택 내용: " + stack);
	}
}
