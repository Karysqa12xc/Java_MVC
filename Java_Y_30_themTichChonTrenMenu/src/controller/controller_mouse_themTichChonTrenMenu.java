package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.view_themTichChonTrenMenu;

public class controller_mouse_themTichChonTrenMenu implements MouseListener{
	private view_themTichChonTrenMenu vmcp;
	
	public controller_mouse_themTichChonTrenMenu(view_themTichChonTrenMenu vmcp) {
		this.vmcp = vmcp;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.isPopupTrigger()) {//nếu người dùng nhấn chuột phải
			this.vmcp.jPopupMenu.show(e.getComponent(), e.getX(), e.getY());//hiện thị thanh menu chuột phải
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
