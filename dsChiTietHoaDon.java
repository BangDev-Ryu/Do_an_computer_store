import java.util.ArrayList;

public class dsChiTietHoaDon {
    ArrayList<chiTietHoaDon> arr_cthd = new ArrayList<chiTietHoaDon>();

    public dsChiTietHoaDon() {

    }

    public void xuatDSCTHD() {
        for (chiTietHoaDon ct : arr_cthd) {
            System.out.println(ct);
        }
    }
}