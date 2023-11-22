import java.util.ArrayList;
import java.util.Scanner;
public class DsKhachHang {
    ArrayList<khachHang> dskhachHang = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public DsKhachHang() {
    }

    public DsKhachHang(ArrayList<khachHang> dskhachHang) {
        this.dskhachHang = dskhachHang;
    }
    public void nhap_dskh(){
        System.out.println("Nhap vao so luong khach hang: ");
        int n = sc.nextInt();
        for (int i = 0; i<n; i++){
            System.out.println("Nhap khach hang thu "+(i+1) +": ");
            khachHang tmp = new khachHang();
            tmp.nhap();
            dskhachHang.add(tmp);
        }
    }
    public void xuat_dskh(){
        for(khachHang kh : dskhachHang){
            kh.xuat();
        }
    }
    public void them_kh(){
        System.out.println("Nhap thong tin khach hang can them: ");
        khachHang tmp = new khachHang();
        tmp.nhap();
        dskhachHang.add(tmp);
    }
    public void xoa_kh(){
        System.out.
    }
}
