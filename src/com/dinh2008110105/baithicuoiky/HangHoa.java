package com.dinh2008110105.baithicuoiky;

import java.text.DecimalFormat;
import java.util.Objects;

public abstract class HangHoa {
	private int maHang;
	private String tenHang;
	private int soLuongTon;
	private double donGia;
	
	/**
	 * hàm khởi tạo đầy đủ
	 * @param maHang
	 * @param tenHang
	 * @param soLuongTon
	 * @param donGia
	 */
	public HangHoa(int maHang, String tenHang, int soLuongTon, double donGia) {
		super();
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.soLuongTon = soLuongTon;
		this.donGia = donGia;
	}
	/**
	 * hàm khởi tạo mặc định
	 */
	public HangHoa() {
		this(0,"xxx",0,0);
	}
	public int getMaHang() {
		return maHang;
	}
	/**
	 * hàm kiểm tra mã hàng
	 * @param maHang
	 */
	public void setMaHang(int maHang) {
		if(maHang >= 0)
			this.maHang = maHang;
		else
			this.maHang = 0;
	}
	public String getTenHang() {
		return tenHang;
	}
	/**
	 * hàm kiểm tra tên hàng
	 * @param tenHang
	 */
	public void setTenHang(String tenHang) {
		if(!tenHang.trim().equals(""))
			this.tenHang = tenHang;
		else 
			this.tenHang = "xxx";
	}
	public int getSoLuongTon() {
		return soLuongTon;
	}
	/**
	 * hàm kiểm tra số lượng tồn
	 * @param soLuongTon
	 */
	public void setSoLuongTon(int soLuongTon) {
		if(soLuongTon >= 0)
			this.soLuongTon = soLuongTon;
		else
			this.soLuongTon = 0;
	}
	public double getDonGia() {
		return donGia;
	}
	/**
	 * hàm kiểm tra đơn giá
	 * @param donGia
	 */
	public void setDonGia(double donGia) {
		if(donGia >= 0)
			this.donGia = donGia;
		else
			this.donGia = 0;
	}
	
	
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###");
		return String.format("%-10s %-15s %-10s %-10d", maHang,tenHang,df.format(donGia),soLuongTon);
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(maHang);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HangHoa other = (HangHoa) obj;
		return maHang == other.maHang;
	}
	public static String getTieuDe() {
        return String.format("%-10s %-15s %-10s %-10s", "Ma hang", "Ten Hang","So Luong Ton","Đơn giá");
    }
}
