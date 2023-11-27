import java.util.Scanner;
import java.util.ArrayList;

public class phieuNhap {
    private String idphieu;
    private date ngaynhap = new date();
    private String idncc;
    private double tongTien = 0;
    private static int cnIdPN = 0;
    dsChiTietPhieuNhap dsct = new dsChiTietPhieuNhap();
    chiTietPhieuNhap ctpn = new chiTietPhieuNhap();
    ArrayList<chiTietPhieuNhap> chiTietPN = new ArrayList<chiTietPhieuNhap>();

    Scanner sc = new Scanner(System.in);

    public phieuNhap() {
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
        return ctpn.getGiaTien() * ctpn.getSoLuong();
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public void nhapPN() {

        int choice;
        System.out.println("nhap id nha cung cap:");
        idncc = sc.nextLine();
        System.out.println("Nhap ngay mua:");
        ngaynhap.nhap();
        System.out.println();

        do {
            System.out.println("--------------------------------------------------");
            System.out.println("1. Nhap san pham.");
            System.out.println("0. Xong.");
            System.out.println("Nhap lua chon: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    chiTietPhieuNhap tmp = new chiTietPhieuNhap();
                    tmp.setIdPhieuNhap(idphieu);
                    tmp.nhap();

                    chiTietPN.add(tmp);
                    dsct.arr_ctpn.add(tmp);
                    break;
                case 0:
                    System.out.println("Thoat");
                    break;
                default:
                    System.out.println("Chon khong hop le!");
                    break;
            }
        } while (choice != 0);
    }

    public void xuatPN() {
        String mapn_format = "| Ma phieu nhap: %-8s | %n";
        String date_format = "| Ngay nhap   : %-10s | %n";
        String nhacungcap_format = "| ID nha cung cap: %-10s |%n";

        System.out.println("+----------------------+");
        System.out.format(mapn_format, idphieu);
        System.out.format(date_format, ngaynhap);
        System.out.format(nhacungcap_format, idncc);

        System.out.println("+----------------------+");

        System.out.println("+--------------------+----------+--------------+--------------+");
        System.out.println("|      San pham      | So luong |   Gia tien   |   Tong tien  |");
        System.out.println("+--------------------+----------+--------------+--------------+");

        String ctpn_format = "| %-18s | %-8s | %-12.2f | %-12.2f|%n";

        for (chiTietPhieuNhap ct : chiTietPN) {
            System.out.format(ctpn_format, ct.getMaSp(), ct.getSoLuong(), ct.getGiaTien(), ct.getTongTien());
            tongTien += ct.getTongTien();

        }
        System.out.println("+--------------------+----------+--------------+--------------+");
        String tongtien_format = "| Tong tien: %-34.2f| %n";
        System.out.format(tongtien_format, tongTien);
        System.out.println("+--------------------+----------+--------------+--------------+");
        tongTien = 0;

    }

}