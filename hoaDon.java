import java.util.ArrayList;
import java.util.Scanner;
public class hoaDon {
    private String idKhach;
    private String idHoaDon;
    private date ngayMua;
    private int tongTien;
    ArrayList<chiTietHoaDon> chiTietHD = new  ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
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
    public int getTongTien() {
        return tongTien;
    }
    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    
    public hoaDon(String idKhach, String idHoaDon, date ngayMua, int tongTien, ArrayList<chiTietHoaDon> chiTietHD,
            khachHang khachMua) {
        this.idKhach = idKhach;
        this.idHoaDon = idHoaDon;
        this.ngayMua = ngayMua;
        this.tongTien = tongTien;
        this.chiTietHD = chiTietHD;
    }
    public hoaDon() {
    }
    public void nhapHD(){
        int choice;
        System.out.println("Nhap id khach hang: ");
        idKhach = sc.nextLine();
        System.out.println("Nhap ma hoa don: ");
        idHoaDon = sc.nextLine();
        System.out.println("Nhap ngay mua: ");
        ngayMua = new date();
        ngayMua.nhap();
        System.out.println();
        do{
            System.out.println("1.Nhap san pham: ");
            System.out.println("0.Thoat");
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
        }while(choice != 0);
    }
    public void xuatHD(){
        System.out.println(idHoaDon +" "+ idKhach +" "+ ngayMua);
        for(chiTietHoaDon ct:chiTietHD){
            System.out.println(ct);
        }
    }
    public static void main(String[] args) {
        hoaDon hd = new hoaDon();
        hd.nhapHD();
        hd.xuatHD();
    }
}
