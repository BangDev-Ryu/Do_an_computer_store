import java.util.Scanner;

public class menu {
    Scanner sc = new Scanner(System.in);
    dsHoaDon menuHD = new dsHoaDon();
    dsChiTietHoaDon menuCTHD = new dsChiTietHoaDon();

    public void menu_hoa_don() {
        int choice;

        do {
            System.out.println("1. Tao hoa don.");
            System.out.println("2. Tim hoa don.");
            System.out.println("3. Xem danh sach cac hoa don.");
            System.out.println("0. Thoat chuong trinh.");
            System.out.println("--------------------------------------------------");
            System.out.print("Moi ban nhap lua chon: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    menuHD.taoHD();
                    System.out.println("Day la hoa don vua tao: ");
                    menuHD.getLastHD().xuatHD();
                    int choiceSub1;

                    do {
                        System.out.println("1. Luu va in hoa don.");
                        System.out.println("2. Xoa hoa don.");
                        System.out.println("--------------------------------------------------");
                        System.out.print("Moi ban nhap lua chon: ");
                        choiceSub1 = sc.nextInt();

                        switch (choiceSub1) {
                            case 1:
                                System.out.println("Dang in hoa don...");
                                menuHD.getLastHD().xuatHD();
                                choiceSub1 = 0;
                                break;
                            case 2:
                                menuHD.removeLastHD();
                                System.out.println("Da xoa hoa don vua tao.");
                                choiceSub1 = 0;
                                break;
                            default:
                                System.out.println("Lua chon khong hop le!");
                                break;
                        } 
                    } while (choiceSub1 != 0);

                    break;
                case 2:
                    menuHD.timHD();
                    break;
                case 3:
                    menuHD.xuatDSHD();
                    break;
                case 0:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
            System.out.println("--------------------------------------------------");
        } while (choice != 0);
        
    }

    public static void main(String[] args) {
        menu tmp = new menu();
        tmp.menu_hoa_don();
    }
}