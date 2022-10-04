package boj;

import java.util.ArrayDeque;
import java.util.Queue;

public class queue {
	static Queue<Integer> q = new ArrayDeque<>();
	public static void main(String[] args) {
		q.add(1);
		q.add(2);
		
		
		System.out.println(q.poll());
		
		
	}
}
