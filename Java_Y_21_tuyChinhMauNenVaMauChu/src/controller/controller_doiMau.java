package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.view_doiMau;

public class controller_doiMau implements ActionListener {

	private view_doiMau vtm;

	public controller_doiMau(view_doiMau vtm) {
		this.vtm = vtm;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();

		if (src.equals("Màu đỏ chữ")) {
			this.vtm.changeTextColor(Color.red);
		}
		if (src.equals("Màu vàng chữ")) {
			this.vtm.changeTextColor(Color.yellow);
		}
		if (src.equals("Màu xanh chữ")) {
			this.vtm.changeTextColor(Color.blue);
		}
		if (src.equals("Màu đỏ nền")) {
			this.vtm.changeBackGroupColor(Color.red);
		}
		if (src.equals("Màu vàng nền")) {
			this.vtm.changeBackGroupColor(Color.yellow);
		}
		if (src.equals("Màu xanh lá nền")) {
			this.vtm.changeBackGroupColor(Color.green);
		}

	}
}
