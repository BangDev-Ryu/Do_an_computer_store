import java.util.Scanner;
import java.util.ArrayList;

public class hoaDon {
    Scanner sc = new Scanner(System.in);
    
    private String idHoaDon;
    private String idKhach;
    private date ngayMua = new date();
    private double tongTien;
    private static int cntIdHD = 1;

    public hoaDon() {
        if (cntIdHD < 10) idHoaDon = "HD00" + cntIdHD;
        else if (cntIdHD < 100) idHoaDon = "HD0" + cntIdHD;
        else idHoaDon = "HD" + cntIdHD;
        cntIdHD++;
    }

    public hoaDon(String idHoaDon, String idKhach, date ngayMua, Double tongTien) {
        this.idHoaDon = idHoaDon;
        this.idKhach = idKhach;
        this.ngayMua = ngayMua;
        this.tongTien = tongTien;
    }

    public String getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(String idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public String getIdKhach() {
        return idKhach;
    }

    public void setIdKhach(String idKhach) {
        this.idKhach = idKhach;
    }
    
    public date getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(date ngayMua) {
        this.ngayMua = ngayMua;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public void nhapHD() {
        // se them phan check xem khach hang nhap vao co ton tai chua
        // neu chua ton tai goi ham nhap thong tin khach
        // neu da ton tai thi tiep tuc binh thuong
        System.out.println("Nhap ngay xuat hoa don: ");
        ngayMua.nhap();
        System.out.println("Nhap id khach hang: ");
        idKhach = checkLoi.checkIdKhachHang();
    }

    public void xuatHD(){
        String mahd_format = "| Ma hoa don: %-8s | %n";
        String date_format = "| Ngay mua: %-10s | %n";   
        String khach_format = "| ID khach: %-10s |%n";
        System.out.println("+----------------------+");
        System.out.format(mahd_format, idHoaDon);
        System.out.format(date_format, ngayMua);
        System.out.format(khach_format, idKhach);
        System.out.println("+----------------------+");

    }

    @Override
    public String toString() {
        return idHoaDon + ", " + idKhach + ", " + ngayMua + ", " + tongTien;
    }
}
