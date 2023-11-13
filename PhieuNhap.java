import java.util.ArrayList;
import java.util.Scanner;

public class PhieuNhap {
    private String idPhieu;
    private date ngaynhappn;
    private nhacungcap ncc;
    private double tongTien;
    ArrayList<chiTietPhieuNhap> chiTietPN = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public PhieuNhap() {

    }

    public PhieuNhap(String idPhieu, date ngaynhappn, nhacungcap ncc, double tongTien,
            ArrayList<chiTietPhieuNhap> chiTietPN) {
        this.idPhieu = idPhieu;
        this.ngaynhappn = ngaynhappn;
        this.ncc = ncc;
        this.tongTien = tongTien;
        this.chiTietPN = chiTietPN;
    }

    public String getIdPhieu() {
        return idPhieu;
    }

    public void setIdPhieu(String idPhieu) {
        this.idPhieu = idPhieu;
    }

    public date getNgaynhappn() {
        return ngaynhappn;
    }

    public void setNgaynhappn(date ngaynhappn) {
        this.ngaynhappn = ngaynhappn;
    }

    public nhacungcap getNcc() {
        return ncc;
    }

    public void setNcc(nhacungcap ncc) {
        this.ncc = ncc;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public ArrayList<chiTietPhieuNhap> getChiTietPN() {
        return chiTietPN;
    }

    public void setChiTietPN(ArrayList<chiTietPhieuNhap> chiTietPN) {
        this.chiTietPN = chiTietPN;
    }

    public void nhapPN() {
        int choice;
        System.out.println("nhap ma phieu:");
        idPhieu = sc.nextLine();
        System.out.println("nhap ngay nhap hang");
        ngaynhappn = new date();
        ngaynhappn.nhap();
        System.out.println("nhap id nha cung cap");
        ncc = new nhacungcap();
        ncc.setIdNCC(sc.nextLine());
        do {

            System.out.println("1.nhap san pham:");
            System.out.println("0.thoat");
            System.out.println("nhap lua chon:");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("thoat");
                    break;
                case 1:
                    chiTietPhieuNhap a = new chiTietPhieuNhap();
                    a.setIdPhieu(idPhieu);
                    a.nhap();
                    chiTietPN.add(a);
                    break;

                default:
                    System.out.println("nhap lai");
                    break;
            }
        } while (choice != 0);
    }

    public void xuat() {
        System.out.println(
                "ma phieu nhap:" + idPhieu + ",ma nha cung cap:" + ncc.getIdNCC() + ",ngay nhap hang:" + ngaynhappn);
        for (chiTietPhieuNhap pn : chiTietPN) {
            System.out.println(pn);
        }
    }

    public static void main(String[] args) {
        PhieuNhap pn = new PhieuNhap();
        pn.nhapPN();
        pn.xuat();
    }

}
