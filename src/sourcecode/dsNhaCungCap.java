import java.util.Scanner;
import java.util.ArrayList;

public class dsNhaCungCap {
    ArrayList<nhaCungCap> dsnhacungcap = new ArrayList<nhaCungCap>();
    Scanner sc = new Scanner(System.in);

    public dsNhaCungCap() {

    }

    public void themNcc() {
        nhaCungCap ncc = new nhaCungCap();
        ncc.nhap();
        dsnhacungcap.add(ncc);
    }

    public void themNcc(nhaCungCap ncc) {
        dsnhacungcap.add(ncc);
    }

    public boolean tonTaiNCC(String id) {
        for (nhaCungCap ncc : dsnhacungcap) {
            if (ncc.getIdNCC().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public void xuatdsncc() {
        System.out.println("+---------------------------------------------------------------------------------------+");
        System.out.println("|   Ma NCC   |          Ten NCC          |     SDT     |             Email              |");
        System.out.println("+---------------------------------------------------------------------------------------+");

        for (nhaCungCap ncc : dsnhacungcap) {
            ncc.xuatNCC();
        }
        System.out.println("+---------------------------------------------------------------------------------------+");
    }

    public void xuatdsncc(nhaCungCap ncc) {
        System.out.println(
                "+---------------------------------------------------------------------------------------+");
        System.out.println(
                "|   Ma NCC   |          Ten NCC          |     SDT     |             Email              |");
        System.out.println(
                "+---------------------------------------------------------------------------------------+");

        String ncc_format = "| %-10s | %-25s | %-11s | %-30s |%n";

        System.out.format(ncc_format, ncc.getIdNCC(), ncc.getTenNCC(), ncc.getSdt(), ncc.getEmail());

        System.out.println(
                "+---------------------------------------------------------------------------------------+");
    }

    public void timNCC(String id) {
        for (nhaCungCap ncc : dsnhacungcap) {
            if (ncc.getIdNCC().equals(id)) {
                System.out.println("+---------------------------------------------------------------------------------------+");
                System.out.println("|   Ma NCC   |          Ten NCC          |     SDT     |             Email              |");
                System.out.println("+---------------------------------------------------------------------------------------+");
                ncc.xuatNCC();
                System.out.println("+---------------------------------------------------------------------------------------+");
            }
        }
    }

    public void doiTen(String id) {
        System.out.println("Nhap ten moi: ");
        String tenMoi = checkLoi.checkTenNhaCungCap();
        
        for (nhaCungCap ncc : dsnhacungcap) {
            if (ncc.getIdNCC().equals(id)) {
                ncc.setTenNCC(tenMoi);
                return;
            }
        }
    }

    public void doiSDT(String id) {
        System.out.println("Nhap SDT moi: ");
        String sdtMoi = checkLoi.checkSDT();

        for (nhaCungCap ncc : dsnhacungcap) {
            if (ncc.getIdNCC().equals(id)) {
                ncc.setSdt(sdtMoi);
                return;
            }
        }
    }

    public void xoancc(String id) {

        for (nhaCungCap ncc : dsnhacungcap) {
            if (ncc.getIdNCC().equals(id)) {
                dsnhacungcap.remove(ncc);
                return;
            }
        }
        System.out.println("khong tim thay nha cung cap can xoa");
    }

    public void taoDsCoSan() {
        dsnhacungcap.add(new nhaCungCap("Nha Cung Cap Vippro", "0123451234", "nccvippro@gmail.com"));
        dsnhacungcap.add(new nhaCungCap("Microhard", "0192837465", "microhard@gmail.com"));
        dsnhacungcap.add(new nhaCungCap("MSY", "07777777777", "msyprovip@gmail.com"));
    }

}
