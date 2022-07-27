package Queue_and_DeQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Ex_PriorityQueue {
	public static void main(String[] args) {
		Queue<String> hangdoi = new PriorityQueue<String>();

		hangdoi.offer("Nguyen Ban C");
		hangdoi.offer("An");
		hangdoi.offer("Hung");
		hangdoi.offer("Long");

		while (true) {
			String ten = hangdoi.poll();// Lấy phần tử xong xóa khỏi queue luôn
			// peek: Lấy phần tử ra những không xóa
			if (ten == null) {
				break;
			}
			System.out.println(ten);
		}
	}
}
