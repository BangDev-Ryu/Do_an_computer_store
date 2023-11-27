public class laptop extends sanPham {

    public laptop() {
        
    }

    public laptop(String id, int sl) {
        super("LA"+id, sl);
    }

    public laptop(String id, String ten, int sl, double tien) {
        super("LA"+id, ten, sl, tien);
    }

    @Override
    public void xuatSp() {
        String desktop_format = "| %-8s | %-15s | %-8s | %-12.2f | %n";
        System.out.format(desktop_format, getIdSp(), getTenSp(), getSoLuong(), getGiaTien());
    }
}