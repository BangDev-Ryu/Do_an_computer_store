import java.util.Scanner;

public class chiTietHoaDon {
    Scanner sc = new Scanner(System.in);
    
    private String idHoaDon;
    private String idSp;
    private int soLuong;
    private double giaTien;

    public chiTietHoaDon() {

    }

    public chiTietHoaDon(String idHoaDon, String idSp, int soLuong, double giaTien) {
        this.idHoaDon = idHoaDon;
        this.idSp = idSp;
        this.soLuong = soLuong;
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
        soLuong = sc.nextInt();
    }

    public void xuatCTHD() {
        String cthd_format = "| %-18s | %-8s | %-12.2f | %-12.2f | %n";
        System.out.format(cthd_format, idSp, soLuong, giaTien, getThanhtien());
    }
}
