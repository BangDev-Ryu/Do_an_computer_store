public class chiTietPhieuNhap {

    private String maSp;
    private int soLuong;
    private double giaTien;

    public chiTietPhieuNhap(String maSp, int soLuong, double giaTien) {
        this.maSp = maSp;
        this.soLuong = soLuong;
        this.giaTien = giaTien;
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

    @Override
    public String toString() {
        return "maSp=" + maSp + ", soLuong=" + soLuong + ", giaTien=" + giaTien;
    }

}
