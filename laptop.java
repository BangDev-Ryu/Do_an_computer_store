public class laptop extends sanPham {
    private static int cntIdLaptop = 0;

    public laptop() {
        setIdSp("LAP" + cntIdLaptop);
        cntIdLaptop++;
    }

    public laptop(String ten, double tien) {
        super(ten, tien);
        setIdSp("LAP" + cntIdLaptop);
        cntIdLaptop++;
    }

    public void xuatSp() {
        String desktop_format = "| %-8s | %-15s | %-8s | %-12.2f | %n";
        System.out.format(desktop_format, getIdSp(), getTenSp(), 1, getGiaTien());
    }
}