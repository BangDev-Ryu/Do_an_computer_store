import java.util.Scanner;

public class menu {
    Scanner sc = new Scanner(System.in);
    dsHoaDon menuHD = new dsHoaDon();
    //dsChiTietHoaDon menuCTHD = new dsChiTietHoaDon();

    public void menuSanPham() {
        int choice;

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

    public void menuPhieuNhap() {
        int choice;

        do {
            System.out.println("+-----------------------------+");
            System.out.println("|       Menu phieu nhap       |");
            System.out.println("+-----------------------------+");
            System.out.println("|1. Xem danh sach phieu nhap. |");
            System.out.println("|2. Tim phieu nhap.           |");
            System.out.println("|3. Tao phieu nhap.           |");
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