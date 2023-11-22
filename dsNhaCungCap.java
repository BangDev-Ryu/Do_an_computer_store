import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class dsNhaCungCap {
    private ArrayList<nhaCungCap> dsnhacungcap;
    Scanner sc = new Scanner(System.in);

    public dsNhaCungCap() {
        this.dsnhacungcap = new ArrayList<nhaCungCap>();
    }

    public dsNhaCungCap(ArrayList<nhaCungCap> dsnhacungcap) {
        this.dsnhacungcap = dsnhacungcap;
    }

    public void addncc(nhaCungCap ncc) {

        this.dsnhacungcap.add(ncc);
    }

    public void xuatdsncc() {
        for (nhaCungCap ncc : dsnhacungcap) {
            System.out.println(ncc);
        }
    }

    public void timkiemncc(String idncc) {
        for (nhaCungCap ncc : dsnhacungcap) {
            if (ncc.getIdNCC().indexOf(idncc) >= 0) {
                System.out.println(ncc);
            } else {
                System.out.println("khong ton tai id nay");
            }
        }
    }

    public void xoancc(String idncc) {
        for (nhaCungCap ncc : dsnhacungcap) {
            if (ncc.getIdNCC().indexOf(idncc) >= 0) {
                dsnhacungcap.remove(dsnhacungcap.indexOf(ncc));

            }
        }
    }
}
