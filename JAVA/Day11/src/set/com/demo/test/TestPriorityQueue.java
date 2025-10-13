package set.com.demo.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {

	public static void main(String[] args) {
		Queue<Integer> que=new PriorityQueue<>();
		que.add(45);
		que.add(64);
		que.add(23);
		que.add(87);
//		System.out.println(que);
		System.out.println(que.peek());
//		while(!que.isEmpty()){
//			
//		    System.out.println(que.poll());
//		}

	}

}
