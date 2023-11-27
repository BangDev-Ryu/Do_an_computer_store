public class laptop extends sanPham {
    private baoHanh bHanh = new baoHanh();

    public laptop() {
        
    }

    public laptop(String id, String ten, int sl, double tien) {
        super(id, ten, sl, tien);
    }

    @Override
    public void xuatSp() {
        String desktop_format = "| %-8s | %-15s | %-8s | %-12.2f | %n";
        System.out.format(desktop_format, getIdSp(), getTenSp(), getSoLuong(), getGiaTien());
    }
}