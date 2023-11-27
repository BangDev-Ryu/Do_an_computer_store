import java.util.ArrayList;

public class dsChiTietPhieuNhap {
    ArrayList<chiTietPhieuNhap> arr_ctpn = new ArrayList<chiTietPhieuNhap>();

    public dsChiTietPhieuNhap() {

    }

    public void xuatDSCTPN() {
        for (chiTietPhieuNhap ct : arr_ctpn) {
            System.out.println(ct);

        }
    }

}
