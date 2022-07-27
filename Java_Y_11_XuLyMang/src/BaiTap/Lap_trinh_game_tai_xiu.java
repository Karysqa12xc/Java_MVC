package BaiTap;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*Một người chơi có tài khoản. Người chơi co quyền đặt cược số tiền ít hơn số tiền họ đnag có
 * Luật chơi:
 * Có 3 viên xúc xắc. Mỗi viên có giá trị từ 1 đến 6 
 * Mỗi lần lắc sẽ ra một kết quả. Kết quả bằng = giá trị(xx1 + xx2 + xx3)
 * 1. Nếu tổng bằng 3 or 18 => Nhà cái ăn hết
 * 2. Nếu tổng bằng (4 -> 10)=> Nếu người chơi đặt xỉu=>người chơi ăn
 * 3. Nếu tổng bằng (11 -> 17)=> Nếu người chời đặt tài=>người chơi ăn
 * */
public class Lap_trinh_game_tai_xiu {	
	public static void main(String[] args) {
		double money = 5000000;
		Scanner sc = new Scanner(System.in);
		//Đây là các class để hiển thị giá tiền mã vùng
		Locale lc = new Locale("vi", "VN");
		NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
		int luaChon;
		do {
			System.out.println("---------------------MỜI BẠN CHỌN------------------");
			System.out.println("Chọn (1) để tiếp tục chơi: ");
			System.out.println("Chọn (Phím bật kỳ) để thoát: ");
			luaChon = sc.nextInt();
			if(luaChon == 1) {
				System.out.println("BẮT ĐẦU CHƠI: ");
				System.out.println("Tài khoản của bạn: "+ money + " "
						+ " bạn muốn cược bao nhiêu: ");
				double datCuoc;
				do {
					System.out.println("Số tiền phải đặt phải <=" + numf.format(money));
					System.out.println("Số tiền bạn đặt cược là: ");
					datCuoc = sc.nextDouble();
				}while(datCuoc <= 0||datCuoc > money);
				int luaChonCuaBan;
				do {
					System.out.println("Chọn 1 là <tài> ");
					System.out.println("Chọn 2 là <xỉu>");
					luaChonCuaBan = sc.nextInt();
				}while(luaChonCuaBan != 1 && luaChonCuaBan != 2);	
				
				//Tung xúc xắc
				Random xucXac1 = new Random();
				Random xucXac2 = new Random();
				Random xucXac3 = new Random();
				
				int giaTri1 = xucXac1.nextInt(1, 6);
				int giaTri2 = xucXac2.nextInt(1, 6);
				int giaTri3 = xucXac3.nextInt(1, 6);
				int tong = giaTri1 + giaTri2 + giaTri3;
				//Tính kết quả:
				System.err.println("Giá trị xúc xắc 1: " + giaTri1);
				System.err.println("Giá trị xúc xắc 2: " + giaTri2);
				System.err.println("Giá trị xúc xắc 3: " + giaTri3);
				
				System.out.println("Kết quả: " + tong);
				if(tong == 3 || tong == 18) {
					money = money - datCuoc;
					System.out.println("Nhà cái ăn hết");
					System.out.println("Số tiền cò lại của bạn là: "+ money);
				}
				else if(tong >=4 && tong <= 10) {
					if(luaChonCuaBan == 1) {
						money = money + datCuoc;
						System.out.println("Bạn đã dành chiến thắng: ");
						System.out.println("Số tiền hiện tại của bạn là: "+ money);
					}else {
						money = money - datCuoc;
						System.out.println("Bạn đặt sai rồi: ");
						System.out.println("Số tiền còn lại của bạn là: " + money);
					}
				}
				else {
					if(luaChonCuaBan == 2) {
						money = money + datCuoc;
						System.out.println("Bạn đã dành chiến thắng: ");
						System.out.println("Số tiền hiện tại của bạn là: "+ money);
					}else {
						money = money - datCuoc;
						System.out.println("Bạn đặt sai rồi: ");
						System.out.println("Số tiền còn lại của bạn là: " + money);
					}
				}
			}
			if(luaChon != 1) {
				System.out.println("Bạn đã thoát khỏi trò chơi!!! ");
				break;
			}
				
			
		}while(luaChon == 1);
	}
}
