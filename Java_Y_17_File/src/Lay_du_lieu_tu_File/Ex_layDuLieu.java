package Lay_du_lieu_tu_File;

import java.io.File;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ex_layDuLieu {
	File tenFile;
	public Ex_layDuLieu(String tenFile) {
		this.tenFile = new File(tenFile);
	}
	public boolean kiemTraThucThi(){
		return this.tenFile.canExecute();
	}
	
	public boolean kiemTraDoc() {
		return this.tenFile.canRead();
	}
	
	public boolean kiemTraGhi() {
		return this.tenFile.canWrite();
	}
	public String traVeDuongDan() {
		return this.tenFile.getAbsolutePath();
	}
	public void InTen() {
		System.out.println(this.tenFile.getName());
	}
	public void kiemTraFileLaGi() {
		if(this.tenFile.isDirectory()) {
			System.out.println("Đây là một thư mục");
		}else {
			System.out.println("Đây là File");
		}
	}
	public void inDanhSachFileCon() {
		if(this.tenFile.isDirectory()) {
			System.out.println("Các tập tin thư mục con là: ");
			File[] mangcon= this.tenFile.listFiles();
			for (File file : mangcon) {
				System.out.println(file.getAbsolutePath());
			}
		}else if(tenFile.isFile()){
			System.out.println("Đây là tập tin không có file con bên trong");
		}
	}
	public void inCayThuMuc() {
		this.inChiTiet(this.tenFile, 1);
	}
	public void inChiTiet(File f, int bac) {
		for(int i = 0; i < bac; i++) {
			System.out.print("\t");
		}
		System.out.print("|__");
		System.out.println(f.getName());
		if(f.canRead() && f.isDirectory()) {
			File[] mangCon = f.listFiles();
			for (File file : mangCon) {
				inChiTiet(file, bac + 1);
			}
		}
	}
}
