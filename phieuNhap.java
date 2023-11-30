import java.util.Scanner;
import java.util.ArrayList;

public class phieuNhap {
    private String idphieu;
    private date ngaynhap = new date();
    private String idncc;
    private static int cnIdPN = 1;
    private double tongTien;
    // dsChiTietPhieuNhap dsct = new dsChiTietPhieuNhap();
    // chiTietPhieuNhap ctpn = new chiTietPhieuNhap();
    ArrayList<chiTietPhieuNhap> chiTietPN = new ArrayList<chiTietPhieuNhap>();

    dsNhaCungCap dsncc = new dsNhaCungCap();
    Scanner sc = new Scanner(System.in);

    public phieuNhap() {
        String cnt;
        if (cnIdPN < 10)
            idphieu = "PN00" + cnIdPN;
        else if (cnIdPN < 100)
            idphieu = "PN0" + cnIdPN;
        else
            idphieu = "PN" + cnIdPN;
        cnIdPN++;
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
        System.out.println("nhap id nha cung cap:");
        idncc = sc.nextLine();
        sc.nextLine();
        if (dsncc.kiemtraid(idncc) == 1) {
            ngaynhap.nhap();
        } else {
            nhaCungCap ncc = new nhaCungCap();
            ncc.getIdNCC();
            System.out.println("Nhap ten nha cung cap:");
            ncc.setTenNCC(sc.nextLine());
            System.out.println("Nhap so dien thoai nha cung cap:");
            ncc.setSdt(sc.nextLine());
            System.out.println("Nhap email nha cung cap:");
            ncc.setEmail(sc.nextLine());
            dsncc.themNcc(ncc);
            ngaynhap.nhap();
        }

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

        System.out.println("+--------------------+----------+--------------+--------------+");
        System.out.println("|      San pham      | So luong |   Gia tien   |   Thanh tien |");
        System.out.println("+--------------------+----------+--------------+--------------+");

        String ctpn_format = "| %-18s | %-8s | %-12.2f | %-13f|%n";

        for (chiTietPhieuNhap ct : chiTietPN) {
            System.out.format(ctpn_format, ct.getMaSp(), ct.getSoLuong(), ct.getGiaTien(), ct.getThanhtien());
            tongTien += ct.getThanhtien();
        }
        System.out.println("+--------------------+----------+--------------+--------------+");
        String tongtien_format = "| Tong tien: %-49.2f| %n";
        System.out.format(tongtien_format, tongTien);
        System.out.println("+--------------------+----------+--------------+--------------+");
        tongTien = 0;

    }
}
