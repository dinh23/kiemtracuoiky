package com.dinh2008110105.baithicuoiky;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DanhSachHangHoa {
	private List<HangHoa> list;

	public DanhSachHangHoa() {
		list = new ArrayList<HangHoa>();
	}
	
	/**
	 * thêm vào 1 hàng hóa
	 * @param hh
	 * @return
	 */
	public boolean themHH(HangHoa hh) {
		if(list.contains(hh))
			return false;
		list.add(hh);
		return true;
	}
	
	/**
	 * xóa 1 hàng hóa 
	 * @param maHang
	 * @return
	 */
	public boolean xoaHH(int maHang) {
		return list.removeIf(hh -> hh.getMaHang() == maHang);
	}
	
	/**
	 * sửa hàng hóa có mã sữa đơn giá
	 * @param maHang
	 * @param Dongia_moi
	 * @return
	 */
	public boolean suaHH(int maHang, double Dongia_moi) {
		for (HangHoa hangHoa : list) {
			if(hangHoa.getMaHang() == maHang) {
				hangHoa.setDonGia(Dongia_moi);
				return true;
			}
		}
		return false;
	}
	
	/**
	 * tìm kiếm theo tên
	 * @param Tên
	 * @return
	 */
	public DanhSachHangHoa timkiemtheoten(String tenMH) {
		DanhSachHangHoa kg = new DanhSachHangHoa();
		for (HangHoa hangHoa : list) {
			if(hangHoa.getTenHang().toLowerCase().equalsIgnoreCase(tenMH))
				kg.themHH(hangHoa);
		}
		return kg;
	}
	
	/**
	 * tìm kiếm theo giá
	 * @param gia
	 * @return
	 */
	public DanhSachHangHoa timkiemtheogia(double gia) {
		DanhSachHangHoa kg = new DanhSachHangHoa();
		for (HangHoa hangHoa : list) {
			if(hangHoa.getDonGia() == gia) {
				kg.themHH(hangHoa);
			}
		}
		return kg;
	}
	/**
	 * tìm kiếm hàng hóa theon ngày
	 * @param ngaynhap
	 * @return
	 */
	public DanhSachHangHoa timkiemtheongay(LocalDate ngaynhap) {
		DanhSachHangHoa kg = new DanhSachHangHoa();
		for (HangHoa hangHoa : list) {
			if (hangHoa instanceof HangSanhSu)
				if (((HangSanhSu) hangHoa).getNgayNhapKho() == ngaynhap)
					kg.themHH(hangHoa);
		}
		return kg;
	}
	
	/**
	 * sắp xếp đơn giá tăng dần
	 */
	public void xapxepdongiatangdan() {
		Collections.sort(list, new Comparator<HangHoa>() {

			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				// TODO Auto-generated method stub
				return Double.compare(o1.getDonGia(), o2.getDonGia());
			}
		});
	}
	
	/**
	 * sắp xếp đơn giá giam dan
	 */
	public void xapxepdongiagiamdan() {
		Collections.sort(list, new Comparator<HangHoa>() {

			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				// TODO Auto-generated method stub
				return Double.compare(o2.getDonGia(), o2.getDonGia());
			}
		});
	}
	
	/**
	 * sắp xếp mã tăng dần
	 */
	public void xapxepgaynhaptangdan() {
		Collections.sort(list, new Comparator<HangHoa>() {

			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.getMaHang(), o2.getMaHang());
			}
		});
	}
	
	/**
	 * sắp xếp mã giảm dần
	 */
	public void xapxepngaynhapgamdan() {
		Collections.sort(list, new Comparator<HangHoa>() {

		@Override
		public int compare(HangHoa o1, HangHoa o2) {
			// TODO Auto-generated method stub
			return Integer.compare(o2.getMaHang(), o1.getMaHang());
		}
		});
	}

	
	/**
	 * hàm xuất toàn bộ thông tin
	 */
	@Override
	public String toString() {
		String s = "";
		s += "---------------Hang Thuc Pham----------------" + "\n";
		s += xuatTP() + "\n";
		s += "---------------Hang Đien May----------------" + "\n";
		s += xuatDM() + "\n";
		s += "---------------Hang Thuc Pham----------------" + "\n";
		s += xuatSS();
		return s;
	}
	/**
	 * hàm xuất thông tin thực phẩm
	 * @return
	 */
	public String xuatTP() {
		String s = HangThucPham.getTieuDe() +  "\n";
		for (HangHoa hangHoa : list) {
			if(hangHoa instanceof HangThucPham)
			s += hangHoa + "\n";
		}
		return s;
	}
	/**
	 * hàm xuất thông tin điện máy
	 * @return
	 */
	public String xuatDM() {
		String s = HangDienMay.getTieuDe() +  "\n";
		for (HangHoa hangHoa : list) {
			if(hangHoa instanceof HangDienMay)
			s += hangHoa + "\n";
		}
		return s;
	}
	/**
	 * hàm xuất thông tin Sành Sứ
	 * @return
	 */
	public String xuatSS() {
		String s = HangSanhSu.getTieuDe() +  "\n";
		for (HangHoa hangHoa : list) {
			if(hangHoa instanceof HangSanhSu)
			s += hangHoa + "\n";
		}
		return s;
	}
	

	/**
	 * tổng số lượng hàng hóa
	 * 
	 * @return
	 */
	public int tongsoluonghanghoa() {
		int dem = 0;
		for (HangHoa hangHoa : list) {
			dem += hangHoa.getSoLuongTon();
		}
		return dem;
	}
	
	/**
	 * tổng số đơn giá hàng hóa
	 * @return
	 */
	public double tonggiatrinhapkho() {
		double sum = 0;
		for (HangHoa hangHoa : list) {
			sum += hangHoa.getDonGia();
		}
		return sum;
	}
	
	/**
	 * số lượng từng loại hàng
	 * @return
	 */
	public int tongtungloai() {
		int dem = 0;
		for (HangHoa hangHoa : list) {
			dem++;
		}
		return dem;
	}
	/**
	 * lấy danh sách
	 * @return
	 */
	public int getsize() {
		return list.size();
	}
	
	
}