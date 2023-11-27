package Check;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class check {

    Scanner scanner = new Scanner(System.in);

    public String kiemtrachuoi() {
        String dauvao;
        while (true) {
            dauvao = scanner.nextLine();
            dauvao = dauvao.trim();
            if (dauvao != null) {
                return dauvao;
            } else {
                System.out.print("Không được bỏ trống ! Mời nhập lại: ");
            }
        }
    }

    public int kiemtrasonguyen() {
        int dauvao;
        while (true) {
            try {
                dauvao = Integer.parseInt(scanner.nextLine());
                return dauvao;
            } catch (NumberFormatException exception) {
                System.out.print("Sai kiểu dữ liệu ! Nhập lại: ");
            }
        }
    }

    public String kiemtraidSP() {
        String dauvao;
        while (true) {
            dauvao = scanner.nextLine();
            if (dauvao.matches("^d{3}$")) {
                return dauvao;
            } else {
                System.out.println("Sai định dạng mã sản phẩm. Ví dụ: 001");
            }
            System.out.println("Nhập lại mã sản phẩm:");
        }
    }

    public int kiemtragiatien() {
        int dauvao;
        while (true) {
            try {
                dauvao = Integer.parseInt(scanner.nextLine());
                if (dauvao >= 1000 && dauvao <= 1000000000) {
                    return dauvao;
                } else {
                    System.out.print("Giá phải lớn hơn 1000 ! Mời nhập lại: ");
                }
            } catch (NumberFormatException exception) {
                System.out.print("Giá không đúng định dạng ! Mời nhập lại: ");
            }

        }
    }

    public int kiemtrasoluong() {
        int dauvao;
        while (true) {
            try {
                dauvao = Integer.parseInt(scanner.nextLine());
                if (dauvao > 0 && dauvao <= 1000) {
                    return dauvao;
                } else {
                    System.out.print("Số lượng phải lớn hơn 0 ! Mời nhập lại: ");
                }
            } catch (NumberFormatException exception) {
                System.out.print("Số lượng không đúng định dạng ! Mời nhập lại: ");
            }

        }
    }

    public String kiemtraidKH() {
        String dauvao;
        while (true) {
            dauvao = scanner.nextLine();
            if (dauvao.matches("^d{3}$")) {
                return dauvao;
            } else {
                System.out.println("Sai định dạng mã khách hàng. Ví dụ: 001");
            }
            System.out.println("Nhập lại mã khách hàng:");
        }
    }

    public String kiemtraSDT() {
        String dauvao;
        while (true) {
            dauvao = scanner.nextLine();
            if (dauvao.matches("^d{10}$")) {
                return dauvao;
            } else {
                System.out.println("Sai định dạng số điện thoại. Số điện thoại có 10 số");
            }
            System.out.println("Nhập lại mã khách hàng:");
        }
    }

    public String kiemtraDATE() {
        String dauvao;
        while (true) {
            dauvao = scanner.nextLine();
            if (dauvao.matches("|^(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))$"
                    + "|^(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))$"
                    + "|^(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30))$")) {
                return dauvao;
            } else {
                System.out.println("Sai định dạng ngày tháng");
            }
            System.out.println("Nhập lại:");
        }
    }

}
