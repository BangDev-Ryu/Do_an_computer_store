import java.util.Scanner;

public class menu {
    Scanner sc = new Scanner(System.in);
    dsHoaDon menuHD = new dsHoaDon();
    // dsChiTietHoaDon menuCTHD = new dsChiTietHoaDon();
    dsPhieuNhap menuPN = new dsPhieuNhap();
    dsNhaCungCap dsncc = new dsNhaCungCap();

    public String menuChonSP() {
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
        String maLoai = menuChonSP();
        System.out.println("Nhap id san pham ban muon tim (3 so): ");
        String tmp = sc.nextLine();
        String id = sc.nextLine();
        id = maLoai + id;

        menuSP.timSanPham(id);

        int choice;

        do {
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
                    
                    break;
                case 2:

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
        menuSP.taoDsCoSan();

        do {
            System.out.println("+---------------------------+");
            System.out.println("|       Menu san pham       |");
            System.out.println("+---------------------------+");
            System.out.println("|1. Xem danh sach san pham. |");
            System.out.println("|2. Tim san pham.           |");
            System.out.println("|0. Thoat chuong trinh.     |");
            System.out.println("+---------------------------+");
            System.out.println("Moi ban nhap lua chon: ");
            choice = sc.nextInt();
            System.out.println("===================================================");

            switch (choice) {
                case 1:
                    break;
                case 2:
                    menuSanPham_2();
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

    // Menu hoa don
    public void menuHoaDon_2() {
        int choice;

        menuHD.taoHD();
        System.out.println("Day la hoa don vua tao: ");
        menuHD.getLastHD().xuatHD();

        do {
            System.out.println("1. Luu va in hoa don.");
            System.out.println("2. Huy hoa don.");
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
                    menuHD.timHD();
                    break;
                case 3:
                    menuHoaDon_2();
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

    public void menuPhieuNhap_2() {
        int choice;

        menuPN.taoPN();
        System.out.println("Day la phieu nhap vua tao: ");
        menuPN.getLastPN().xuatPN();

        do {
            System.out.println("1. Luu va in phieu nhap.");
            System.out.println("2. Huy phieu nhap.");
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

    // Menu phieu nhap
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

    public void menuNhaCungCap() {
        int choice;

        do {
            System.out.println("+-----------------------------+");
            System.out.println("|       Menu nha cung cap     |");
            System.out.println("+-----------------------------+");
            System.out.println("|1. Xem danh sach nha cung cap|");
            System.out.println("|2. Tim nha cung cap          |");
            System.out.println("|3. Tao nha cung cap          |");
            System.out.println("|4. Sua nha cung cap          |");
            System.out.println("|0. Thoat chuong trinh.       |");
            System.out.println("+-----------------------------+");
            System.out.println("Moi ban nhap lua chon: ");
            choice = sc.nextInt();
            System.out.println("===================================================");

            switch (choice) {
                case 1:
                    dsncc.xuatdsncc();
                    break;
                case 2:
                    dsncc.timkiemncc();
                    break;
                case 3:
                    dsncc.themNcc();
                    break;
                case 4:
                    dsncc.suancc();
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

    // Menu bao hiem
    public void menuBaoHiem() {
        int choice;

        do {
            System.out.println("+-----------------------------+");
            System.out.println("|        Menu bao hiem        |");
            System.out.println("+-----------------------------+");
            System.out.println("|1. Xem danh sach bao hiem.   |");
            System.out.println("|2. Tim bao hiem.             |");
            System.out.println("|3. Tao bao hiem.             |");
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
            System.out.println("|6. Quan ly bao hiem.       |");
            System.out.println("|7. Quan li nha cung cap    |");
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
                    menuBaoHiem();
                    break;
                case 7:
                    menuNhaCungCap();
                case 0:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }

        } while (choice != 0);
    }

    public static void main(String[] args) {
        menu tmp = new menu();
        tmp.menuMain();
    }
}