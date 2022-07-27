package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.view_jTextField;

public class controller_jTextField implements ActionListener {
	private view_jTextField vjf;

	public controller_jTextField(view_jTextField vjf) {
		this.vjf = vjf;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();

		if (src.equals("+")) {
			this.vjf.cong();
		} else if (src.equals("-")) {
			this.vjf.tru();
		} else if (src.equals("*")) {
			this.vjf.nhan();
		} else if (src.equals("/")) {
			this.vjf.chia();
		} else if (src.equals("MOD")) {
			this.vjf.Mod();
		} else if (src.equals("^")) {
			this.vjf.mu();
		}

	}

}
