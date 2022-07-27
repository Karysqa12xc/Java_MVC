package Queue_and_DeQueue;

import java.util.LinkedList;
import java.util.Queue;

//Bài 63
public class Ex_Queue_main {
	public static void main(String[] args) {
		Queue<String> hangdoi = new LinkedList<String>();

		hangdoi.offer("Nam 1");
		hangdoi.offer("Tan ");
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
