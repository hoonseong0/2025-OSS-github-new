package ch;

import java.util.Queue;
import java.util.LinkedList;

public class BaseQueueTest {
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("홍길동");
		queue.offer("김철수");
		queue.offer("이영희");
		
		System.out.println("현재 큐: " + queue);
		
		System.out.println("peek: " + queue.peek());
		
		System.out.println("poll: " + queue.poll());
		
		System.out.println("poll: " + queue.poll());
		
		System.out.println("큐가 비었나요? " + queue.isEmpty());
		
		System.out.println("남은 큐: " + queue);
	}
}
