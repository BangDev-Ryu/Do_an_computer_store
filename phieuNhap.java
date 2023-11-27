import java.util.Scanner;
import java.util.ArrayList;

public class phieuNhap {
    private String idphieu;
    private date ngaynhap;
    private String idncc;
    private chiTietPhieuNhap chitietphieu = new chiTietPhieuNhap();
    private double tongTien;
    Scanner sc = new Scanner(System.in);

    public phieuNhap() {
    }

    public phieuNhap(String idphieu, date ngaynhap, String idncc, chiTietPhieuNhap chitietphieu, double tongTien) {
        this.idphieu = idphieu;
        this.ngaynhap = ngaynhap;
        this.idncc = idncc;
        this.chitietphieu = chitietphieu;
        this.tongTien = tongTien;
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

    public chiTietPhieuNhap getChitietphieu() {
        return chitietphieu;
    }

    public void setChitietphieu(chiTietPhieuNhap chitietphieu) {
        this.chitietphieu = chitietphieu;
    }

    public double getTongTien() {
        return chitietphieu.getSoLuong() * chitietphieu.getGiaTien();
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public void nhap() {
        System.out.println("Nhap id phieu nhap:");
        setIdphieu(sc.nextLine());
        System.out.println("Nhap ngay nhap hang:");
        date nn = new date();
        nn.nhap();
        setNgaynhap(nn);
        System.out.println("Nhap id nha cung cap:");
        setIdncc(sc.nextLine());
        this.chitietphieu.nhap();
    }

    @Override
    public String toString() {
        return "phieuNhap [idphieu=" + idphieu + ", ngaynhap=" + ngaynhap + ", idncc=" + idncc + ", chitietphieu="
                + chitietphieu + ", tongTien=" + tongTien + "]";
    }

}