import java.util.Scanner;

public abstract class sanPham {
    Scanner sc = new Scanner(System.in);

    private String idSp;
    private String tenSp;
    private int soLuong;
    private double giaTien;

    public sanPham() {

    }

    public sanPham(String id, int sl) {
        idSp = id;
        soLuong = sl;
    }

    public sanPham(String ten, int sl, double tien) {
        tenSp = ten;
        soLuong = sl;
        giaTien = tien;
    }

    public sanPham(String id, String ten, int sl, double tien) {
        idSp = id;
        tenSp = ten;
        soLuong = sl;
        giaTien = tien;
    }

    public abstract void xuatSp();

    public void setIdSp(String id) {
        idSp = id;
    }

    public String getIdSp() {
        return idSp;
    }

    public void setTenSp(String ten) {
        tenSp = ten;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setSoLuong(int sl) {
        soLuong = sl;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setGiaTien(double tien) {
        giaTien = tien;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void nhapSp() {
        System.out.println("Nhap ten san pham: ");
        tenSp = sc.nextLine();
        System.out.println("Nhap ten gia tien: ");
        giaTien = sc.nextDouble();
    }
}