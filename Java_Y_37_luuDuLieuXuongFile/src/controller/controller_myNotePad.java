package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

import javax.swing.JFileChooser;

import view.myNotedPad;

public class controller_myNotePad implements ActionListener {
	private myNotedPad mnp;

	public controller_myNotePad(myNotedPad mnp) {
		this.mnp = mnp;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		JFileChooser fc = new JFileChooser();
		if (src.equals("Open File")) {
			int returnVal = fc.showOpenDialog(this.mnp);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				String fileName = file.getName();
				this.mnp.mmnp.setFileName(file.getAbsolutePath());
				this.mnp.lblNewLabel.setText(this.mnp.mmnp.getFileName());
				if (fileName.endsWith(".txt")) {
					try {
						List<String> allText = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
						String result = "";
						for (String line : allText) {
							result += line;
							result += "\n";
						}
						this.mnp.mmnp.setContent(result);
						this.mnp.text.setText(this.mnp.mmnp.getContent());
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		} else if (src.equals("Save File")) {
			if (this.mnp.mmnp.getFileName().length() > 0) {
				saveFile(this.mnp.mmnp.getFileName());
			} else {
				int returnVal = fc.showSaveDialog(this.mnp);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					File file = fc.getSelectedFile();
					saveFile(file.getAbsolutePath());
				}
			}
		}

	}
	public void saveFile(String file){
		try {
			PrintWriter pw = new PrintWriter(file, "UTF-8");
			String data = this.mnp.text.getText();
			pw.print(data);
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
