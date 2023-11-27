public abstract class sanPham {
    private String idSp;
    private String tenSp;
    private int soLuong;
    private double giaTien;

    public sanPham() {

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

    public void getSoLuong() {
        return soLuong;
    }

    public void setGiaTien(double tien) {
        giaTien = tien;
    }

    public double getGiaTien() {
        return giaTien;
    }
}