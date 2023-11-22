import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
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
            diaChi dc = new diaChi(); 
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
        System.out.println("Nhap id khach hang can xoa: ");
        String id = sc.nextLine();

        Iterator<khachHang> it = dskhachHang.iterator();
        while(it.hasNext()){
            khachHang kh = it.next();
            if(kh.getidKhach().equals(id)){
                dskhachHang.remove(kh);
                return;
            }
        }
        System.out.println("Khach hang can xoa khong ton tai!");
    }
    public void sua_kh(){
        System.out.println("Nhap id khach hang can sua: ");
        String id = sc.nextLine();

        Iterator<khachHang> it = dskhachHang.iterator();
        while(it.hasNext()){
            khachHang kh = it.next();
            if(kh.getidKhach().equals(id)){
                kh.nhap();
            }
        }
        System.out.println("Khach hang can sua khong ton tai! ");
    }

    public void timkiem_kh(){
        System.out.println("Nhap id khach hang can tim kiem: ");
        String id = sc.nextLine();
        
        Iterator<khachHang> it = dskhachHang.iterator();
        while(it.hasNext()){
            khachHang kh = it.next();
            if(kh.getidKhach().equals(id)){
                kh.xuat();
            }
        }
        System.out.println("Khach hang can tim khong ton tai!");
    }
    public void xuat_ds(){
        System.out.println("Xuat danh sach khach hang: ");
        for(khachHang kh : dskhachHang){
            kh.xuat();
        }
    }
    public static void main(String[] args) {
        DsKhachHang ds = new DsKhachHang();
        ds.nhap_dskh();
        ds.xoa_kh();
        ds.sua_kh();
        ds.timkiem_kh();
    }
}
