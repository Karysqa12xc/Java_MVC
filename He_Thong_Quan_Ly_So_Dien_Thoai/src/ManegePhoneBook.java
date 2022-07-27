import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.imageio.plugins.tiff.ExifGPSTagSet;

public class ManegePhoneBook {
	static void menu() {
		System.out.println("PHONEBOOK MANEGEMENT SYSTEM");
		System.out.println("1. Insert Phone");
		System.out.println("2. Remove Phone");
		System.out.println("3. Update Phone");
		System.out.println("4. Search Phone");
		System.out.println("5. Sort");
		System.out.println("6. Display");
		System.out.println("7. Exit");
	}
	public static void main(String[] args) {
		PhoneBook p1 = new PhoneBook();
		Scanner in = new Scanner(System.in);
		String name, phone;
		while(true) {
			menu();
			System.err.println("Mời bạn chọn 1 mục: ");
			switch(in.nextLine()) {
				case "1":{
					System.out.println("Mời nhập tên của bạn: ");
					name = in.nextLine();
					System.out.println("Mời bạn nhập số điện thoại của bạn: ");
					phone = in.nextLine();
					p1.insertPhone(name, phone);
					break;
				}
				case "2":{
					if(p1.PhoneList.isEmpty()) {
						System.out.println("Danh bạ trống!");
						break;
					}
					System.out.println("Mời nhập tên người dùng bạn muốn xóa: ");
					name = in.nextLine();
					p1.removePhone(name);
					break;
				}
				case "3":{
					if(p1.PhoneList.isEmpty()) {
						System.out.println("Danh bạ trống!");
						break;
					}
					System.out.println("Mời nhập tên người dùng bạn muốn update: ");
					name = in.nextLine();
					System.out.println("Mời nhập số điện thoại bạn muốn update: ");
					phone = in.nextLine();
					p1.updatePhone(name,phone);
					break;
				}
				case "4":{
					if(p1.PhoneList.isEmpty()) {
						System.out.println("Danh bạ trống!");
						break;
					}
					System.out.println("Nhập tên người dùng bạn muốn tìm kiếm: ");
					name = in.nextLine();
					String resaul = p1.searchPhone(name);
					if(resaul == null) {
						System.out.println("Không tìm thấy người dùng có tên: " + name);
					}else {
						System.out.println("Kết quả: " + resaul);
					}
					p1.searchPhone(name);
					break;
				}
				case "5":{
					if(p1.PhoneList.isEmpty()) {
						System.out.println("Danh bạ trống!");
						break;
					}
					System.out.println("Sắp xếp lại tên người dùng theo thứ tự");
					p1.Sort();
					break;
				}
				case "6":{
					for(String pl: p1.PhoneList) {
						System.out.println(pl);
					}
					break;
				}
				case "7":{
					return;
				}
				default:{
					System.out.println("Lựa chọn của bạn không xác định!!!");
				}
			}
		}
	}
}
