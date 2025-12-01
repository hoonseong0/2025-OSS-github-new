package ch;
import java.util.Queue;
import java.util.LinkedList;

public class Queuestest1 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("철수");
		queue.offer("경수");
		queue.offer("정수");
		
		while (true) {
			if(queue.isEmpty()) {
				System.out.println("End!!");
				break;
			}
			System.out.println("Next : " + queue.poll());
		}
	}
}
