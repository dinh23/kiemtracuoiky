package com.dinh2008110105.baithicuoiky;

import java.text.DecimalFormat;


public class HangDienMay extends HangHoa {
	private int congSuat;
	private int thoiGianBaoHanh;

	/**
	 * hàm khởi tạo mặc định
	 * @param maHang
	 * @param tenHang
	 * @param soLuongTon
	 * @param donGia
	 * @param congSuat
	 * @param thoiGianBaoHanh
	 */
	public HangDienMay(int maHang, String tenHang, int soLuongTon, double donGia, int congSuat, int thoiGianBaoHanh) {
		super(maHang, tenHang, soLuongTon, donGia);
		this.congSuat = congSuat;
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}

	/**
	 * hàm khởi tạo đầy đủ
	 */
	public HangDienMay() {
		this(0,"xxx",0,0,0,0);
	}

	
	public int getCongSuat() {
		return congSuat;
	}
	/**
	 * hàm kiểm tra công sức
	 * @param congSuat
	 */
	public void setCongSuat(int congSuat) {
		if(congSuat >= 0)
			this.congSuat = congSuat;
		else
			this.congSuat = 0;
	}

	
	
	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}

	/**
	 * kiểm tra thời gian bảo hành
	 * @param thoiGianBaoHanh
	 */
	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		if(thoiGianBaoHanh >= 0)
			this.thoiGianBaoHanh = thoiGianBaoHanh;
		else 
			this.thoiGianBaoHanh = 0;
	}

	
	
	@Override
	public String toString() {
		return String.format("%s %10d %10d", super.toString(), 
				congSuat, thoiGianBaoHanh);
	}
	public static String getTieuDe() {
        return String.format("%-10s %-15s %-10s %-10s %10s %10s", 
        		"Ma hang", "Ten Hang","Don Gia","So Luong Ton","Công Suất",
        		"Bảo Hành");
	}



}
