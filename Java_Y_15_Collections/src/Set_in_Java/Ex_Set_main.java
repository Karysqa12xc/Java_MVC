package Set_in_Java;


import java.lang.ref.Cleaner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/*Bài 64*/

//Set là một tập hợp
//Đặc tính là không thể chứa các phần tử trùng lặp
//Set được triển khai bởi HashSet(Khi thêm phần tử vào thì không được sắp xếp), 
//TreeSet(Khi thêm phần tử vào thì sắp xếp), LinkedHashSet or EnumSet
//Phương thức trong set là addAll, add, clear, contains, equals, size
/*Bài tập xây dưng chương trình rút thăm trúng thưởng bằng Set theo TreeSet*/



public class Ex_Set_main {
	Set<String> tapHopPhieu = new HashSet<String>();	
	public Ex_Set_main() {
	}
	
	public boolean themPhieu(String giaTri){
		return this.tapHopPhieu.add(giaTri);
	}
	
	public boolean xoaPhieu(String GiaTri) {
		return this.tapHopPhieu.remove(GiaTri);
	}
	
	public boolean phieuCoTonTaiKhong(String giaTri) {
		return this.tapHopPhieu.contains(giaTri);
	}
	
	public void clearPhieu() {
		this.tapHopPhieu.clear();
	}
	
	public int soLuongPhieu() {
		return this.tapHopPhieu.size();
	}
	
	public String RutTham() {
		Random rd = new Random();
		int viTri = rd.nextInt(this.tapHopPhieu.size());
		return (String) this.tapHopPhieu.toArray()[viTri];
	}
	public void outputAll() {
		System.out.println(Arrays.toString(this.tapHopPhieu.toArray()));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String luaChon;
		Ex_Set_main Phieu = new Ex_Set_main();
		while(true) {
			System.out.println("-------------------");
			System.out.println("Menu: ");
			System.out.println("1. Thêm mã số dự thưởng");
			System.out.println("2  Xóa mã số dự thưởng");
			System.out.println("3. Kiểm tra mã số dự thưởng có tồn tại hay không");
			System.out.println("4. Xóa tất cả các phiếu dự thưởng");
			System.out.println("5. Số lượng phiếu dự thưởng");
			System.out.println("6. Rút thưởng");
			System.out.println("7. In ra tất cả các phiếu:");
			System.out.println("0. Thoát khỏi chương trình");
			System.out.println("Nhập lựa chọn của bạn: ");
			luaChon = sc.nextLine();
			switch (luaChon) {
			case "1":{
				System.out.println("Nhập vào các mã số trúng thưởng");
				String them;
				System.out.println("Nhập mã số phiếu: ");
				them = sc.nextLine();
				Phieu.themPhieu(them);
				break;
			}
			case "2":{
				System.out.println("Xóa phiếu theo mã số");
				String xoa;
				System.out.println("Nhập mã số cần xóa: ");
				xoa = sc.nextLine();
				Phieu.xoaPhieu(xoa);
				break;
			}
			case "3":{
				System.out.println("Kiểm tra mã số dự thưởng có tồn tại hay không");
				String check;
				System.out.println("Nhập mã số phiếu cần kiểm tra: ");
				check = sc.nextLine();
				System.out.println("Kết quả: "+Phieu.phieuCoTonTaiKhong(check)); 
				break;
			}
			case "4":{
				System.out.println("Xóa toàn bộ phiếu có trong thùng");
				Phieu.clearPhieu();
				break;
			}
			case "5":{
				System.out.println("Số lượng phiếu là: " + Phieu.soLuongPhieu());
				break;
			}
			case "6":{
				System.out.println("Mã số phiếu rút được là: " + Phieu.RutTham());
				
				break;
			}
			case "7":{
				System.out.println("Các mã phiếu dự thưởng là: ");
				Phieu.outputAll();
				break;
			}
			default:{
				if(luaChon.equals("0"))
					break;
			}
				
			}
		}
			
		
	}
}
