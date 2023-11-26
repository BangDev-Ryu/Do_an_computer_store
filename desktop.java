public class desktop extends sanPham {
    private static int cntIdDesktop = 0;

    public desktop() {
        setIdSp("DESK" + cntIdDesktop);
        cntIdDesktop++;
    }

    public desktop(String ten, double tien) {
        super(ten, tien);
        setIdSp("DESK" + cntIdDesktop);
        cntIdDesktop++;
    }

    @Override
    public void xuatSp() {
        String desktop_format = "| %-8s | %-15s | %-8s | %-12.2f | %n";
        System.out.format(desktop_format, getIdSp(), getTenSp(), 1, getGiaTien());
    }
}