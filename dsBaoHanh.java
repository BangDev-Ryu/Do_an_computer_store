import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class dsBaoHanh {
    Scanner sc = new Scanner(System.in);
    ArrayList<baoHanh> arr_bh = new ArrayList<baoHanh>();

    public dsBaoHanh() {
        arr_bh.add(new baoHanh("36T", 3));
        arr_bh.add(new baoHanh("24T", 2));
        arr_bh.add(new baoHanh("12T", 1));
    }
    
    public void nhapds() {
        System.out.print("Nhap vao so luong phan tu: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("-----------------------------------");
            System.out.println("Nhap phan tu thu " + (i+1) + ": ");
            baoHanh tmp = new baoHanh();
            tmp.nhapBH();
            arr_bh.add(tmp);
        }
    }
    
    public void timkiem() {
        String tmp = sc.nextLine();
        System.out.print("Nhap id can tim: ");
        String id = sc.nextLine();
        for (baoHanh bh : arr_bh) {
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

        Iterator<baoHanh> it = arr_bh.iterator();
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
        arr_bh.add(tmp);
    }
    
    public void xuatds(){
        System.out.println("+------------------------------------------------------------------+");
        System.out.println("| ID bao hanh | Ngay mua hang | Ngay ket thuc | Thoi gian bao hanh |");
        System.out.println("+------------------------------------------------------------------+");

        String bh_format = "|   %-8s  |    %-10s |   %-10s  |      %-2s thang      | %n";
        for (baoHanh bh : arr_bh) {
            System.out.format(bh_format, bh.getIdBH(), bh.getNgayMua(), bh.getNgayKt(), bh.getTgBh());
        }
        System.out.println("+------------------------------------------------------------------+");
    }
       
    
    public void xoa() {
        String tmp = sc.nextLine();
        System.out.print("Nhap id can xoa: ");
        String id = sc.nextLine();

        Iterator<baoHanh> it = arr_bh.iterator();
        while (it.hasNext()) {
            baoHanh bh = it.next();
            if (bh.getIdBH().equals(id)) {
                arr_bh.remove(bh);
                return;
            }
        }
        System.out.println("id can xoa khong ton tai!");
    }   

    public date kThucBaoHanh(String id, date mua) {
        date tmp = new date();
        int n = 0;
        if (id.equals("12T")) {
            n = 1;
        }
        else if (id.equals("24T")) {
            n = 2;
        }
        else if (id.equals("36T")) {
            n = 3;
        }
        tmp.setNgay(mua.getNgay());
        tmp.setThang(mua.getThang());
        tmp.setNam(mua.getNam() + n);
        return tmp;
    }
}
