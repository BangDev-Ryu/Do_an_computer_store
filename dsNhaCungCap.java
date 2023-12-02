import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class dsNhaCungCap {
    private ArrayList<nhaCungCap> dsnhacungcap = new ArrayList<nhaCungCap>();
    Scanner sc = new Scanner(System.in);

    public dsNhaCungCap() {

    }

    public void themNcc() {
        nhaCungCap ncc = new nhaCungCap();
        ncc.nhap();

        if (!tontaiid(ncc.getIdNCC())) {
            dsnhacungcap.add(ncc);
        } else {
            System.out.println("id da ton tai");
        }
    }

    public void themNcc(nhaCungCap ncc) {
        dsnhacungcap.add(ncc);
    }

    public void xuatdsncc() {
        System.out.println("+---------------------------------------------------------------------------------------+");
        System.out.println("|   Ma NCC   |          Ten NCC          |     SDT     |             Email              |");
        System.out.println("+---------------------------------------------------------------------------------------+");

        String ncc_format = "| %-10s | %-25s | %-11s | %-30s |%n";
        for (nhaCungCap ncc : dsnhacungcap) {
            System.out.format(ncc_format, ncc.getIdNCC(), ncc.getTenNCC(), ncc.getSdt(), ncc.getEmail());
        }
        System.out.println("+---------------------------------------------------------------------------------------+");
    }

    public void xuat1ncc(nhaCungCap ncc) {
        System.out.println(
                "+---------------------------------------------------------------------------------------+");
        System.out.println(
                "|   Ma NCC   |          Ten NCC          |     SDT     |             Email              |");
        System.out.println(
                "+---------------------------------------------------------------------------------------+");

        String ncc_format = "| %-10s | %-25s | %-11s | %-30s |%n";

        System.out.format(ncc_format, ncc.getIdNCC(), ncc.getTenNCC(), ncc.getSdt(), ncc.getEmail());

        System.out.println(
                "+---------------------------------------------------------------------------------------+");
    }

    public void timkiemncc() {
        System.out.println("Nhap id nha cung cap can tim:");
        String id = sc.nextLine();
        Iterator<nhaCungCap> tk = dsnhacungcap.iterator();
        while (tk.hasNext()) {
            nhaCungCap ncc = tk.next();
            if (ncc.getIdNCC().equals(id)) {
                xuat1ncc(ncc);
                int choice;
                do {
                    System.out.println("+---------------------------+");
                    System.out.println("|1. Sua nha cung cap.       |");
                    System.out.println("|2. Xoa nha cung cap        |");
                    System.out.println("|0. Thoat chuong trinh.     |");
                    System.out.println("+---------------------------+");
                    System.out.println("Moi ban nhap lua chon: ");
                    choice = sc.nextInt();
                    sc.nextLine();
                    System.out.println("===================================================");

                    switch (choice) {
                        case 1:
                            ncc.setIdNCC(id);
                            System.out.println("Nhap ten nha cung cap:");
                            ncc.setTenNCC(sc.nextLine());
                            System.out.println("Nhap so dien thoai nha cung cap:");
                            ncc.setSdt(sc.nextLine());
                            System.out.println("Nhap email nha cung cap:");
                            ncc.setEmail(sc.nextLine());
                            System.out.println("nha cung cap sau khi sua");
                            xuat1ncc(ncc);
                            break;
                        case 2:
                            xoancc(id);
                        case 0:
                            System.out.println("Exit...");
                            break;
                        default:
                            System.out.println("Lua chon khong hop le!");
                            break;
                    }

                } while (choice != 0);

                return;
            }
        }
        System.out.println("khong tim thay nha cung cap nay");
    }

    public void xoancc(String id) {
        Iterator<nhaCungCap> xoa = dsnhacungcap.iterator();
        while (xoa.hasNext()) {
            nhaCungCap ncc = xoa.next();
            if (ncc.getIdNCC().equals(id)) {
                dsnhacungcap.remove(ncc);
                return;
            }
        }
        System.out.println("khong tim thay nha cung cap can xoa");
    }

    public boolean tontaiid(String id) {
        for (nhaCungCap ncc : dsnhacungcap) {
            if (ncc.getIdNCC().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
