import java.util.Scanner;
import java.util.ArrayList;

public class phieuNhap {
    Scanner sc = new Scanner(System.in);

    private String idPhieuNhap;
    private String idNCC;
    private date ngayNhap;
    private double tongTien;
    private ArrayList<chiTietPhieuNhap> chiTietPN = new ArrayList<chiTietPhieuNhap>();
    private static int cntIdPN = 0;

    public phieuNhap() {
        idPhieuNhap = "PN" + cntIdPN;
        cntIdPN++;
    }
    public void setIdPhieuNhap(String id) {
        idPhieuNhap = id;
    }

    public String getIdPhieuNhap() {
        return idPhieuNhap;
    }

    public void setIdNCC(String id) {
        idNCC = id;
    }

    public String getIdNCC() {
        return idNCC;
    }

    public void setNgayNhap(date ngay) {
        ngayNhap = ngay; 
    }

    public date getNgayNhap() {
        return ngayNhap;
    }

    public void setTongTien(double tien) {
        tongTien = tien;
    }

    public double getTongTien() {
        return tongTien;
    }

}