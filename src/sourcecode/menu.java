import java.util.Scanner;
import java.io.IOException;

public class menu implements IMenu {
    Scanner sc = new Scanner(System.in);

    dsSanPham menuSP = new dsSanPham();
    dsHoaDon menuHD = new dsHoaDon();
    dsChiTietHoaDon menuCTHD = new dsChiTietHoaDon();
    dsPhieuNhap menuPN = new dsPhieuNhap();
    dsChiTietPhieuNhap menuCTPN = new dsChiTietPhieuNhap();
    dsNhaCungCap menuNCC = new dsNhaCungCap();
    dsKhachHang menuKH = new dsKhachHang();
    dsBaoHanh menuBH = new dsBaoHanh();


    // Menu san pham
    public void menuSanPham_2() {
        System.out.println("Nhap id san pham ban muon tim: ");
        String id = checkLoi.checkIdSanPham();

        // check id san pham vua nhap khong ton tai thi thoat ra
        if (!menuSP.tonTaiSanPham(id)) {
            System.out.println("San pham khong ton tai!");
            System.out.println("===================================================");
            return;
        }

        int choice;

        do {
            // xuat lai thong tin san pham sau moi lan thay doi mot thuoc tinh
            menuSP.timSanPham(id);

            System.out.println("+---------------------------+");
            System.out.println("|       Menu san pham       |");
            System.out.println("+---------------------------+");
            System.out.println("|1. Thay doi ten.           |");
            System.out.println("|2. Thay doi so luong.      |");
            System.out.println("|3. Thay doi gia tien.      |");
            System.out.println("|4. Xoa san pham.           |");
            System.out.println("|0. Thoat chuong trinh.     |");
            System.out.println("+---------------------------+");
            System.out.println("Moi ban nhap lua chon: ");
            choice = checkLoi.checkLuaChon();
            System.out.println("===================================================");

            switch (choice) {
                case 1:
                    menuSP.doiTenSanPham(id);
                    break;
                case 2:
                    menuSP.doiSoLuongSanPham(id);
                    break;
                case 3:
                    menuSP.doiGiaTienSanPham(id);
                    break;
                case 4:
                    menuSP.xoaSanPham(id);
                    System.out.println("Da xoa san pham!");
                    choice = 0;
                    break;
                case 0:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
        } while (choice != 0);
    }

    public void menuSanPham() {
        int choice;
       
        do {
            System.out.println("+---------------------------+");
            System.out.println("|       Menu san pham       |");
            System.out.println("+---------------------------+");
            System.out.println("|1. Xem danh sach san pham. |");
            System.out.println("|2. Tim san pham.           |");
            System.out.println("|3. Tao danh sach co san.   |");
            System.out.println("|4. Doc file san pham.      |");
            System.out.println("|5. Ghi file san pham.      |");
            System.out.println("|0. Thoat chuong trinh.     |");
            System.out.println("+---------------------------+");
            System.out.println("Moi ban nhap lua chon: ");
            choice = checkLoi.checkLuaChon();
            System.out.println("===================================================");

            switch (choice) {
                case 1:
                    menuSP.xuatDsDesktop();
                    menuSP.xuatDsLaptop();
                    break;
                case 2:
                    menuSanPham_2();
                    break;
                case 3:
                    if (menuSP.arr_sp.size() == 0) {
                        menuSP.taoDsCoSan();
                    }
                    else System.out.println("Danh sach dang khong rong!");
                    break;
                case 4:
                    try {
                        menuSP.arr_sp = xuLyFile.readSanPham(menuSP.arr_sp);
                        System.out.println("Doc file thanh cong!");
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                    break;
                case 5:
                    try {
                        xuLyFile.writeSanPham(menuSP.arr_sp);
                        System.out.println("Ghi file thanh cong!");
                    } catch (IOException ex) {
                        System.out.println(ex);
                    }
                    break;
                case 0:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
        } while (choice != 0);
    }

    // Menu khach hang
    public void sanPhamDaMua(String id) {
        String spdm_format = "| %-8s | %-18s | %-17s | %n";
        for (chiTietHoaDon cthd : menuCTHD.arr_cthd) {
            if (cthd.getIdHoaDon().equals(id)) {
                System.out.format(spdm_format, cthd.getIdHoaDon(), menuSP.getTenSanPham(cthd.getIdSp()), menuBH.kThucBaoHanh(cthd.getIdBH(), menuHD.getLastHD().getNgayMua()));
            }
        }
    }

    public void timHoaDonKhach(String id) {
        System.out.println("+----------+--------------------+-------------------+");
        System.out.println("|  ID HD   |      San pham      | Ngay het bao hanh |");
        System.out.println("+----------+--------------------+-------------------+");

        for (hoaDon hd : menuHD.arr_hd) {
            // tim nhung hoa don co id khach hang va hoa don do chua bi huy
            if (hd.getIdKhach().equals(id) && hd.getTongTien() > 0) {
                sanPhamDaMua(hd.getIdHoaDon());
            }
        }
        System.out.println("+----------+--------------------+-------------------+");
    }

    public void menuKhachHang_2() {
        System.out.println("Nhap id khach hang ban muon tim: ");
        String id = checkLoi.checkIdKhachHang();

        if (!menuKH.tonTaiKH(id)) {
            System.out.println("Khach hang khong ton tai!");
            System.out.println("===================================================");
            return;
        }

        int choice;

        do {
            menuKH.timKH(id);

            System.out.println("+-----------------------------+");
            System.out.println("|       Menu khach hang       |");
            System.out.println("+-----------------------------+");
            System.out.println("|1. Thay doi ten.             |");
            System.out.println("|2. Thay doi so dien thoai.   |");
            System.out.println("|3. Thay doi dia chi.         |");
            System.out.println("|4. Xem san pham da mua.      |");
            System.out.println("|5. Xoa khach hang.           |");
            System.out.println("|0. Thoat chuong trinh.       |");
            System.out.println("+-----------------------------+");
            System.out.println("Moi ban nhap lua chon: ");
            choice = checkLoi.checkLuaChon();
            System.out.println("===================================================");

            switch (choice) {
                case 1:
                    menuKH.doiTenKH(id);
                    break;
                case 2:
                    menuKH.doiSDTKH(id);
                    break;
                case 3:
                    menuKH.doiDiaChiKH(id);
                    break;
                case 4:
                    timHoaDonKhach(id);
                    break;
                case 5:
                    menuKH.xoaKH(id);
                    System.out.println("Da xoa khach hang!");
                    choice = 0;
                    break;
                case 0:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
        } while (choice != 0);
    }

    public void menuKhachHang() {
        int choice;

        do {
            System.out.println("+-----------------------------+");
            System.out.println("|       Menu khach hang       |");
            System.out.println("+-----------------------------+");
            System.out.println("|1. Xem danh sach khach hang. |");
            System.out.println("|2. Tim khach hang.           |");
            System.out.println("|3. Them khach hang.          |");
            System.out.println("|4. Tao san khach hang.       |");
            System.out.println("|5. Doc file khach hang.      |");
            System.out.println("|6. Ghi file khach hang.      |");
            System.out.println("|0. Thoat chuong trinh.       |");
            System.out.println("+-----------------------------+");
            System.out.println("Moi ban nhap lua chon: ");
            choice = checkLoi.checkLuaChon();
            System.out.println("===================================================");

            switch (choice) {
                case 1:
                    menuKH.xuat_ds();
                    break;
                case 2:
                    menuKhachHang_2();
                    break;
                case 3:
                    menuKH.them_kh();
                    break;
                case 4:
                    if (menuKH.arr_kh.size() == 0) {
                        menuKH.taoDsCoSan();
                    } else System.out.println("Danh sach khong rong!");
                    break;
                case 5:
                    try {
                        menuKH.arr_kh = xuLyFile.readKhachHang(menuKH.arr_kh);
                        System.out.println("Doc file thanh cong!");
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                    break;
                case 6:
                    try {
                        xuLyFile.writeKhachHang(menuKH.arr_kh);
                        System.out.println("Ghi file thanh cong!");
                    } catch (IOException ex) {
                        System.out.println(ex);
                    }
                    break;
                case 0:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
        } while (choice != 0);
    }

    // Menu chi tiet hoa don
    public String menuChonBaoHanh() {
        int choice;
        String bHanh = "";
        do {
            System.out.println("+-----------------------------+");
            System.out.println("|     Menu chon bao hanh      |");
            System.out.println("+-----------------------------+");
            System.out.println("|1. Bao hanh 12 thang.        |");
            System.out.println("|2. Bao hanh 24 thang.        |");
            System.out.println("|3. Bao hanh 36 thang.        |");
            System.out.println("+-----------------------------+");
            System.out.print("Moi ban nhap lua chon: ");
            choice = checkLoi.checkLuaChon();
            System.out.println("===================================================");

            switch (choice) {
                case 1:
                    bHanh = "12T";
                    choice = 0;
                    break;
                case 2:
                    bHanh = "24T";
                    choice = 0;
                    break;
                case 3:
                    bHanh = "36T";
                    choice = 0;
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
        } while (choice != 0);
        return bHanh;
    }

    public void menuChiTietHoaDon() {
        int choice;
        double sumMoney = 0;

        do {
            System.out.println("+-----------------------------+");
            System.out.println("|    Menu chi tiet hoa don    |");
            System.out.println("+-----------------------------+");
            System.out.println("|1. Nhap san pham.            |");
            System.out.println("|0. Hoan thanh.               |");
            System.out.println("+-----------------------------+");
            System.out.print("Moi ban nhap lua chon: ");
            choice = checkLoi.checkLuaChon();
            System.out.println("===================================================");

            switch (choice) {
                case 1:
                    chiTietHoaDon tmp = new chiTietHoaDon();
                    tmp.nhapCTHD();
                    if (!menuSP.tonTaiSanPham(tmp.getIdSp())
                            || !menuSP.duSoLuongSanPham(tmp.getIdSp(), tmp.getSoLuong())) {
                        System.out.println("San pham khong ton tai hoac so luong hien co khong du!");
                        break;
                    }
                    // lay ra gia tien cua san pham co id vua nhap
                    tmp.setGiaTien(menuSP.getDonGia(tmp.getIdSp()));
                    tmp.setIdBH(menuChonBaoHanh());

                    // cong vao bien tong tien
                    sumMoney += tmp.getThanhtien();

                    tmp.setIdHoaDon(menuHD.getLastHD().getIdHoaDon());
                    menuCTHD.arr_cthd.add(tmp);
                    break;
                case 0:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
        } while (choice != 0);
        // gan bien tong tien lai cho hoa don
        menuHD.getLastHD().setTongTien(sumMoney);
    }

    // Menu hoa don
    public void menuHoaDon_3() {
        int choice;

        // tao id hoa don, id khach va ngay xuat hoa don
        // menuHD.taoHD(); 
        hoaDon tmp = new hoaDon();
        tmp.nhapHD();
        if (!menuKH.tonTaiKH(tmp.getIdKhach())) {
            System.out.println("Khach hang khong ton tai, vui long them khach hang truoc!");
            System.out.println("===================================================");
            return;
        }
        menuHD.arr_hd.add(tmp);
        // goi menu chi tiet hoa don de nhap chi tiet
        menuChiTietHoaDon();
        // xuat ra hoa don vua tao
        String cthd_format = "| %-18s | %-8s | %-8s | %-12.2f | %-12.2f | %n";
        System.out.println("Day la hoa don vua tao: ");
        System.out.println("+--------------------+----------+----------+--------------+--------------+");
        System.out.println("|      San pham      | So luong | Bao hanh |    Don gia   |  Thanh tien  |");
        System.out.println("+--------------------+----------+----------+--------------+--------------+");

        for (chiTietHoaDon ct : menuCTHD.arr_cthd) {
            if (ct.getIdHoaDon().equals(menuHD.getLastHD().getIdHoaDon())) {
                System.out.format(cthd_format, menuSP.getTenSanPham(ct.getIdSp()), ct.getSoLuong(), ct.getIdBH(), ct.getGiaTien(), ct.getThanhtien());
            }
        }
        System.out.println("+--------------------+----------+----------+--------------+--------------+");
        String tongtien_format = "| Tong tien: %-59.2f | %n";
        System.out.format(tongtien_format, menuHD.getLastHD().getTongTien());
        System.out.println("+--------------------+----------+----------+--------------+--------------+");

        do {
            System.out.println("+-----------------------------+");
            System.out.println("|         Menu hoa don        |");
            System.out.println("+-----------------------------+");
            System.out.println("|1. Luu va in hoa don.        |");
            System.out.println("|2. Huy hoa don.              |");
            System.out.println("+-----------------------------+");
            System.out.print("Moi ban nhap lua chon: ");
            choice = checkLoi.checkLuaChon();
            System.out.println("===================================================");

            switch (choice) {
                case 1:
                    System.out.println("Dang in hoa don...");

                    menuHD.getLastHD().xuatHD();
                    System.out.println("+--------------------+----------+----------+--------------+--------------+");
                    System.out.println("|      San pham      | So luong | Bao hanh |    Don gia   |  Thanh tien  |");
                    System.out.println("+--------------------+----------+----------+--------------+--------------+");

                    for (chiTietHoaDon ct : menuCTHD.arr_cthd) {
                        // vua xuat chi tiet hoa don vua giam so luong o kho san pham
                        if (ct.getIdHoaDon().equals(menuHD.getLastHD().getIdHoaDon())) {
                            System.out.format(cthd_format, menuSP.getTenSanPham(ct.getIdSp()), ct.getSoLuong(), ct.getIdBH(), ct.getGiaTien(), ct.getThanhtien());
                            // goi ben class dsSanPham. Phieu nhap thi dung class tang so luong
                            menuSP.giamSoLuongSanPham(ct.getIdSp(), ct.getSoLuong());
                        }
                    }
                    System.out.println("+--------------------+----------+----------+--------------+--------------+");
                    System.out.format(tongtien_format, menuHD.getLastHD().getTongTien());
                    System.out.println("+--------------------+----------+----------+--------------+--------------+");

                    choice = 0;
                    break;
                case 2:
                    menuHD.getLastHD().setTongTien(0);
                    System.out.println("Da huy hoa don vua tao.");
                    choice = 0;
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
        } while (choice != 0);
    }

    public void menuHoaDon() {
        int choice;

        do {
            System.out.println("+-----------------------------+");
            System.out.println("|         Menu hoa don        |");
            System.out.println("+-----------------------------+");
            System.out.println("|1. Xem danh sach hoa don.    |");
            System.out.println("|2. Tim hoa don.              |");
            System.out.println("|3. Tao hoa don.              |");
            System.out.println("|4. Doc file hoa don.         |");
            System.out.println("|5. Ghi file hoa don.         |");
            System.out.println("|0. Thoat chuong trinh.       |");
            System.out.println("+-----------------------------+");
            System.out.println("Moi ban nhap lua chon: ");
            choice = checkLoi.checkLuaChon();
            System.out.println("===================================================");

            switch (choice) {
                case 1:
                    menuHD.xuatDSHD();
                    break;
                case 2:
                    menuHD.timHoaDon();
                    break;
                case 3:
                    menuHoaDon_3();
                    break;
                case 4:
                    try {
                        menuHD.arr_hd = xuLyFile.readHoaDon(menuHD.arr_hd);
                        System.out.println("Doc file thanh cong!");
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                    break;
                case 5:
                    try {
                        xuLyFile.writeHoaDon(menuHD.arr_hd);
                        System.out.println("Ghi file thanh cong!");
                    } catch (IOException ex) {
                        System.out.println(ex);
                    }
                    break;
                case 0:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
        } while (choice != 0);

    }

    // Menu chi tiet phieu nhap
    public void menuChiTIetPhieuNhap() {
        int choice;
        double sumMoney = 0;
        do {
            System.out.println("+-----------------------------+");
            System.out.println("|   Menu chi tiet phieu nhap  |");
            System.out.println("+-----------------------------+");
            System.out.println("|1. Nhap san pham.            |");
            System.out.println("|0. Hoan thanh.               |");
            System.out.println("+-----------------------------+");
            System.out.print("Moi ban nhap lua chon: ");
            choice = checkLoi.checkLuaChon();

            System.out.println("===================================================");

            switch (choice) {
                case 1:
                    chiTietPhieuNhap tmp = new chiTietPhieuNhap();
                    tmp.nhapCTPN();

                    if (menuSP.tonTaiSanPham(tmp.getIdSp())) {
                        // lay gia tiên cua san pham khi ton tai san pham
                        tmp.setGiaTien(menuSP.getDonGia(tmp.getIdSp()));
                        menuSP.themSanPham(tmp.getIdSp(), tmp.getSoLuong());
                    } else {
                        menuSP.themSanPhamMoi(tmp.getIdSp(), tmp.getSoLuong());
                        tmp.setGiaTien(menuSP.getDonGia(tmp.getIdSp()));

                    }
                    sumMoney += tmp.getThanhtien();
                    tmp.setIdPhieu(menuPN.getLastPN().getIdphieu());
                    menuCTPN.arr_ctpn.add(tmp);
                    break;
                case 0:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
        } while (choice != 0);
        menuPN.getLastPN().setTongTien(sumMoney);
    }

    // Menu phieu nhap
    public void menuPhieuNhap_3() {
        int choice;

        phieuNhap tmp = new phieuNhap();
        tmp.nhapPN();
        if (!menuNCC.tonTaiNCC(tmp.getIdncc())) {
            System.out.println("Nha cung cap khong ton tai, vui long them nha cung cap truoc!");
            System.out.println("===================================================");
            return;
        }
        menuPN.arr_pn.add(tmp);

        menuChiTIetPhieuNhap();

        System.out.println("Day la phieu nhap vua tao: ");
        System.out.println("+--------------------+----------+--------------+--------------+");
        System.out.println("|      San pham      | So luong |    Don gia   |  Thanh tien  |");
        System.out.println("+--------------------+----------+--------------+--------------+");
        for (chiTietPhieuNhap ct : menuCTPN.arr_ctpn) {
            if (ct.getIdPhieu().equals(menuPN.getLastPN().getIdphieu())) {
                ct.xuatCTPN();
            }
        }

        String tongtien_format = "| Tong tien: %-48.2f | %n";
        System.out.println("+--------------------+----------+--------------+--------------+");
        System.out.format(tongtien_format, menuPN.getLastPN().getTongTien());
        System.out.println("+--------------------+----------+--------------+--------------+");

        do {

            System.out.println("+-----------------------------+");
            System.out.println("|        Menu phieu nhap      |");
            System.out.println("+-----------------------------+");
            System.out.println("|1. Luu va in phieu nhap.     |");
            System.out.println("|2. Huy phieu nhap.           |");
            System.out.println("+-----------------------------+");
            System.out.print("Moi ban nhap lua chon: ");
            choice = checkLoi.checkLuaChon();
            System.out.println("===================================================");

            switch (choice) {
                case 1:
                    System.out.println("Dang in phieu nhap...");
                    menuPN.getLastPN().xuatPN();
                    System.out.println("+--------------------+----------+--------------+--------------+");
                    System.out.println("|      San pham      | So luong |    Don gia   |  Thanh tien  |");
                    System.out.println("+--------------------+----------+--------------+--------------+");
                    for (chiTietPhieuNhap ct : menuCTPN.arr_ctpn) {
                        // vua xuat chi tiet phieu nhap vua tang so luong o danh sach san pham
                        if (ct.getIdPhieu().equals(menuPN.getLastPN().getIdphieu())) {
                            ct.xuatCTPN();
                        }
                    }
                    System.out.println("+--------------------+----------+--------------+--------------+");
                    System.out.format(tongtien_format, menuPN.getLastPN().getTongTien());
                    System.out.println("+--------------------+----------+--------------+--------------+");                   
                    
                    choice = 0;
                    break;
                case 2:
                    for (chiTietPhieuNhap ct : menuCTPN.arr_ctpn) {
                        if (ct.getIdPhieu().equals(menuPN.getLastPN().getIdphieu())) {
                            menuSP.giamSoLuongSanPham(ct.getIdSp(), ct.getSoLuong());
                        }
                    }
                    menuPN.getLastPN().setTongTien(0);
                  
                    System.out.println("Da huy phieu nhap vua tao.");
                    choice = 0;
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
        } while (choice != 0);
    }

    public void menuPhieuNhap() {
        int choice;

        do {
            System.out.println("+-----------------------------+");
            System.out.println("|         Menu phieu nhap     |");
            System.out.println("+-----------------------------+");
            System.out.println("|1. Xem danh sach phieu nhap. |");
            System.out.println("|2. Tim phieu nhap.           |");
            System.out.println("|3. Tao phieu nhap.           |");
            System.out.println("|4. Doc file phieu nhap.      |");
            System.out.println("|5. Ghi file phieu nhap.      |");
            System.out.println("|0. Thoat chuong trinh.       |");
            System.out.println("+-----------------------------+");
            System.out.println("Moi ban nhap lua chon: ");
            choice = checkLoi.checkLuaChon();
            System.out.println("===================================================");

            switch (choice) {
                case 1:
                    menuPN.xuatDSPN();
                    break;
                case 2:
                    menuPN.timPN();
                    break;
                case 3:
                    menuPhieuNhap_3();
                    break;
                case 4:
                    try {
                        menuPN.arr_pn = xuLyFile.readPhieuNhap(menuPN.arr_pn);
                        System.out.println("Doc file thanh cong!");
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                    break;
                case 5:
                    try {
                        xuLyFile.writePhieuNhap(menuPN.arr_pn);
                        System.out.println("Ghi file thanh cong!");
                    } catch (IOException ex) {
                        System.out.println(ex);
                    }
                    break;
                case 0:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
        } while (choice != 0);
    }

    // Menu nha cung cap
    public void menuNhaCungCap_2() {
        System.out.println("Nhap id nha cung cap can tim: ");
        String id = checkLoi.checkIdNhaCungCap();

        if (!menuNCC.tonTaiNCC(id)) {
            System.out.println("Nha cung cap khong ton tai!");
            System.out.println("===================================================");
            return;
        }

        int choice;

        do {
            menuNCC.timNCC(id);

            System.out.println("+---------------------------+");
            System.out.println("|     Menu nha cung cap     |");
            System.out.println("+---------------------------+");
            System.out.println("|1. Thay doi ten.           |");
            System.out.println("|2. Thay doi so dien thoai. |");
            System.out.println("|3. Xoa nha cung cap        |");
            System.out.println("|0. Thoat chuong trinh.     |");
            System.out.println("+---------------------------+");
            System.out.println("Moi ban nhap lua chon: ");
            choice = checkLoi.checkLuaChon();
            System.out.println("===================================================");

            switch (choice) {
                case 1:
                    menuNCC.doiTen(id);
                    break;
                case 2:
                    menuNCC.doiSDT(id);
                    break;
                case 3:
                    menuNCC.xoancc(id);
                    System.out.println("Da xoa nha cung cap!");
                    choice = 0;
                    break;
                case 0:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
        } while (choice != 0);
    }

    public void menuNhaCungCap() {
        int choice;

        do {
            System.out.println("+-----------------------------+");
            System.out.println("|       Menu nha cung cap     |");
            System.out.println("+-----------------------------+");
            System.out.println("|1. Xem danh sach.            |");
            System.out.println("|2. Tim nha cung cap.         |");
            System.out.println("|3. Them nha cung cap.        |");
            System.out.println("|4. Tao san nha cung cap.     |");
            System.out.println("|5. Doc file nha cung cap.    |");
            System.out.println("|6. Ghi file nha cung cap.    |");
            System.out.println("|0. Thoat chuong trinh.       |");
            System.out.println("+-----------------------------+");
            System.out.println("Moi ban nhap lua chon: ");
            choice = checkLoi.checkLuaChon();
            System.out.println("===================================================");

            switch (choice) {
                case 1:
                    menuNCC.xuatdsncc();
                    break;
                case 2:
                    menuNhaCungCap_2();
                    break;
                case 3:
                    menuNCC.themNcc();
                    break;
                case 4:
                    if (menuNCC.dsnhacungcap.size() == 0) {
                        menuNCC.taoDsCoSan();
                    } else System.out.println("Danh sach khong rong!");
                    break;
                case 5:
                    try {
                        menuNCC.dsnhacungcap = xuLyFile.readNhaCungCap(menuNCC.dsnhacungcap);
                        System.out.println("Doc file thanh cong!");
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                    break;
                case 6:
                    try {
                        xuLyFile.writeNhaCungCap(menuNCC.dsnhacungcap);
                        System.out.println("Ghi file thanh cong!");
                    } catch (IOException ex) {
                        System.out.println(ex);
                    }
                    break;
                case 0:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
        } while (choice != 0);
    }

    // Menu thong ke
    public void thongKe() {
        System.out.println("Tong so san pham dang co: " + menuSP.tongSanPham());
        System.out.println("Tong so desktop dang co: " + menuSP.tongDesktop());
        System.out.println("Tong so laptop dang co: " + menuSP.tongLaptop());
        System.out.println();
        System.out.println("Tong hoa don: " + menuHD.tongHoaDon());
        System.out.println("Tong hoa don da ban: " + menuHD.tongHoaDonBan());
        System.out.println("Tong hoa don da huy: " + menuHD.tongHoaDonHuy());
        System.out.println();
        System.out.println("Tong phieu nhap: " + menuPN.tongPhieuNhap());
        System.out.println("Tong phieu nhap da nhap: " + menuPN.tongPhieuNhapNhap());
        System.out.println("Tong phieu nhap da huy: " + menuPN.tongPhieuNhapHuy());
        System.out.println("===================================================");

    }

    // Menu main
    public void menuMain() {
        int choice;

        do {
            System.out.println("+---------------------------+");
            System.out.println("|   Menu quan ly cuu hang   |");
            System.out.println("+---------------------------+");
            System.out.println("|1. Quan ly san pham.       |");
            System.out.println("|2. Quan ly khach hang.     |");
            System.out.println("|3. Quan ly hoa don.        |");
            System.out.println("|4. Quan ly phieu nhap.     |");
            System.out.println("|5. Quan ly nha cung cap.   |");
            System.out.println("|6. Thong ke.               |");
            System.out.println("|0. Thoat chuong trinh.     |");
            System.out.println("+---------------------------+");
            System.out.println("Moi ban nhap lua chon: ");
            choice = checkLoi.checkLuaChon();
            System.out.println("===================================================");

            switch (choice) {
                case 1:
                    menuSanPham();
                    break;
                case 2:
                    menuKhachHang();
                    break;
                case 3:
                    menuHoaDon();
                    break;
                case 4:
                    menuPhieuNhap();
                    break;
                case 5:
                    menuNhaCungCap();
                    break;
                case 6:
                    thongKe();
                    break;
                case 0:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }

        } while (choice != 0);
    }
}