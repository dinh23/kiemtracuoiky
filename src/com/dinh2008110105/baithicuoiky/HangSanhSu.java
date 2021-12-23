package com.dinh2008110105.baithicuoiky;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HangSanhSu extends HangHoa {
	private String nhaSanXuat;
    private LocalDate ngayNhapKho;
  
	/**
	 * hàm khởi tạo đầy đủ
	 * @param maHang
	 * @param tenHang
	 * @param soLuongTon
	 * @param donGia
	 * @param nhaSanXuat
	 * @param ngayNhapKho
	 */
	
	public HangSanhSu(int maHang, String tenHang, int soLuongTon, double donGia, String nhaSanXuat,
			LocalDate ngayNhapKho) {
		super(maHang, tenHang, soLuongTon, donGia);
		this.nhaSanXuat = nhaSanXuat;
		this.ngayNhapKho = ngayNhapKho;
	}

	public HangSanhSu() {
		this(0,"xxx",0,0,"xxx",LocalDate.now());
	}
	
	public String getNhaSanXuat() {
		return nhaSanXuat;
	}

	/**
	 * kiểm tra nhà sãn xuất
	 * @param nhaSanXuat
	 */
	public void setNhaSanXuat(String nhaSanXuat) {
		if(!nhaSanXuat.trim().equals(""))
			this.nhaSanXuat = nhaSanXuat;
		else 
			this.nhaSanXuat = "xxx";
	}


	public LocalDate getNgayNhapKho() {
		return ngayNhapKho;
	}
	/**
	 * phải trước ngày hiện tại, mặc định là ngày hiện tại
	 * @param ngayNhapKho
	 */

	public void setNgayNhapKho(LocalDate ngayNhapKho) {
		if(ngayNhapKho.isBefore(LocalDate.now()))
			this.ngayNhapKho = ngayNhapKho;
		else 
			this.ngayNhapKho = LocalDate.now();
	}
	
	
	
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%s %10s %10s", super.toString(),
				nhaSanXuat, dtf.format(ngayNhapKho));
	}
	public static String getTieuDe() {
        return String.format("%-10s %-15s %-10s %-10s %10s %10s", 
        		"Ma hang", "Ten Hang","Don Gia","So Luong Ton","nhà sản xuất",
        		"Ngày nhập kho");
	}
	


}
