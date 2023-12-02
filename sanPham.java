import java.util.Scanner;

public class sanPham implements ISanPham {
    Scanner sc = new Scanner(System.in);

    private String idSp;
    private String tenSp;
    private int soLuong;
    private double giaTien;

    private static int slTonKho = 0;

    public sanPham() {
        slTonKho++;
    }

    public sanPham(String id, int sl) {
        idSp = id;
        soLuong = sl;
        slTonKho++;
    }

    public sanPham(String ten, int sl, double tien) {
        tenSp = ten;
        soLuong = sl;
        giaTien = tien;
        slTonKho++;
    }

    public sanPham(String id, String ten, int sl, double tien) {
        idSp = id;
        tenSp = ten;
        soLuong = sl;
        giaTien = tien;
        slTonKho++;
    }

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

    public void xuatSp() {
        String sanPham_format = "| %-8s | %-15s | %-8s | %-12.2f | %n";
        System.out.format(sanPham_format, idSp, tenSp, soLuong, giaTien);
    }

    public int getSlTonKho() {
        return slTonKho;
    }

    public void nhapSpMoi() {
        System.out.println("Nhap ten san pham: ");
        tenSp = sc.nextLine();
        System.out.println("Nhap gia tien: ");
        giaTien = sc.nextDouble();
    }
}