import java.util.Scanner;
import java.util.ArrayList;

public class phieuNhap {
    private String idphieu;
    private date ngaynhap = new date();
    private String idncc;
    private static int cntIdPN = 1;
    private double tongTien;
    ArrayList<chiTietPhieuNhap> chiTietPN = new ArrayList<chiTietPhieuNhap>();

    Scanner sc = new Scanner(System.in);

    public phieuNhap() {
        String cnt;
        if (cntIdPN < 10)
            idphieu = "PN00" + cntIdPN;
        else if (cntIdPN < 100)
            idphieu = "PN0" + cntIdPN;
        else
            idphieu = "PN" + cntIdPN;
        cntIdPN++;
    }

    public String getIdphieu() {
        return idphieu;
    }

    public void setIdphieu(String idphieu) {
        this.idphieu = idphieu;
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
        System.out.format(mapn_format, idphieu);
        System.out.format(date_format, ngaynhap);
        System.out.format(nhacungcap_format, idncc);
        System.out.println("+----------------------------+");

    }
}
