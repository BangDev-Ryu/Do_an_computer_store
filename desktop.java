public class desktop extends sanPham {

    public desktop() {
        
    }

    public desktop(String id, int sl) {
        super("DE"+id, sl);
    }

    public desktop(String id, String ten, int sl, double tien) {
        super("DE"+id, ten, sl, tien);
    }

    @Override
    public void xuatSp() {
        String desktop_format = "| %-8s | %-15s | %-8s | %-12.2f | %n";
        System.out.format(desktop_format, getIdSp(), getTenSp(), getSoLuong(), getGiaTien());
    }
}