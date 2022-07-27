package taoCuaSo_JFrame;

import javax.swing.JFrame;
//Bài 78: Tìm hiểu về cửa sổ chương trình JFrame 
//setVisible(bool): hiển thị của sổ chương trình(nếu là true thì của sổ hiện ra còn là False thì không hiện ra)
//setSize(chiều dài, chiều rộng): gán kích cỡ cho của sổ chương trình
//setTitle(): Gắn tên cho của sổ giao diện
//setDefaultCloseOperation(): Dùng để tắt hẳn cửa sổ(hay thoát ra khỏi chương trình khi đóng cửa sổ)
//setLocation(chiều dài, chiều rộng): gán vị trí hiển thị của cửa sổ chương trình
public class Ex_main {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setTitle("Đây là cửa sổ");
		jf.setSize(600 ,400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocation(500, 500);
		jf.setVisible(true);
	}
}
