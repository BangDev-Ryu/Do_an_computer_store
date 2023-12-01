import java.util.Scanner;

public class menu {
    Scanner sc = new Scanner(System.in);

    dsSanPham menuSP = new dsSanPham();
    dsHoaDon menuHD = new dsHoaDon();
    dsChiTietHoaDon menuCTHD = new dsChiTietHoaDon();
    dsPhieuNhap menuPN = new dsPhieuNhap();
    dsChiTietPhieuNhap menuCTPN = new dsChiTietPhieuNhap();
    dsNhaCungCap menuNCC = new dsNhaCungCap();

    // khong su dung
    public String menuChonLoaiSP() {
        int choice;
        String ma = "";

        do {
            System.out.println("+---------------------------+");
            System.out.println("|    Chon loai san pham     |");
            System.out.println("+---------------------------+");
            System.out.println("|1. Desktop.                |");
            System.out.println("|2. Laptop.                 |");
            System.out.println("+---------------------------+");
            System.out.println("Moi ban nhap lua chon: ");
            choice = sc.nextInt();
            System.out.println("===================================================");

            switch (choice) {
                case 1:
                    ma = "DE";
                    choice = 0;
                    break;
                case 2:
                    ma = "LA";
                    choice = 0;
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
        } while (choice != 0);

        return ma;
    }

    // Menu san pham
    public void menuSanPham_2() {
        System.out.println("Nhap id san pham ban muon tim (LAXXX/DEXXX): ");
        String tmp = sc.nextLine();
        String id = sc.nextLine();

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
            System.out.println("|0. Thoat chuong trinh.     |");
            System.out.println("+---------------------------+");
            System.out.println("Moi ban nhap lua chon: ");
            choice = sc.nextInt();
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
            System.out.println("|0. Thoat chuong trinh.     |");
            System.out.println("+---------------------------+");
            System.out.println("Moi ban nhap lua chon: ");
            choice = sc.nextInt();
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
                    menuSP.taoDsCoSan();
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
    public void menuKhachHang() {
        int choice;

        do {
            System.out.println("+-----------------------------+");
            System.out.println("|       Menu khach hang       |");
            System.out.println("+-----------------------------+");
            System.out.println("|1. Xem danh sach khach hang. |");
            System.out.println("|2. Tim khach hang.           |");
            System.out.println("|3. Them khach hang.          |");
            System.out.println("|0. Thoat chuong trinh.       |");
            System.out.println("+-----------------------------+");
            System.out.println("Moi ban nhap lua chon: ");
            choice = sc.nextInt();
            System.out.println("===================================================");

            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
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
            choice = sc.nextInt();
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
        menuHD.taoHD();
        // goi menu chi tiet hoa don de nhap chi tiet
        menuChiTietHoaDon();
        // xuat ra hoa don vua tao
        System.out.println("Day la hoa don vua tao: ");
        System.out.println("+--------------------+----------+--------------+--------------+");
        System.out.println("|      San pham      | So luong |    Don gia   |  Thanh tien  |");
        System.out.println("+--------------------+----------+--------------+--------------+");

        for (chiTietHoaDon ct : menuCTHD.arr_cthd) {
            if (ct.getIdHoaDon().equals(menuHD.getLastHD().getIdHoaDon())) {
                ct.xuatCTHD();
            }
        }
        System.out.println("+--------------------+----------+--------------+--------------+");
        String tongtien_format = "| Tong tien: %-48.2f | %n";
        System.out.format(tongtien_format, menuHD.getLastHD().getTongTien());
        System.out.println("+--------------------+----------+--------------+--------------+");

        do {
            System.out.println("+-----------------------------+");
            System.out.println("|         Menu hoa don        |");
            System.out.println("+-----------------------------+");
            System.out.println("|1. Luu va in hoa don.        |");
            System.out.println("|2. Huy hoa don.              |");
            System.out.println("+-----------------------------+");
            System.out.print("Moi ban nhap lua chon: ");
            choice = sc.nextInt();
            System.out.println("===================================================");

            switch (choice) {
                case 1:
                    System.out.println("Dang in hoa don...");

                    menuHD.getLastHD().xuatHD();
                    System.out.println("+--------------------+----------+--------------+--------------+");
                    System.out.println("|      San pham      | So luong |    Don gia   |  Thanh tien  |");
                    System.out.println("+--------------------+----------+--------------+--------------+");

                    for (chiTietHoaDon ct : menuCTHD.arr_cthd) {
                        // vua xuat chi tiet hoa don vua giam so luong o kho san pham
                        if (ct.getIdHoaDon().equals(menuHD.getLastHD().getIdHoaDon())) {
                            ct.xuatCTHD();
                            // goi ben class dsSanPham. Phieu nhap thi dung class tang so luong
                            menuSP.giamSoLuongSanPham(ct.getIdSp(), ct.getSoLuong());
                        }
                    }
                    System.out.println("+--------------------+----------+--------------+--------------+");
                    System.out.format(tongtien_format, menuHD.getLastHD().getTongTien());
                    System.out.println("+--------------------+----------+--------------+--------------+");

                    choice = 0;
                    break;
                case 2:
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
            System.out.println("|0. Thoat chuong trinh.       |");
            System.out.println("+-----------------------------+");
            System.out.println("Moi ban nhap lua chon: ");
            choice = sc.nextInt();
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
            choice = sc.nextInt();

            System.out.println("===================================================");

            switch (choice) {
                case 1:
                    chiTietPhieuNhap tmp = new chiTietPhieuNhap();
                    tmp.nhapCTPN();
                    if (menuSP.tonTaiSanPham(tmp.getMaSp())) {
                        // lay gia tiên cua san pham khi ton tai san pham
                        tmp.setGiaTien(menuSP.getDonGia(tmp.getMaSp()));
                    } else {
                        sc.nextLine();
                        System.out.println("ten san pham:");
                        String tensp = sc.nextLine();
                        System.out.println("nhap gia tien:");
                        double gia = sc.nextDouble();
                        tmp.setGiaTien(gia);
                        System.out.println("so luong :" + tmp.getSoLuong());
                        String masp = tmp.getMaSp().substring(2);
                        if ("DE".equals(tmp.getMaSp().substring(0, 2))) {
                            desktop desk = new desktop(masp, tensp, tmp.getSoLuong(), gia);
                            menuSP.themSoLuongSanPham(desk);
                        } else if ("LA".equals(tmp.getMaSp().substring(0, 2))) {
                            laptop lap = new laptop(masp, tensp, tmp.getSoLuong(), gia);
                            menuSP.themSoLuongSanPham(lap);
                        } else {
                            System.out.println("Nhap sai loai san pham");
                        }
                    }

                    sumMoney += tmp.getThanhtien();
                    tmp.setIdPhieu(menuPN.getLastPN().getIdphieu());
                    menuCTPN.arr_ctpn.add(tmp);
                    menuPN.getLastPN().chiTietPN.add(tmp);

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
    public void menuPhieuNhap_2() {
        int choice;

        menuPN.taoPN();

        menuChiTIetPhieuNhap();

        System.out.println("Day la phieu nhap vua tao: ");
        System.out.println("+--------------------+----------+--------------+--------------+");
        System.out.println("|      San pham      | So luong |    Don gia   |  Thanh tien  |");
        System.out.println("+--------------------+----------+--------------+--------------+");
        for (chiTietPhieuNhap ct : menuCTPN.arr_ctpn) {
            if (ct.getIdPhieu() != null && ct.getIdPhieu().equals(menuPN.getLastPN().getIdphieu())) {
                ct.xuatCTPN();
            }
        }

        System.out.println("+--------------------+----------+--------------+--------------+");
        String tongtien_format = "| Tong tien: %-48.2f | %n";
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
            choice = sc.nextInt();
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
                        if (ct.getIdPhieu() != null && ct.getIdPhieu().equals(menuPN.getLastPN().getIdphieu())) {
                            ct.xuatCTPN();
                            menuSP.themSoLuongSanPham(ct.getMaSp(), ct.getSoLuong());
                        }
                    }
                    System.out.println("+--------------------+----------+--------------+--------------+");
                    /*
                     * System.out.println(
                     * "+--------------------+----------+--------------+--------------+");
                     * System.out.format(tongtien_format, menuPN.getLastPN().getTongTien());
                     * System.out.println(
                     * "+--------------------+----------+--------------+--------------+");
                     */
                    choice = 0;
                    break;
                case 2:
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
        int lc;

        do {
            System.out.println("+-----------------------------+");
            System.out.println("|         Menu phieu nhap     |");
            System.out.println("+-----------------------------+");
            System.out.println("|1. Xem danh sach phieu nhap. |");
            System.out.println("|2. Tim phieu nhap.           |");
            System.out.println("|3. Tao phieu nhap.           |");
            System.out.println("|0. Thoat chuong trinh.       |");
            System.out.println("+-----------------------------+");
            System.out.println("Moi ban nhap lua chon: ");
            lc = sc.nextInt();
            System.out.println("===================================================");

            switch (lc) {
                case 1:
                    menuPN.xuatDSPN();
                    break;
                case 2:
                    menuPN.timPN();
                    break;
                case 3:
                    menuPhieuNhap_2();
                    break;
                case 0:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
        } while (lc != 0);
    }

    // Menu bao hanh
    public void menuBaoHanh() {
        int choice;

        do {
            System.out.println("+-----------------------------+");
            System.out.println("|        Menu bao hanh        |");
            System.out.println("+-----------------------------+");
            System.out.println("|1. Xem danh sach bao hanh.   |");
            System.out.println("|2. Tim bao hanh.             |");
            System.out.println("|3. Tao bao hanh.             |");
            System.out.println("|0. Thoat chuong trinh.       |");
            System.out.println("+-----------------------------+");
            System.out.println("Moi ban nhap lua chon: ");
            choice = sc.nextInt();
            System.out.println("===================================================");

            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
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
    public void menuNhaCungCap() {
        int choice;

        do {
            System.out.println("+-----------------------------+");
            System.out.println("|       Menu nha cung cap     |");
            System.out.println("+-----------------------------+");
            System.out.println("|1. Xem danh sach nha cung cap|");
            System.out.println("|2. Tim nha cung cap          |");
            System.out.println("|3. Tao nha cung cap          |");
            System.out.println("|0. Thoat chuong trinh.       |");
            System.out.println("+-----------------------------+");
            System.out.println("Moi ban nhap lua chon: ");
            choice = sc.nextInt();
            System.out.println("===================================================");

            switch (choice) {
                case 1:
                    menuNCC.xuatdsncc();
                    break;
                case 2:
                    menuNCC.timkiemncc();
                    break;
                case 3:
                    menuNCC.themNcc();
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
            System.out.println("|5. Quan ly bao hanh.       |");
            System.out.println("|6. Quan ly nha cung cap.   |");
            System.out.println("|0. Thoat chuong trinh.     |");
            System.out.println("+---------------------------+");
            System.out.println("Moi ban nhap lua chon: ");
            choice = sc.nextInt();
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
                    menuBaoHanh();
                    break;
                case 6:
                    menuNhaCungCap();
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