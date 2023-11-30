import java.util.Scanner;

public class checkLoi {
    static Scanner sc = new Scanner(System.in);

    public static String checkIdSanPham() {
        String input;
        while (true) {
            input = sc.nextLine();
            input = input.toUpperCase();
            if (input.matches("DE"+"[0-9]{3}") || input.matches("LA"+"[0-9]{3}")) {
                return input;
            }
            else {
                System.out.println("ID sai dinh dang DE/LA___. Vi du: LA001");
            }
            System.out.println("Moi nhap lai: ");
        }
    }

    public static String checkIdKhachHang() {
        String input;
        while (true) {
            input = sc.nextLine();
            input = input.toUpperCase();
            if (input.matches("KH"+"[0-9]{3}")) {
                return input;
            }
            else {
                System.out.println("ID sai dinh dang KH___. Vi du: KH001");
            }
            System.out.println("Moi nhap lai: ");
        }
    }

    public static String checkIdNhaCungCap() {

    }

    public static String checkIdHoaDon() {

    }

    public static String checkIdPhieuNhap() {

    }

    public static String checkTenKhachHang() {

    }

    public static String checkTenNhaCungCap() {

    }

    public static int checkSoNguyen() {

    }
}