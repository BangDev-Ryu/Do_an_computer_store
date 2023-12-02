import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class DsBaoHanh {
        ArrayList<baoHanh> arr = new ArrayList<baoHanh>();
    Scanner sc=new Scanner(System.in);
    public DsBaoHanh()
    {

    }
    public void nhapds() {
        System.out.print("Nhap vao so luong phan tu: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("-----------------------------------");
            System.out.println("Nhap phan tu thu " + (i+1) + ": ");
            baoHanh tmp = new baoHanh();
            tmp.nhapBH();
            arr.add(tmp);
        }
    }
    
    public void timkiem() {
        String tmp = sc.nextLine();
        System.out.print("Nhap id can tim: ");
        String id = sc.nextLine();
        for (baoHanh bh : arr) {
            if (bh.getIdBH().equals(id)) {
                System.out.println("Sinh vien can tim: ");
                bh.xuatBH();
                return;
            }
        }
        System.out.println("id can tim khong ton tai!");
    }

     public void sua(){
        System.out.println("Nhap id bao hiem can sua: ");
        String id = sc.nextLine();

        Iterator<baoHanh> it = arr.iterator();
        while(it.hasNext()){
            baoHanh bh = it.next();
            if(bh.getIdBH().equals(id)){
                bh.nhapBH();
                return;
            }
        }
        System.out.println("Khach hang can sua khong ton tai! ");
    }
    
    public void them() {
        System.out.println("Nhap thong tin bao hanh  can them: ");
        baoHanh tmp = new baoHanh();
        tmp.nhapBH();
        arr.add(tmp);
    }
    
    public void xuatds(){
        System.out.println("+------------------------------------------------------------------+");
        System.out.println("| ID bao hanh | Ngay mua hang | Ngay ket thuc | Thoi gian bao hanh |");
        System.out.println("+------------------------------------------------------------------+");

        String bh_format = "|   %-8s  |    %-10s |   %-10s  |      %-2s thang      | %n";
        for (baoHanh bh : arr) {
            System.out.format(bh_format, bh.getIdBH(), bh.getNgayMua(), bh.getNgayKt(), bh.getTgBh());
        }
        System.out.println("+------------------------------------------------------------------+");
    }
       
    
    public void xoa() {
        String tmp = sc.nextLine();
        System.out.print("Nhap id can xoa: ");
        String id = sc.nextLine();

        Iterator<baoHanh> it = arr.iterator();
        while (it.hasNext()) {
            baoHanh bh = it.next();
            if (bh.getIdBH().equals(id)) {
                arr.remove(bh);
                return;
            }
        }
        System.out.println("id can xoa khong ton tai!");
    }
    public static void main(String[] args) {
        DsBaoHanh ds =new DsBaoHanh();
        ds.them();
        ds.sua();
        ds.xuatds();
    }    
}
