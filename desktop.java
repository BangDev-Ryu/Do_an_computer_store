public class desktop extends sanPham {
    private static int slTonKhoDesktop = 0;

    public desktop() {
        slTonKhoDesktop++;
    }

    public desktop(String id, int sl) {
        super("DE"+id, sl);
        slTonKhoDesktop++;
    }

    public desktop(String id, String ten, int sl, double tien) {
        super("DE"+id, ten, sl, tien);
        slTonKhoDesktop++;
    }

    @Override
    public void xuatSp() {
        String desktop_format = "| %-8s | %-15s | %-8s | %-12.2f | %n";
        System.out.format(desktop_format, getIdSp(), getTenSp(), getSoLuong(), getGiaTien());
    }

    @Override
    public int getSlTonKho() {
        return slTonKhoDesktop;
    }
}