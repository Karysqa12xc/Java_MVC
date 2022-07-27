package Map_Java;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
//Bài 65
//Map là đại diện chứa hai cặp phần tử là key và Value
//Trong đó key không được trùng lặp
//Người dùng dựa vào key để truy xuất ra value tương ứng với nó
//Các phương thức thường dùng trong Map containsKey, get, keySet, put, Values

/*Bài tập tạo từ điển Anh Việt*/
public class Ex_Map_main {
	private Map<String, String> tuDien = new TreeMap<String, String>();	
	
	public String themTu(String tuKhoa, String yNghia) {
		return this.tuDien.put(tuKhoa, yNghia);
	}
	
	public String xoaTu(String tuKhoa) {
		return this.tuDien.remove(tuKhoa);
	}
    
	public String traTu(String tuKhoa) {
		String yNghia = this.tuDien.get(tuKhoa);
		return yNghia;
	}
	
	public void outPutKey() {
		Set<String> tapHop = this.tuDien.keySet();
		System.out.println(Arrays.toString(tapHop.toArray()));
	}
	 public int soLuongKey() {
		 return this.tuDien.size();
	 }
	 public void XoaHet() {
		 this.tuDien.clear();
	 }
	public static void main(String[] args) {
		String luaChon;
		Scanner sc = new Scanner(System.in);
		Ex_Map_main map1 = new Ex_Map_main();
		while(true) {
			System.out.println("1. Thêm từ khóa và ý nghĩa");
			System.out.println("2. Xóa từ");
			System.out.println("3.Tìm ý nghĩa của từ khóa");
			System.out.println("4. In danh sách từ khóa");
			System.out.println("5. In ra số lượng");
			System.out.println("6. Xóa tất cả");
			System.out.println("Nhập lựa chọn của bạn");
			luaChon = sc.nextLine();
			switch(luaChon) {
			case "1":{
				System.out.println("Thêm từ khóa và ý nghĩa vào từ điển");
				System.out.println("Nhập từ khóa: ");
				String tuKhoa; tuKhoa = sc.nextLine();
				System.out.println("Nhập ý nghĩa của từ");
				String yNghia; yNghia = sc.nextLine();
				map1.themTu(tuKhoa, yNghia);
				break;
			}
			case "2":{
				System.out.println("Xóa từ trong map bằng từ khóa");
				System.out.println("Nhập từ khóa: ");
				String tuKhoa; tuKhoa = sc.nextLine();
				System.out.println("Từ được xóa là:" + map1.xoaTu(tuKhoa)); 
				break;
			}
			case "3":{
				System.out.println("Tìm ý nghĩa của từ");
				System.out.println("Nhập từ khóa: ");
				String tuKhoa; tuKhoa = sc.nextLine();
				System.out.println("Ý nghĩa của từ khóa là: " + map1.traTu(tuKhoa));
				break;
			}
			case "4":{
				System.out.println("In danh sách từ khóa:");
				map1.outPutKey();
				break;
			}
			case "5":{
				System.out.println("Số lượng key là: " + map1.soLuongKey());
				break;
			}
			case "6":{
				map1.XoaHet();
			}
			default:{
				break;
			}
			}
		}
	}
}
