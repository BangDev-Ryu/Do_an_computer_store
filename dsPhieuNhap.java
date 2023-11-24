import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class dsPhieuNhap {
    private ArrayList<phieuNhap> dsphieunhap;
    Scanner sc = new Scanner(System.in);

    public dsPhieuNhap() {
        this.dsphieunhap = new ArrayList<phieuNhap>();
    }

    public dsPhieuNhap(ArrayList<phieuNhap> dsphieunhap) {
        this.dsphieunhap = dsphieunhap;
    }

    public ArrayList<phieuNhap> getDsphieunhap() {
        return dsphieunhap;
    }

    public void setDsphieunhap(ArrayList<phieuNhap> dsphieunhap) {
        this.dsphieunhap = dsphieunhap;
    }

    public void themphieunhap(phieuNhap pn) {
        this.dsphieunhap.add(pn);
    }

    public void xuatdsphieunhap() {
        for (phieuNhap pn : dsphieunhap) {
            System.out.println(pn);
        }
    }

    public void timkiemphieunhap(String id) {
        boolean found = false;
        for (phieuNhap pn : dsphieunhap) {
            if (pn.getIdphieu().equals(id)) {
                System.out.println(pn);
                found = true;
            }
        }
        if (!found) {
            System.out.println("khong tim thay phieu nhap nay");
        }
    }

    public void xoaphieunhap(String id) {
        Iterator<phieuNhap> iterator = dsphieunhap.iterator();
        while (iterator.hasNext()) {
            phieuNhap pn = iterator.next();
            if (pn.getIdphieu().equals(id)) {
                iterator.remove();
            }
        }
    }

}
