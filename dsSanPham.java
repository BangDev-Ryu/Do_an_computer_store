import java.util.ArrayList;
import java.util.Scanner;

public class dsSanPham {  
    Scanner sc = new Scanner(System.in);

    ArrayList<sanPham> arr_sp = new ArrayList<>();

    public dsSanPham() {

    }

    // public desktop getSanPham(String id) {
    //     for (sanPham sp : arr_sp) {
    //         if (sp instanceof desktop && sp.getIdSp().equals(id)) {
    //             return sp;
    //         }
    //     }
    //     return null;
    // }

    // public laptop getSanPham(String id) {
    //     for (sanPham sp : arr_sp) {
    //         if (sp instanceof laptop && sp.getIdSp().equals(id)) {
    //             return sp;
    //         }
    //     }
    //     return null;
    // }

    public void timSanPham(String id) {
        for (sanPham sp : arr_sp) {
            if (sp instanceof desktop && sp.getIdSp().equals(id)) {
                System.out.println("+------------------------------------------------------+");
                System.out.println("|                       Desktop                        |");
                System.out.println("+------------------------------------------------------+");
                System.out.println("|    ID    |   Ten desktop   | So luong |   Gia tien   |");
                System.out.println("+------------------------------------------------------+");
                sp.xuatSp();
                System.out.println("+------------------------------------------------------+");
                return;
            }
            else if (sp instanceof laptop && sp.getIdSp().equals(id)) {
                System.out.println("+------------------------------------------------------+");
                System.out.println("|                        Laptop                        |");
                System.out.println("+------------------------------------------------------+");
                System.out.println("|    ID    |   Ten desktop   | So luong |   Gia tien   |");
                System.out.println("+------------------------------------------------------+");
                sp.xuatSp();
                System.out.println("+------------------------------------------------------+");
                return;
            }
        }
    }

    public void doiTenSanPham(String id) {
        System.out.println("Nhap ten muon sua thanh: ");
        String tenSpMoi = sc.nextLine();

        for (sanPham sp : arr_sp) {
            if (sp.getIdSp().equals(id)) {
                sp.setTenSp(tenSpMoi);
                return;
            }
        }
    }

    public void doiSoLuongSanPham(String id) {
        System.out.println("Nhap so luong muon sua: ");
        int soLuongMoi = sc.nextInt();

        for (sanPham sp : arr_sp) {
            if (sp.getIdSp().equals(id)) {
                sp.setSoLuong(soLuongMoi);
                return;
            }
        }
    }

    public void doiGiaTienSanPham(String id) {
        System.out.println("Nhap gia tien muon doi: ");
        double giaTienMoi = sc.nextDouble();

        for (sanPham sp : arr_sp) {
            if (sp.getIdSp().equals(id)) {
                sp.setGiaTien(giaTienMoi);
                return;
            }
        }
    }

    public boolean tonTaiSanPham(String id) {
        for (sanPham sp : arr_sp) {
            if (sp instanceof desktop && sp.getIdSp().equals(id)) {
                return true;
            } 
            else if (sp instanceof laptop && sp.getIdSp().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public void themSanPhamTuPhieuNhap(sanPham sPham) {
        if (tonTaiSanPham(sPham.getIdSp())) {
            for (sanPham sp : arr_sp) {
                if (sp.getIdSp().equals(sPham.getIdSp())) {
                    sp.setSoLuong(sp.getSoLuong() + sPham.getSoLuong());
                    return;
                }
            }
        }
        else {
            arr_sp.add(sPham);
        }
    }

    // public boolean tonTaiDesktop(String id) {
    //     for (sanPham sp : arr_sp) {
    //         if (sp instanceof desktop && sp.getIdSp().equals(id)) {
    //             return true;
    //         } 
    //     }
    //     return false;
    // }

    // public void themDesktop(desktop desk) {
    //     if (tonTaiDesktop(desk.getIdSp())) {
    //         for (sanPham sp : arr_sp) {
    //             if (sp instanceof desktop && sp.getIdSp().equals(desk.getIdSp())) {
    //                 sp.setSoLuong(sp.getSoLuong()+desk.getSoLuong());
    //                 return;
    //             } 
    //         }
    //     }
    //     else {
    //         arr_sp.add(desk);
    //         return;
    //     }
    // }

    // public boolean tonTaiLaptop(String id) {
    //     for (sanPham sp : arr_sp) {
    //         if (sp instanceof laptop && sp.getIdSp().equals(id)) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // public void themLaptop(laptop lap) {
    //     if (tonTaiLaptop(lap.getIdSp())) {
    //         for (sanPham sp : arr_sp) {
    //             if (sp instanceof laptop && sp.getIdSp().equals(lap.getIdSp())) {
    //                 sp.setSoLuong(sp.getSoLuong()+lap.getSoLuong());
    //                 return;
    //             }
    //         }
    //     }
    //     else {
    //         arr_sp.add(lap);
    //         return;
    //     }
    // }

    public void taoDsCoSan() {
        desktop s0 = new desktop("001", "desk1", 1, 2000);
        desktop s1 = new desktop("002", "desk2", 2, 3000);
        laptop s2 = new laptop("001", "lap1", 1, 2000);
        desktop s3 = new desktop("001", 3);
        laptop s4 = new laptop("001", 2);
        themSanPhamTuPhieuNhap(s0);
        themSanPhamTuPhieuNhap(s1);
        themSanPhamTuPhieuNhap(s3);
        themSanPhamTuPhieuNhap(s2);
        themSanPhamTuPhieuNhap(s4);
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
        dsSanPham tmp = new dsSanPham();
        tmp.taoDsCoSan();
        tmp.xuatDsDesktop();
        tmp.xuatDsLaptop();
    }
}