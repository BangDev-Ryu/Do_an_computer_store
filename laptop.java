public class laptop extends sanPham {
    private static int slTonKhoLaptop = 0;

    public laptop() {
        slTonKhoLaptop++;
    }

    public laptop(String id, int sl) {
        super("LA"+id, sl);
        slTonKhoLaptop++;
    }

    public laptop(String id, String ten, int sl, double tien) {
        super("LA"+id, ten, sl, tien);
        slTonKhoLaptop++;
    }

    @Override
    public void xuatSp() {
        String desktop_format = "| %-8s | %-15s | %-8s | %-12.2f | %n";
        System.out.format(desktop_format, getIdSp(), getTenSp(), getSoLuong(), getGiaTien());
    }

    @Override
    public int getSlTonKho() {
        return slTonKhoLaptop;
    }
}