import java.util.Scanner;

public class chiTietPhieuNhap {
    private String idPhieu;
    private String maSp;
    private int soLuong;
    private double giaTien;
    Scanner sc = new Scanner(System.in);

    public chiTietPhieuNhap() {

    }

    public chiTietPhieuNhap(String idPhieu, String maSp, int soLuong, double giaTien, Scanner sc) {
        this.idPhieu = idPhieu;
        this.maSp = maSp;
        this.soLuong = soLuong;
        this.giaTien = giaTien;

    }

    public String getIdPhieu() {
        return idPhieu;
    }

    public void setIdPhieu(String idPhieu) {
        this.idPhieu = idPhieu;
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

    public void nhap() {
        System.out.println("nhap ma san pham:");
        maSp = sc.nextLine();
        System.out.println("nhap so luong:");
        soLuong = sc.nextInt();
    }

    @Override
    public String toString() {
        return "chiTietPhieuNhap [idPhieu=" + idPhieu + ", maSp=" + maSp + ", soLuong=" + soLuong + ", giaTien="
                + giaTien + "]";
    }

}
