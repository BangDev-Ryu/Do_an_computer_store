import java.util.Scanner;
import java.util.ArrayList;

public class phieuNhap {
    private String idPhieu;
    private String idncc;
    private date ngaynhap = new date();
    private double tongTien;
    private static int cntIdPN = 1;

    Scanner sc = new Scanner(System.in);

    public phieuNhap() {
        String cnt;
        if (cntIdPN < 10)
            idPhieu = "PN00" + cntIdPN;
        else if (cntIdPN < 100)
            idPhieu = "PN0" + cntIdPN;
        else
            idPhieu = "PN" + cntIdPN;
        cntIdPN++;
    }

    public phieuNhap(String idPhieu, String idncc, date ngaynhap, double tongTien) {
        this.idPhieu = idPhieu;
        this.idncc = idncc;
        this.ngaynhap = ngaynhap;
        this.tongTien = tongTien;
    }

    public String getIdPhieu() {
        return idPhieu;
    }

    public void setIdphieu(String idPhieu) {
        this.idPhieu = idPhieu;
    }

    public date getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(date ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public String getIdncc() {
        return idncc;
    }

    public void setIdncc(String idncc) {
        this.idncc = idncc;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public static void giamIdPN() {
        cntIdPN--;
    }

    public void nhapPN() {
        System.out.println("Nhap ngay nhap phieu nhap: ");
        ngaynhap.nhap();
        System.out.println("Nhap id nha cung cap:");
        idncc = checkLoi.checkIdNhaCungCap();
    }

    public void xuatPN() {
        String mapn_format = "| Ma phieu nhap: %-11s | %n";
        String date_format = "| Ngay nhap   : %-12s | %n";
        String nhacungcap_format = "| ID nha cung cap: %-9s |%n";

        System.out.println("+----------------------------+");
        System.out.format(mapn_format, idPhieu);
        System.out.format(date_format, ngaynhap);
        System.out.format(nhacungcap_format, idncc);
        System.out.println("+----------------------------+");

    }

    @Override
    public String toString() {
        return idPhieu + ", " + idncc + ", " + ngaynhap + ", " + tongTien;
    }
}
