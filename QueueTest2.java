package ch;
import java.util.Queue;
import java.util.LinkedList;

class Customer {
	private String name;
	private String job;
	
	public Customer (String name, String job) {
		this.name = name;
		this.job = job;
	}
	public void ShowInfo () {
		System.out.println("Next Customer: "+name+" (job list: "+ job+")");
	}
}
class bankQueue {
	private Queue<Customer> BankQueue = new LinkedList<>();
	
}

public class QueueTest2 {
	public static void main(String[] args) {
		Queue<String> BankQueue = new LinkedList<>();
		
	}
}
