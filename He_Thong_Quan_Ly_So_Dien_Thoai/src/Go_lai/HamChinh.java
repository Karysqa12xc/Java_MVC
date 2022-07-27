package Go_lai;

import java.util.ArrayList;
import java.util.Scanner;

public class HamChinh {
	
	public static void menu(){
		System.out.println("---------------Menu--------------");
		System.out.println("1. Insert news");
		System.out.println("2. View list news");
		System.out.println("3. Average rate");
		System.out.println("4. Exit");
	}
	
	public static void main(String[] args) {
		menu();
		int ID;
		String Title, PublishDate, Author, Content;
		float AveragetRate;
		String luaChon;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập lựa chọn của bạn: ");
		luaChon = sc.nextLine();
		
		System.out.println("Nhập Title: "); Title = sc.nextLine();
		System.out.println("Nhập PunlishDate: "); PublishDate = sc.nextLine();
		System.out.println("Nhập Author: "); Author = sc.nextLine();
		System.out.println("Nhập Content: ");Content = sc.nextLine();
		News n1 = new News(Title, PublishDate, Author, Content);
		ArrayList<News> n = new ArrayList<News>();
		System.out.println("Mời bạn nhập ");
		switch(luaChon) {
		case "1":{
			for(int i = 0; i  < n1.RateList.length; i++) {
				n1.RateList[i] = sc.nextInt();
			}
			n.add(n1);
			for(News list:n) {
				System.out.println(list);
			}
			break;
		}
		case "2":{
			n1.Display();
			break;
		}
		case "3":{
			for(int i = 0; i  < n1.RateList.length; i++) {
				n1.RateList[i] = sc.nextInt();
			}
			n1.Display();
			System.out.println(n1.Calculate());
		}
		case "4":{
			break;
		}
		}
	}
}
