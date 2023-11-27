import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class dsPhieuNhap {
    private ArrayList<phieuNhap> dsphieunhap;
    Scanner sc = new Scanner(System.in);

    public dsPhieuNhap() {
        this.dsphieunhap = new ArrayList<phieuNhap>();
    }

    public dsPhieuNhap(ArrayList<phieuNhap> dsphieunhap) {
        this.dsphieunhap = dsphieunhap;
    }

    public ArrayList<phieuNhap> getDsphieunhap() {
        return dsphieunhap;
    }

    public void setDsphieunhap(ArrayList<phieuNhap> dsphieunhap) {
        this.dsphieunhap = dsphieunhap;
    }

    public void themphieunhap() {
        phieuNhap pn = new phieuNhap();
        pn.nhap();
        if (kiemtraid(pn.getIdphieu()) == 1) {
            dsphieunhap.add(pn);
        } else {
            System.out.println("id phieu nhap da ton tai");
        }
    }

    public void xuatdsphieunhap() {
        System.out.println(
                "+--------------------------------------------------------------------------------------------------+");
        System.out.println(
                "|   Ma Phieu   |   Ngay Nhap   |   Ma NCC   |   Ma SP   |   So Luong   |   Gia Tien  |  Tong tien  |");
        System.out.println(
                "+--------------------------------------------------------------------------------------------------+");

        String phieu_format = "| %-12s | %-13s | %-10s | %-9s | %-12s | %-10s | %-12s|%n";
        for (phieuNhap pn : dsphieunhap) {
            System.out.format(
                    phieu_format,
                    pn.getIdphieu(),
                    pn.getNgaynhap().toString(),
                    pn.getIdncc(),
                    pn.getChitietphieu().getMaSp(),
                    pn.getChitietphieu().getSoLuong(),
                    pn.getChitietphieu().getGiaTien(),
                    pn.getTongTien());
        }
        System.out.println(
                "+--------------------------------------------------------------------------------------------------+");
    }

    public void timkiemphieunhap() {
        System.out.println("Nhap id phieu nhap can tim:");
        String id = sc.nextLine();
        Iterator<phieuNhap> tk = dsphieunhap.iterator();
        while (tk.hasNext()) {
            phieuNhap pn = tk.next();
            if (pn.getIdphieu().equals(id)) {
                System.out.println(pn);
                return;
            }
        }
        System.out.println("Khong tim thay phieu nhap");

    }

    public void xoaphieunhap() {
        System.out.println("Nhap id phieu nhap can xoa:");
        String id = sc.nextLine();
        Iterator<phieuNhap> xoa = dsphieunhap.iterator();
        while (xoa.hasNext()) {
            phieuNhap pn = xoa.next();
            if (pn.getIdphieu().equals(id)) {
                dsphieunhap.remove(pn);
                return;
            }
        }
        System.out.println("Khong tim thay phieu nhap can xoa");
    }

    public int kiemtraid(String id) {
        Iterator<phieuNhap> kt = dsphieunhap.iterator();
        while (kt.hasNext()) {
            phieuNhap pn = kt.next();
            if (pn.getIdphieu().indexOf(id) >= 0) {
                return 0;
            }
        }
        return 1;
    }
}
