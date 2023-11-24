import java.util.ArrayList;
import java.util.Scanner;

public class hoaDon {
    Scanner sc = new Scanner(System.in);
    
    private String idKhach;
    private String idHoaDon;
    private date ngayMua = new date();
    private double tongTien;
    private ArrayList<chiTietHoaDon> chiTietHD = new ArrayList<>();
    private static int cnt_id = 0;

    public hoaDon() {
        idHoaDon = "HD" + cnt_id;
        cnt_id++;
    }

    public hoaDon(String idKhach, String idHoaDon, date ngayMua, double tongTien, ArrayList<chiTietHoaDon> chiTietHD,
            khachHang khachMua) {
        this.idKhach = idKhach;
        this.idHoaDon = idHoaDon;
        this.ngayMua = ngayMua;
        this.tongTien = tongTien;
        this.chiTietHD = chiTietHD;
    }
    
    public String getIdKhach() {
        return idKhach;
    }

    public void setIdKhach(String idKhach) {
        this.idKhach = idKhach;
    }

    public String getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(String idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public date getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(date ngayMua) {
        this.ngayMua = ngayMua;
    }

    public ArrayList<chiTietHoaDon> getChiTietHD() {
        return chiTietHD;
    }

    public void setChiTietHD(ArrayList<chiTietHoaDon> chiTietHD) {
        this.chiTietHD = chiTietHD;
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

        System.out.println("+--------------------+----------+--------------+");
        System.out.println("|      San pham      | So luong |   Gia tien   |");
        System.out.println("+--------------------+----------+--------------+");

        String cthd_format = "| %-18s | %-8s | %-12.2f | %n";
        for (chiTietHoaDon ct : chiTietHD) {
            System.out.format(cthd_format, ct.getMaSp(), ct.getSoLuong(), ct.getGiaTien());
        }
        System.out.println("+--------------------+----------+--------------+");
        String tongtien_format = "| Tong tien: %-34.2f| %n";
        System.out.format(tongtien_format, tongTien);
        System.out.println("+--------------------+----------+--------------+");

    }
}
