package com.dinh2008110105.baithicuoiky;

import java.time.LocalDate;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DanhSachHangHoa a = new DanhSachHangHoa();
		a.themHH(new HangThucPham(1, "tao", 15, 1500, LocalDate.of(2020, 10, 10),LocalDate.of(2021, 10, 10)));
		a.themHH(new HangThucPham(2, "cam", 20, 2500, LocalDate.of(2020, 10, 20),LocalDate.of(2021, 11, 12)));
		a.themHH(new HangThucPham(3, "xoai", 15, 1900, LocalDate.of(2020, 10, 15),LocalDate.of(2021, 11, 18)));
		a.themHH(new HangThucPham(4, "quyt", 25, 2500, LocalDate.of(2020, 10, 30),LocalDate.of(2021, 11, 19)));
		a.themHH(new HangThucPham(5, "dua", 16, 8000, LocalDate.of(2020, 10, 12),LocalDate.of(2021, 10, 17)));
		a.themHH(new HangThucPham(6, "man", 17, 5000, LocalDate.of(2020, 10, 19),LocalDate.of(2021, 10, 18)));
		a.themHH(new HangThucPham(7, "chuoi", 10, 1500, LocalDate.of(2020, 10, 25),LocalDate.of(2021, 8, 12)));
		a.themHH(new HangDienMay(8, "Tivi", 15, 1500000, 15, 30));
		a.themHH(new HangDienMay(9, "Tu Lanh", 25, 2500000, 15, 35));
		a.themHH(new HangDienMay(10, "Laptop", 10, 3200000, 15, 40));
		a.themHH(new HangDienMay(11, "phone", 8, 180000, 15, 10));
		a.themHH(new HangDienMay(12, "Am Nuoc", 30,30000 , 15, 29));
		a.themHH(new HangDienMay(13, "Ban La", 12, 25000, 15, 69));
		a.themHH(new HangDienMay(14, "May Lanh", 15, 100000, 15, 30));
		a.themHH(new HangSanhSu(15, "Ly", 10, 250000, "Long Thanh", LocalDate.of(2020, 10, 30)));
		a.themHH(new HangSanhSu(16, "chen", 15, 15000, "Minh Nhua", LocalDate.of(2020, 10, 28)));
		a.themHH(new HangSanhSu(17, "Dua", 50, 50000, "Rang Dong", LocalDate.of(2020, 10, 19)));
		a.themHH(new HangSanhSu(18, "Muon", 10, 23000, "CTY Do Gom", LocalDate.of(2020, 10, 30)));
		a.themHH(new HangSanhSu(19, "Binh", 15, 32000, "Long Thanh", LocalDate.of(2020, 12, 30)));
		a.themHH(new HangSanhSu(20, "To", 15, 15000, "Minh Nhua", LocalDate.of(2020, 11, 28)));
		a.themHH(new HangSanhSu(21, "Chau", 18, 25000, "Long Thanh", LocalDate.of(2020, 10, 30)));
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		while (true) {
			System.out.println("\n_____MENU HANG HOA_____");
			System.out.println("1. In Hang Hoa");
			System.out.println("2. Xoa Hang Haa Theo ma");
			System.out.println("3. Sua hang Hoa");
			System.out.println("4. tim kiem Ten");
			System.out.println("5. Tim kiem theo gia");
			System.out.println("6. Tim kiem theo Ngay");
			System.out.println("7. Sap xep danh sach tang dan theo gia ");
			System.out.println("8. Sap xep danh sach giam dan theo gia ");
			System.out.println("9. Sap xep danh sach tang dan theo ma");
			System.out.println("10. Sap xep danh sach giam dan theo ma");
			System.out.println("11. Tong So Luong Hang Hoa");
			System.out.println("12. Tong Gia Tri Nhap Kho");
			System.out.println("13. Tong So Luong tuan loai");
			System.out.println("0. Thoat");
			System.out.print("\n\tMoi nhap lua chon: ");
			n = sc.nextInt();
			
			while (n < 0 || n > 13) {
				System.out.print("\nNhap lai lua chon (0-13): ");
				n = sc.nextInt();
			}
			
				switch (n) {
				case 1:
					System.out.println(a.toString());
					break;
				case 2:
					System.out.println("nhap ma can xoa: ");
					int maHang = sc.nextInt();
					if(a.xoaHH(maHang)) {
                        System.out.println("Xoa thanh cong");  
                        System.out.println(a);
                    } else {
                        System.out.println("Xoa khong thanh cong");    
                    } 
					break;
				case 3:
					 System.out.print("\nNhap ma hang: ");
	                    sc.nextLine();
	                    int maHa = sc.nextInt();
	                    System.out.print("\nNhap đon gia moi: ");
	                    double donGia_moi = sc.nextDouble();
	                    if (a.suaHH(maHa, donGia_moi)) {
	                        System.out.println("Sua thanh cong");
	                        System.out.println(a);
	                    } else {
	                        System.out.println("Sua khong thanh cong");
	                    }
	                    break;
				case 4:
					 System.out.print("\nNhap Ten Can Tim: ");
					 sc.nextLine();
					 String k = sc.nextLine();
	                    DanhSachHangHoa ds_ten = a.timkiemtheoten(k);
	                    if (ds_ten.getsize() == 0 ) {
	                        System.out.println("Khong tim thay");
	                    } else {
	                        System.out.println("Tim thay");
	                        System.out.println(a);
	                    }
	                    break;
				case 5:
					System.out.println("\nNhap Gia can tim kiem: ");
					double gia = sc.nextDouble();
					DanhSachHangHoa ds_gia = a.timkiemtheogia(gia);
					if (ds_gia.getsize() == 0)
						System.out.println("Khong tim thay: ");
					else
						System.out.println("Tim thay");
						System.out.println(a);
					break;
				case 6:
					System.out.println("\nNhap ngay can tim kiem: ");
					LocalDate ngay = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
					DanhSachHangHoa ds_ngay = a.timkiemtheongay(ngay);
					if(ds_ngay.getsize() == 0)
						System.out.println("Khong tim thay: ");
					else
						System.out.println("Tim thay");
						System.out.println(a);
					break;
				case 7:
					a.xapxepdongiatangdan();
					System.out.println("Sap xep thanh cong!");
					System.out.println(a);
					break;
				case 8:
					a.xapxepdongiagiamdan();;
					System.out.println("Sap xep thanh cong!");
					System.out.println(a);
					break;
				case 9:
					a.xapxepgaynhaptangdan();;
					System.out.println("Sap xep thanh cong!");
					System.out.println(a);
					break;
				case 10:
					a.xapxepngaynhapgamdan();
					System.out.println("Sap xep thanh cong!");
					System.out.println(a);
					break;
				case 11 :
					System.out.println("	tong so luong hang hoa  "  + a.tongsoluonghanghoa());
					break;
				case 12 :
					System.out.println("	tong so tung loai hang hoa  " + a.tongtungloai());
					break;
				case 13:
					System.out.println("	tong so hang hoa " + a.getsize());
				case 0:
					sc.close();
					System.out.println("\nKet thuc");
					return;
				}
			}
		}
	}


