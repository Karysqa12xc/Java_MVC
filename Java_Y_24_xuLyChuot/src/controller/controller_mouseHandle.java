package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.event.MouseInputListener;

import view.view_mouseHandle;

public class controller_mouseHandle implements MouseListener, MouseMotionListener{
	private view_mouseHandle vmh;
	
	public controller_mouseHandle(view_mouseHandle vmh) {
		this.vmh = vmh;
	}

	@Override
	public void mouseClicked(MouseEvent e) {//Hàm xử lý khi click chuột
		this.vmh.addClick();
	}

	@Override
	public void mousePressed(MouseEvent e) {//Hàm xử lý khi giữ chuột
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {//Hàm khi người dùng thả chuột
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {//Hàm xử lý khi chuột khi chuột đi vào một khu vực
		this.vmh.enterMouse();
		int x = e.getX();
		int y = e.getY();
		this.vmh.update(x, y);
	}

	@Override
	public void mouseExited(MouseEvent e) {//Hàm xử lý khi chuột đi ra khỏi khu vực
		this.vmh.exitMouse();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		this.vmh.update(x, y);
	}

	
	
}
