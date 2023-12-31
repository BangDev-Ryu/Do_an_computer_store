import java.util.Scanner;

public class chiTietPhieuNhap {
    private String idPhieu;
    private String idSp;
    private int soLuong;
    private double giaTien;
    private double thanhTien;
    Scanner sc = new Scanner(System.in);

    public chiTietPhieuNhap() {

    }

    public chiTietPhieuNhap(String idPhieu, String idSp, int soLuong, double giaTien, double thanhTien) {
        this.idPhieu = idPhieu;
        this.idSp = idSp;
        this.soLuong = soLuong;
        this.giaTien = giaTien;
        this.thanhTien = thanhTien;
    }

    public void setIdPhieu(String idPhieu) {
        this.idPhieu = idPhieu;
    }

    public String getIdPhieu() {
        return idPhieu;
    }

    public String getIdSp() {
        return idSp;
    }

    public void setIdSp(String idSp) {
        this.idSp = idSp;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public double getThanhtien() {
        return thanhTien;
    }

    public void nhapCTPN() {
        System.out.println("Nhap id san pham: ");
        idSp = checkLoi.checkIdSanPham();
        System.out.println("Nhap so luong:");
        this.soLuong = checkLoi.checkSoLuong();
    }

    public void xuatCTPN() {
        String ctpn_format = "| %-18s | %-8s | %-12.2f | %-12.2f | %n";
        System.out.format(ctpn_format, idSp, soLuong, giaTien, getThanhtien());
    }

    @Override
    public String toString() {
        return idPhieu + ", " + idSp + ", " + soLuong + ", " + giaTien + ", " + thanhTien;
    }
}
