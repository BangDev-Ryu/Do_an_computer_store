import java.util.Scanner;

public class chiTietHoaDon {
    Scanner sc = new Scanner(System.in);
    
    private String idHoaDon;
    private String maSp;
    private int soLuong;
    private double giaTien;

    public chiTietHoaDon() {

    }

    public chiTietHoaDon(String idHoaDon, String maSp, int soLuong, int giaTien) {
        this.idHoaDon = idHoaDon;
        this.maSp = maSp;
        this.soLuong = soLuong;
        this.giaTien = giaTien;
    }
    
    public String getIdHoaDon() {
        return idHoaDon;
    }
    
    public void setIdHoaDon(String idHoaDon) {
        this.idHoaDon = idHoaDon;
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
    
    public void nhapCT(){
        System.out.println("Nhap ma san pham: ");
        maSp = sc.nextLine();
        System.out.println("Nhap so luong san pham");
        soLuong = sc.nextInt();
    }

    public String toString() {
        return "chiTietHoaDon [idHoaDon=" + idHoaDon + ", maSp=" + maSp + ", soLuong=" + soLuong + ", giaTien="
                + giaTien + "]";
    }
}
