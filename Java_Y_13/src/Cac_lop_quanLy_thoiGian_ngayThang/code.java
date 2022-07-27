package Cac_lop_quanLy_thoiGian_ngayThang;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.Calendar;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class code {
	public static void main(String[] args) {
		// Hàm lấy thời gian hiện tại currentTimeMilis
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			System.out.println("TEST");
		}
		long t2 = System.currentTimeMillis();

		System.out.println("trước khi chạy for: " + t1);
		System.out.println("sau khi chạy for: " + t2);
		System.out.println("Thời gian: " + ((t2 - t1)) + "mls");
		System.out.println("Thời gian: " + ((t2 - t1) / 1000) + "s");
		
		//Hàm timeUnit: chuyển đổi đợn vì thời gian này sang một kiểu đơn vị thời gian khác
		System.out.println("3000 năm = "+ TimeUnit.DAYS.toSeconds(3000 * 365) + "s");
		System.out.println("25h = " + TimeUnit.HOURS.toMinutes(25) + "m");
		
		//Hàm date
		Date d = new Date(System.currentTimeMillis());
		//Cách để lấy ngày, tháng, năm chuẩn java: (Khuyến cáo không nên dùng=>nên dùng Calendar)
			//ngày: getDate() 
			//tháng: getMonth() + 1
			//Year: getYear() + 1900
		System.out.println("Ngày hôm nay là: ");
		System.out.println(d.getDate() + "/" + (d.getMonth() + 1) + "/" + (d.getYear() + 1900));
		
		//Calendar:cũng là lấy ngày tháng nhưng tốt hơn
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.DATE) + " - " + 
		(c.get(Calendar.MONTH) + 1) + " - " + c.get(Calendar.YEAR));
		//thêm giờ ngày, tháng, năm
		c.add(Calendar.HOUR, 30);
		System.out.println(c.get(Calendar.DATE) + " - " + 
		(c.get(Calendar.MONTH) + 1) + " - " + c.get(Calendar.YEAR));
		
		c.add(Calendar.DATE, 14);
		System.out.println(c.get(Calendar.DATE) + " - " + 
		(c.get(Calendar.MONTH) + 1) + " - " + c.get(Calendar.YEAR));
		
		//DateFormat
		DateFormat df = new SimpleDateFormat();
		System.out.println(df.format(d));
		
		df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(d));
		
	}
}
