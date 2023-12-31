import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class dsPhieuNhap {
    Scanner sc = new Scanner(System.in);
    ArrayList<phieuNhap> arr_pn = new ArrayList<phieuNhap>();

    // public void taoPN() {
    //     phieuNhap tmp = new phieuNhap();
    //     tmp.nhapPN();
    //     arr_pn.add(tmp);
    // }

    public void timPN() {
        System.out.print("Nhap id phieu nhap can tim: ");
        String id_tim = checkLoi.checkIdPhieuNhap();

        for (phieuNhap pn : arr_pn) {
            if (pn.getIdPhieu().equals(id_tim)) {
                pn.xuatPN();
                return;
            }
        }
        System.out.println("Ma phieu nhap can tim khong ton tai!");
    }

    public void xuatDSPN() {
        System.out.println("+--------------------------------------------------+");
        System.out.println("| Ma phieu nhap |  ID nha cung cap  |   Ngay nhap  |");
        System.out.println("+--------------------------------------------------+");

        String pn_format = "| %-13s | %-17s | %-12s | %n";
        for (phieuNhap pn : arr_pn) {
            System.out.format(pn_format, pn.getIdPhieu(), pn.getIdncc(), pn.getNgaynhap());
        }
        System.out.println("+--------------------------------------------------+");
    }

    public phieuNhap getLastPN() {
        return arr_pn.get(arr_pn.size() - 1);
    }

    public int tongPhieuNhap() {
        return arr_pn.size();
    }

    public int tongPhieuNhapNhap() {
        int sum = 0;
        for (phieuNhap pn : arr_pn) {
            if (pn.getTongTien() != 0) {
                sum++;
            }
        }
        return sum;
    }

    public date timDate(String id) {
        for (phieuNhap pn : arr_pn) {
            if (pn.getIdPhieu().equals(id)) {
                return pn.getNgaynhap();
            }
        }
        return new date();
    }

    public int tongPhieuNhapHuy() {
        return tongPhieuNhap() - tongPhieuNhapNhap();
    }

}
