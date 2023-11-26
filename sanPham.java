public abstract class sanPham {
    private String idSp;
    private String tenSp;
    private double giaTien;

    public sanPham() {

    }

    public abstract void xuatSp();

    public sanPham(String ten, double tien) {
        tenSp = ten;
        giaTien = tien;
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

    public void setGiaTien(double tien) {
        giaTien = tien;
    }

    public double getGiaTien() {
        return giaTien;
    }
}