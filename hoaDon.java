import java.util.Scanner;
import java.util.ArrayList;

public class hoaDon {
    Scanner sc = new Scanner(System.in);
    
    private String idHoaDon;
    private String idKhach;
    private date ngayMua = new date();
    private double tongTien;
    private ArrayList<chiTietHoaDon> chiTietHD = new ArrayList<chiTietHoaDon>();
    private static int cntIdHD = 0;
    dsChiTietHoaDon dsct = new dsChiTietHoaDon();

    public hoaDon() {
        idHoaDon = "HD" + cntIdHD;
        cntIdHD++;
    }

    public String getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(String idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public String getIdKhach() {
        return idKhach;
    }

    public void setIdKhach(String idKhach) {
        this.idKhach = idKhach;
    }
    
    public date getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(date ngayMua) {
        this.ngayMua = ngayMua;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public void nhapHD(){
        int choice;
        System.out.println("Nhap id khach hang: ");
        idKhach = sc.nextLine();
        System.out.println("Nhap ngay mua: ");
        ngayMua.nhap();
        System.out.println();
        
        do {
            System.out.println("--------------------------------------------------");
            System.out.println("1. Nhap san pham.");
            System.out.println("0. Xong.");
            System.out.println("Nhap lua chon: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    chiTietHoaDon tmp = new chiTietHoaDon();
                    tmp.setIdHoaDon(idHoaDon);
                    tmp.nhapCT();
                    chiTietHD.add(tmp);
                    dsct.arr_cthd.add(tmp);
                    break;
                case 0:
                    System.out.println("Thoat");
                    break;
                default:
                    System.out.println("Chon khong hop le!");
                    break;
            }
        } while(choice != 0);
    }

    public void xuatHD(){
        String mahd_format = "| Ma hoa don: %-8s | %n";
        String date_format = "| Ngay mua: %-10s | %n";   
        String khach_format = "| ID khach: %-10s |%n";
        System.out.println("+----------------------+");
        System.out.format(mahd_format, idHoaDon);
        System.out.format(date_format, ngayMua);
        System.out.format(khach_format, idKhach);
        System.out.println("+----------------------+");

        System.out.println("+--------------------+----------+--------------+--------------+");
        System.out.println("|      San pham      | So luong |    Don gia   |  Thanh tien  |");
        System.out.println("+--------------------+----------+--------------+--------------+");

        String cthd_format = "| %-18s | %-8s | %-12.2f | %-12.2f | %n";
        for (chiTietHoaDon ct : chiTietHD) {
            System.out.format(cthd_format, ct.getMaSp(), ct.getSoLuong(), ct.getGiaTien(), ct.getThanhtien());
        }
        System.out.println("+--------------------+----------+--------------+--------------+");
        String tongtien_format = "| Tong tien: %-48.2f | %n";
        System.out.format(tongtien_format, tongTien);
        System.out.println("+--------------------+----------+--------------+--------------+");

    }
}
