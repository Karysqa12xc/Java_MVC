package Queue_and_DeQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Ex_Dequeue {
	public static void main(String[] args) {
		Deque<String> hangdoi2dau = new ArrayDeque<String>();
		
		hangdoi2dau.offer("Nam");
		hangdoi2dau.offer("Trung ");
		hangdoi2dau.offerFirst("Hung");
		hangdoi2dau.offerLast("Long");
		
		while(true) {
			String ten = hangdoi2dau.poll();
			if(ten == null) {
				break;
			}
			System.out.println(ten);
		}
	}
}
