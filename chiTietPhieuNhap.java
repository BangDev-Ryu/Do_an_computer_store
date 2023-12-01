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

    public void setIdPhieu(String idPhieu) {
        this.idPhieu = idPhieu;
    }

    public String getIdPhieu() {
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

    public double getThanhtien() {
        return giaTien * soLuong;
    }

    public void nhapCTPN() {
        do {
            System.out.println("Nhap id san pham (LAXXX/DEXXX):");
            maSp = sc.nextLine();
            if (!maSp.matches("^[A-Za-z]{2}\\d{3}$")) {
                System.out.println("Nhap sai id san pham");
            }
        } while (!maSp.matches("^[A-Za-z]{2}\\d{3}$"));

        System.out.println("Nhap so luong:");
        this.soLuong = sc.nextInt();
    }

    public void xuatCTPN() {
        String ctpn_format = "| %-18s | %-8s | %-12.2f | %-12.2f | %n";
        System.out.format(ctpn_format, maSp, soLuong, giaTien, getThanhtien());
    }

    @Override
    public String toString() {
        return "maSp=" + maSp + ", soLuong=" + soLuong + ", giaTien=" + giaTien;
    }
}
