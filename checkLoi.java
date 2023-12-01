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
        String input;
        while (true) {
            input = sc.nextLine();
            input = input.toUpperCase();
            if (input.matches("CC"+"[0-9]{3}")) {
                return input;
            }
            else {
                System.out.println("ID sai dinh dang CC___. Vi du: CC001");
            }
            System.out.println("Moi nhap lai: ");
        }
    }

    public static String checkIdHoaDon() {
        String input;
        while (true) {
            input = sc.nextLine();
            input = input.toUpperCase();
            if (input.matches("HD"+"[0-9]{3}")) {
                return input;
            }
            else {
                System.out.println("ID sai dinh dang HD___. Vi du: HD001");
            }
            System.out.println("Moi nhap lai: ");
        }
    }

    public static String checkIdPhieuNhap() {
        String input;
        while (true) {
            input = sc.nextLine();
            input = input.toUpperCase();
            if (input.matches("PN"+"[0-9]{3}")) {
                return input;
            }
            else {
                System.out.println("ID sai dinh dang PN___. Vi du: PN001");
            }
            System.out.println("Moi nhap lai: ");
        }
    }

    public static String checkTenKhachHang() {
        String input;
        while (true) {
            input = sc.nextLine();
            if (input.matches("[\\pL\\pMn*\\s*]+")) {
                input = input.trim();
                input = input.replaceAll("\\s+", " ");
                input = input.toLowerCase();
                String[] Chuoi = input.split(" ");
                input = "";
                for (int i = 0; i < Chuoi.length; i++) {
                    input += String.valueOf(Chuoi[i].charAt(0)).toUpperCase() + Chuoi[i].substring(1);
                    if (i < Chuoi.length - 1) {
                        input += " ";
                    }
                }
                return input;
            } else {
                System.out.print("Ten khach hang khong hop le.");
            }
            System.out.println("Moi nhap lai: ");
        }
    }

    public static String checkTenNhaCungCap() {
        String input;
        while (true) {
            input = sc.nextLine();
            if (input.matches("[\\pL\\pMn*\\s*]+")) {
                input = input.trim();
                input = input.replaceAll("\\s+", " ");
                input = input.toLowerCase();
                String[] Chuoi = input.split(" ");
                input = "";
                for (int i = 0; i < Chuoi.length; i++) {
                    input += String.valueOf(Chuoi[i].charAt(0)).toUpperCase() + Chuoi[i].substring(1);
                    if (i < Chuoi.length - 1) {
                        input += " ";
                    }
                }
                return input;
            } else {
                System.out.print("Ten nha cung cap khong hop le.");
            }
            System.out.println("Moi nhap lai: ");
        }
    }

    public static int checkLuaChon() {
        int input;
        while (true) {
            try {
                input = Integer.parseInt(sc.nextLine());
                return input;
            } catch (NumberFormatException exception) {
                return -1;
            }
        }
    }
}