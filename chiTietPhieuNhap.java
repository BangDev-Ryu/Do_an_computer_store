import java.util.Scanner;

public class chiTietPhieuNhap {
    private String idPhieu;
    private String maSp;
    private int soLuong;
    private double giaTien;
    Scanner sc = new Scanner(System.in);

    public chiTietPhieuNhap() {

    }

    public chiTietPhieuNhap(String idPhieu, String maSp, int soLuong, double giaTien) {
        this.idPhieu = idPhieu;
        this.maSp = maSp;
        this.soLuong = soLuong;
        this.giaTien = giaTien;
    }

    public void setIdPhieuNhap(String idPhieu) {
        this.idPhieu = idPhieu;
    }

    public String getIdPhieuNhap() {
        return idPhieu;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
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

    public double tongTien() {
        return giaTien * soLuong;
    }

    public void nhap() {
        System.out.println("Nhap ma san pham:");
        this.maSp = sc.nextLine();
        System.out.println("Nhap so luong:");
        this.soLuong = sc.nextInt();
        System.out.println("Nhap gia tien:");
        this.giaTien = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "maSp=" + maSp + ", soLuong=" + soLuong + ", giaTien=" + giaTien;
    }

}
