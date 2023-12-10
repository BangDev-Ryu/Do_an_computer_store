import java.util.Scanner;

public class chiTietHoaDon {
    Scanner sc = new Scanner(System.in);
    
    private String idHoaDon;
    private String idSp;
    private int soLuong;
    private String idBH;
    private double giaTien;

    public chiTietHoaDon() {

    }

    public chiTietHoaDon(String idHoaDon, String idSp, int soLuong, String idBH, double giaTien) {
        this.idHoaDon = idHoaDon;
        this.idSp = idSp;
        this.soLuong = soLuong;
        this.idBH = idBH;
        this.giaTien = giaTien;
    }
    
    public String getIdHoaDon() {
        return idHoaDon;
    }
    
    public void setIdHoaDon(String idHoaDon) {
        this.idHoaDon = idHoaDon;
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

    public String getIdBH() {
        return idBH;
    }

    public void setIdBH(String idBH) {
        this.idBH = idBH;
    }
    
    public double getGiaTien() {
        return giaTien;
    }
    
    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public double getThanhtien() {
        return giaTien*soLuong;
    }
    
    public void nhapCTHD(){
        System.out.println("Nhap id san pham: ");
        idSp = checkLoi.checkIdSanPham();
        System.out.println("Nhap so luong san pham");
        soLuong = checkLoi.checkSoLuong();
    }

    public void xuatCTHD() {
        String cthd_format = "| %-18s | %-8s | %-12.2f | %-12.2f | %n";
        System.out.format(cthd_format, idSp, soLuong, giaTien, getThanhtien());
    }

    @Override
    public String toString() {
        return idHoaDon + ", " + idSp + ", " + soLuong + ", " + idBH + ", " + giaTien;
    }
}
