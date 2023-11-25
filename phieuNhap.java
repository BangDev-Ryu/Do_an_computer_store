import java.util.Scanner;
import java.util.ArrayList;

public class phieuNhap {
    private String idphieu;
    private date ngaynhap;
    private nhaCungCap nhacungcap;
    private chiTietPhieuNhap chitietphieu;
    private double tongTien;

    public phieuNhap(String idphieu, date ngaynhap, nhaCungCap nhacungcap, chiTietPhieuNhap chitietphieu,
            double tongTien) {
        this.idphieu = idphieu;
        this.ngaynhap = ngaynhap;
        this.nhacungcap = nhacungcap;
        this.chitietphieu = chitietphieu;
        this.tongTien = tongTien;
    }

    public String getIdphieu() {
        return idphieu;
    }

    public void setIdphieu(String idphieu) {
        this.idphieu = idphieu;
    }

    public date getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(date ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public nhaCungCap getNhacungcap() {
        return nhacungcap;
    }

    public void setNhacungcap(nhaCungCap nhacungcap) {
        this.nhacungcap = nhacungcap;
    }

    public chiTietPhieuNhap getChitietphieu() {
        return chitietphieu;
    }

    public void setChitietphieu(chiTietPhieuNhap chitietphieu) {
        this.chitietphieu = chitietphieu;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public double getTongTien() {
        return chitietphieu.getGiaTien() * chitietphieu.getSoLuong();
    }

    @Override
    public String toString() {
        return "id phieu=" + idphieu + ", ngay nhap:" + ngaynhap + ", nha cung cap:" + nhacungcap
                + chitietphieu + ",tong tien=" + tongTien;
    }

}