import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dsNhaCungCap dsncc = new dsNhaCungCap();
        dsPhieuNhap dspn = new dsPhieuNhap();
        int lc;
        do {
            System.out.println("menu");
            System.out.println("1.them phieu nhap");
            System.out.println("2.in danh sach phieu nhap");
            System.out.println("3.xoa phieu nhap");
            System.out.println("4.tim kiem phieu nhap");
            System.out.println("nhap lua chon:");
            lc = sc.nextInt();
            switch (lc) {
                case 1:
                    System.out.println("Nhap id phieu nhap:");
                    sc.nextLine();
                    String idpn = sc.nextLine();
                    System.out.println("Nhap ngay nhap hang:");

                    System.out.println("Nhap ngay:");
                    int ngaynhap = sc.nextInt();
                    System.out.println("Nhap thang:");
                    int thangnhap = sc.nextInt();
                    System.out.println("Nhap nam:");
                    int namnhap = sc.nextInt();
                    date nn = new date(ngaynhap, thangnhap, namnhap);
                    System.out.println("nhap id nha cung cap:");
                    sc.nextLine();
                    String idncc = sc.nextLine();
                    System.out.println("nhap ten nha cung cap:");
                    String tenncc = sc.nextLine();
                    System.out.println("nhap so dien thoai nha cung cap:");
                    String sdtncc = sc.nextLine();
                    System.out.println("nhap email nha cung cap:");
                    String emailncc = sc.nextLine();
                    nhaCungCap ncc = new nhaCungCap(idncc, tenncc, sdtncc, emailncc);
                    System.out.println("nhap id san pham:");
                    String idsp = sc.nextLine();
                    System.out.println("Nhap so luong san pham:");
                    int slsp = sc.nextInt();
                    System.out.println("nhap gia tien:");
                    double gt = sc.nextDouble();
                    chiTietPhieuNhap ctpn = new chiTietPhieuNhap(idsp, slsp, gt);
                    phieuNhap pn = new phieuNhap(idpn, nn, ncc, ctpn);
                    dspn.themphieunhap(pn);
                    break;
                case 2:
                    System.out.println("danh sach phieu nhap");
                    dspn.xuatdsphieunhap();
                    break;

                case 3:
                    System.out.println("nhap id phieu nhap can xoa:");
                    sc.nextLine();
                    String idcanxoa = sc.nextLine();
                    dspn.xoaphieunhap(idcanxoa);
                    break;
                case 4:
                    System.out.println("nhap id can tim:");
                    sc.nextLine();
                    String idcantim = sc.nextLine();
                    dspn.timkiemphieunhap(idcantim);

                    break;
                default:
                    System.out.println("nhap sai lua chon");
                    break;
            }
        } while (lc != 0);
    }
}
