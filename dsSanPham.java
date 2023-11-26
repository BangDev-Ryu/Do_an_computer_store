import java.util.ArrayList;

public class dsSanPham {    
    ArrayList<sanPham> arr_sp = new ArrayList<>();

    public dsSanPham() {

    }

    public void taoDsCoSan() {
        desktop d0 = new desktop("desk0", 10000);
        arr_sp.add(d0);
        desktop d1 = new desktop("desk1", 15000);
        arr_sp.add(d1);
        laptop l0 = new laptop("lap0", 7000);
        arr_sp.add(l0);
        desktop d2 = new desktop("desk2", 19000);
        arr_sp.add(d2);
        laptop l1 = new laptop("lap1", 12000); 
    }

    public void xuatDsDesktop() {
        System.out.println("+------------------------------------------------------+");
        System.out.println("|                       Desktop                        |");
        System.out.println("+------------------------------------------------------+");
        System.out.println("|    ID    |   Ten desktop   | So luong |   Gia tien   |");
        System.out.println("+------------------------------------------------------+");

        for (sanPham sp : arr_sp) {
            if (sp instanceof desktop) {
                sp.xuatSp();
            }
        }
        System.out.println("+------------------------------------------------------+");
    }

    public void xuatDsLaptop() {
        System.out.println("+------------------------------------------------------+");
        System.out.println("|                        Laptop                        |");
        System.out.println("+------------------------------------------------------+");
        System.out.println("|    ID    |   Ten desktop   | So luong |   Gia tien   |");
        System.out.println("+------------------------------------------------------+");

        for (sanPham sp : arr_sp) {
            if (sp instanceof laptop) {
                sp.xuatSp();
            }
        }
        System.out.println("+------------------------------------------------------+");
    }

    public static void main(String[] args) {
        dsSanPham test = new dsSanPham();
        test.taoDsCoSan();
        test.xuatDsDesktop();
        test.xuatDsLaptop();
    }
}