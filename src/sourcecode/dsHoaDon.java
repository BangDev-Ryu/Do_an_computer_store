import java.util.Scanner;
import java.util.ArrayList;

public class dsHoaDon { 
    Scanner sc = new Scanner(System.in);
    ArrayList<hoaDon> arr_hd = new ArrayList<hoaDon>();

    // public void taoHD() {
    //     hoaDon tmp = new hoaDon();
    //     tmp.nhapHD();
    //     arr_hd.add(tmp);
    // }

    public void timHoaDon() {
        System.out.print("Nhap id hoa don can tim: ");
        String id_tim = checkLoi.checkIdHoaDon();
        
        for (hoaDon hd : arr_hd) {
            if (hd.getIdHoaDon().equals(id_tim)) {
                hd.xuatHD();
                return;
            }
        }

        System.out.println("Ma hoa don can tim khong ton tai!");
    }

    public void xuatDSHD() {
        System.out.println("+----------------------------------------+");
        System.out.println("| Ma hoa don |  ID Khach  |   Ngay mua   |");
        System.out.println("+----------------------------------------+");

        String hd_format = "| %-10s | %-10s | %-12s | %n";
        for (hoaDon hd : arr_hd) {
            System.out.format(hd_format, hd.getIdHoaDon(), hd.getIdKhach(), hd.getNgayMua());
        }
        System.out.println("+----------------------------------------+");
    }

    public hoaDon getLastHD() {
        return arr_hd.get(arr_hd.size()-1);
    }

    public int tongHoaDon() {
        return arr_hd.size();
    }

    public date timDate(String id) {
        for (hoaDon hd : arr_hd) {
            if (hd.getIdHoaDon().equals(id)) {
                return hd.getNgayMua();
            }
        }
        return new date();
    }

    public int tongHoaDonBan() {
        int sum = 0;
        for (hoaDon hd : arr_hd) {
            if (hd.getTongTien() != 0) {
                sum++;
            }
        }
        return sum;
    }

    public int tongHoaDonHuy() {
        return tongHoaDon() - tongHoaDonBan();
    }

}