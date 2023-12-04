import java.util.Scanner;

public class checkLoi {
    static Scanner sc = new Scanner(System.in);

    public static String checkIdSanPham() {
        String input;
        while (true) {
            input = sc.nextLine();
            input = input.toUpperCase();
            if (input.matches("DE" + "[0-9]{3}") || input.matches("LA" + "[0-9]{3}")) {
                return input;
            } else {
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
            if (input.matches("KH" + "[0-9]{3}")) {
                return input;
            } else {
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
            if (input.matches("CC" + "[0-9]{3}")) {
                return input;
            } else {
                System.out.println("ID sai dinh dang CC___. Vi du: CC001");
            }
            System.out.println("Moi nhap lai: ");
        }
    }

    public static String checkSDT() {
        String input;
        while (true) {
            input = sc.nextLine();
            input = input.toUpperCase();
            if (input.matches("0{1}[1-9]{1}[0-9]{8}$")) {
                return input;
            } else {
                System.out.println("SDT khong hop le!");
            }
            System.out.println("Moi nhap lai: ");
        }
    }

    public static String checkDiaChi() {
        String input;
        while (true) {
            input = sc.nextLine();
            if (input.matches("^[a-zA-Z0-9\\s]+$")) {
                return input;
            }
            else {
                System.out.println("Khong duoc co ki tu dac biet!");
            }
            System.out.println("Moi nhap lai: ");
        }
    }

    public static String checkEmail() {
        String input;
        while (true) {
            input = sc.nextLine();
            input = input.toUpperCase();
            if (input.matches("^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,6}$")) {
                return input;
            } else {
                System.out.println("Email khong hop le!");
            }
            System.out.println("Moi nhap lai: ");
        }
    }

    public static String checkIdHoaDon() {
        String input;
        while (true) {
            input = sc.nextLine();
            input = input.toUpperCase();
            if (input.matches("HD" + "[0-9]{3}")) {
                return input;
            } else {
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
            if (input.matches("PN" + "[0-9]{3}")) {
                return input;
            } else {
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
                System.out.println("Ten khach hang khong hop le.");
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
                System.out.println("Ten nha cung cap khong hop le.");
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

    public static String checkRong() {
        String input;
        while (true) {
            input = sc.nextLine();
            input = input.trim();
            if (input != null) {
                return input;
            } else {
                System.out.print("Ten khong duoc de trong!");
            }
        }
    }

    public static int checkSoNguyen() {
        int input;
        while (true) {
            try {
                input = Integer.parseInt(sc.nextLine());
                return input;
            } catch (NumberFormatException exception) {
                System.out.println("Kieu du lieu khong hop le!");
            }
            System.out.println("Moi nhap lai: ");
        }
    }

    public static double checkSoThapPhan() {
        double input;
        while (true) {
            try {
                input = Double.parseDouble(sc.nextLine());
                return input;
            } catch (NumberFormatException exception) {
                System.out.println("Kieu du lieu khong hop le!");
            }
            System.out.println("Moi nhap lai: ");
        }
    }

    public static int checkSoLuong() {
        int input;
        while (true) {
            input = checkSoNguyen();
            if (input <= 0) {
                System.out.println("So luong khong hop le!");
            }
            else if (input >= 1000) {
                System.out.println("So luong qua lon!");
            }
            else {
                return input;
            }
            System.out.println("Moi nhap lai: ");
        }
    }

    public static double checkGiaTien() {
        double input;
        while (true) {
            input = checkSoThapPhan();
            if (input <= 0) {
                System.out.println("Gia tien khong hop le!");
            }
            else if (input >= 1000000) {
                System.out.println("Gia tien qua lon!");
            }
            else {
                return input;
            }
            System.out.println("Moi nhap lai: ");
        }
    }
}