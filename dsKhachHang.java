import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class dsKhachHang {
    Scanner sc = new Scanner(System.in);

    private ArrayList<khachHang> arr_kh = new ArrayList<khachHang>();
    
    public dsKhachHang() {

    }

    public dsKhachHang(ArrayList<khachHang> arr_kh) {
        this.arr_kh = arr_kh;
    }

    public void nhap_dskh(){
        System.out.println("Nhap vao so luong khach hang: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i<n; i++){
            System.out.println("Nhap khach hang thu "+(i+1) +": ");
            khachHang tmp = new khachHang();
            tmp.nhap();
            arr_kh.add(tmp);
        }
    }

    public void them_kh(){
        System.out.println("Nhap thong tin khach hang can them: ");
        khachHang tmp = new khachHang();
        tmp.nhap();
        arr_kh.add(tmp);
    }

    public void xoa_kh(){
        System.out.println("Nhap id khach hang can xoa: ");
        String id = sc.nextLine();

        Iterator<khachHang> it = arr_kh.iterator();
        while(it.hasNext()){
            khachHang kh = it.next();
            if(kh.getidKhach().equals(id)){
                arr_kh.remove(kh);
                return;
            }
        }
        System.out.println("Khach hang can xoa khong ton tai!");
    }

    public void sua_kh(){
        System.out.println("Nhap id khach hang can sua: ");
        String id = sc.nextLine();

        Iterator<khachHang> it = arr_kh.iterator();
        while(it.hasNext()){
            khachHang kh = it.next();
            if(kh.getidKhach().equals(id)){
                kh.nhap();
                return;
            }
        }
        System.out.println("Khach hang can sua khong ton tai! ");
    }

    public void timkiem_kh(){
        System.out.println("Nhap id khach hang can tim kiem: ");
        String id = sc.nextLine();
        
        Iterator<khachHang> it = arr_kh.iterator();
        while(it.hasNext()){
            khachHang kh = it.next();
            if(kh.getidKhach().equals(id)){
                kh.xuatKH();
                return;
            }
        }
        System.out.println("Khach hang can tim khong ton tai!");
    }

    public void xuat_ds(){
        System.out.println("+---------------------------------------------------+");
        System.out.println("| ID khach |   Ho ten   |     SDT     |   Dia chi   |");
        System.out.println("+---------------------------------------------------+");

        String khach_format = "| %-8s | %-11s | %-11s | %-11s | %n";
        for (khachHang kh : arr_kh) {
            System.out.format(khach_format, kh.getidKhach(), kh.getTenKhach(), kh.getSdt(), kh.getDc());
        }
        System.out.println("+---------------------------------------------------+");
    }

    public static void main(String[] args) {
        dsKhachHang tmp = new dsKhachHang();
           
    }
}
