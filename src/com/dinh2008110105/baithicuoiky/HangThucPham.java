package com.dinh2008110105.baithicuoiky;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham extends HangHoa {
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;
	
	
	/**
	 * hàm khởi tạo đầy đủ
	 * @param maHang
	 * @param tenHang
	 * @param soLuongTon
	 * @param donGia
	 * @param ngaySanXuat
	 * @param ngayHetHan
	 */
	
	public HangThucPham(int maHang, String tenHang, int soLuongTon, double donGia, LocalDate ngaySanXuat,
			LocalDate ngayHetHan) {
		super(maHang, tenHang, soLuongTon, donGia);
		this.ngaySanXuat = ngaySanXuat;
		this.ngayHetHan = ngayHetHan;
	}
	/**
	 * hàm khởi tạo mặc định
	 */
	public HangThucPham() {
		this(0,"xxx",0,0,LocalDate.now(),LocalDate.now());
	}
	
	

	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}
	/**
	 * phải trước ngày hiện tại, mặc định là ngày hiện tại
	 * @param ngaySanXuat
	 */
	
	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if(ngaySanXuat.isBefore(LocalDate.now()))
			this.ngaySanXuat = ngaySanXuat;
		else 
			this.ngaySanXuat = LocalDate.now();
	}

	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	/**
	 * (phải sau ngày sản xuất, mặc định là ngày sản xuất
	 * @param ngayHetHan
	 */
	public void setNgayHetHan(LocalDate ngayHetHan) {
		if(ngayHetHan.isAfter(ngaySanXuat))
			this.ngayHetHan = ngayHetHan;
		else
			this.ngayHetHan = ngaySanXuat;
	}
	
	

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("̀̀%s %10s %10s ", super.toString(), 
				dtf.format(ngaySanXuat),dtf.format(ngayHetHan));
	}
	public static String getTieuDe() {
        return String.format("%-10s %-15s %-10s %-10s %10s %10s", 
        		"Ma hang", "Ten Hang","Don Gia","So Luong Ton",
        		"Ngay San Xuat","Ngay Het Han");
	}


	
	
}
