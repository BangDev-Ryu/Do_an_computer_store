import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class dsNhaCungCap {
    private ArrayList<nhaCungCap> dsnhacungcap;
    Scanner sc = new Scanner(System.in);

    public dsNhaCungCap() {
        this.dsnhacungcap = new ArrayList<nhaCungCap>();
    }

    public dsNhaCungCap(ArrayList<nhaCungCap> dsnhacungcap) {
        this.dsnhacungcap = dsnhacungcap;
    }

    public ArrayList<nhaCungCap> getDsnhacungcap() {
        return dsnhacungcap;
    }

    public void setDsnhacungcap(ArrayList<nhaCungCap> dsnhacungcap) {
        this.dsnhacungcap = dsnhacungcap;
    }

    public void themNcc() {
        nhaCungCap ncc = new nhaCungCap();
        ncc.nhap();
        if (kiemtraid(ncc.getIdNCC()) == 1) {
            dsnhacungcap.add(ncc);
        } else {
            System.out.println("id da ton tai");
        }

    }

    public void xuatdsncc() {
        System.out.println("+-------------------------------------------------+");
        System.out.println("|   Ma NCC   |   Ten NCC   |   SDT   |   Email   |");
        System.out.println("+-------------------------------------------------+");

        String ncc_format = "| %-10s | %-11s | %-7s | %-9s |%n";
        for (nhaCungCap ncc : dsnhacungcap) {
            System.out.format(ncc_format, ncc.getIdNCC(), ncc.getTenNCC(), ncc.getSdt(), ncc.getEmail());
        }
        System.out.println("+-------------------------------------------------+");
    }

    public void timkiemncc() {
        System.out.println("Nhap id nha cung cap can tim:");
        String id = sc.nextLine();
        Iterator<nhaCungCap> tk = dsnhacungcap.iterator();
        while (tk.hasNext()) {
            nhaCungCap ncc = tk.next();
            if (ncc.getIdNCC().equals(id)) {
                System.out.println(ncc);
                return;
            }
        }
        System.out.println("khong tim thay nha cung cap nay");
    }

    public void xoancc() {
        System.out.println("nhap id nha cung cap can xoa:");
        String id = sc.nextLine();
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

    public void suancc() {
        System.out.println("nhap id nha cung cap can sua:");
        String id = sc.nextLine();
        Iterator<nhaCungCap> sua = dsnhacungcap.iterator();
        while (sua.hasNext()) {
            nhaCungCap ncc = sua.next();
            if (ncc.getIdNCC().equals(id)) {
                ncc.nhap();
                return;
            }
        }
        System.out.println("Khong tim thay nha cung cap can sua");
    }

    public int kiemtraid(String id) {
        Iterator<nhaCungCap> kt = dsnhacungcap.iterator();
        while (kt.hasNext()) {
            nhaCungCap ncc = kt.next();
            if (ncc.getIdNCC().indexOf(id) >= 0) {
                return 0;
            }
        }
        return 1;
    }

}
