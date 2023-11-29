import java.util.ArrayList;
import java.util.Scanner;

public class dsSanPham {  
    Scanner sc = new Scanner(System.in);

    ArrayList<sanPham> arr_sp = new ArrayList<>();

    public dsSanPham() {

    }

    // tim san pham theo id
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

    public sanPham getSanPham(String id) {
        for (sanPham sp : arr_sp) {
            if (sp instanceof desktop && sp.getIdSp().equals(id)) {
                return sp;
            }
            else if (sp instanceof laptop && sp.getIdSp().equals(id)) {
                return sp;
            }
        }
        return null;
    }

    // public laptop getSanPham(String id) {
    //     for (sanPham sp : arr_sp) {
    //         if (sp instanceof laptop && sp.getIdSp().equals(id)) {
    //             return sp;
    //         }
    //     }
    // }

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

    // check xem san pham co ton tai trong danh sach san pham hay khong
    public boolean tonTaiSanPham(String id) {
        for (sanPham sp : arr_sp) {
            if (sp.getIdSp().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public boolean duSoLuongSanPham(String id, int sl) {
        for (sanPham sp : arr_sp) {
            if (sp.getIdSp().equals(id) && sp.getSoLuong() >= sl) {
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

    public void themSanPhamTuPhieuNhap(String id, int sl) {
        if (tonTaiSanPham(id)) {
            for (sanPham sp : arr_sp) {
                if (sp.getIdSp().equals(id)) {
                    sp.setSoLuong(sp.getSoLuong() + sl);
                    return;
                }
            }
        }
        else {
            arr_sp.add(getSanPham(id));
        }
    }

    public void xoaSanPhamTuHoaDon(sanPham sPham) {
        if (tonTaiSanPham(sPham.getIdSp())) {
            for (sanPham sp : arr_sp) {
                if (sp.getIdSp().equals(sPham.getIdSp())) {
                    if (sp.getSoLuong() < sPham.getSoLuong()) {
                        System.out.println("San pham hien tai khong du so luong");
                        return;
                    }
                    else {
                        sp.setSoLuong(sp.getSoLuong() - sPham.getSoLuong());
                        return;
                    }
                }
            }
        }
        else {
            System.out.println("San pham khong ton tai!");
        }
    }

    public void xoaSanPhamTuHoaDon(String id, int sl) {
        if (tonTaiSanPham(id)) {
            for (sanPham sp : arr_sp) {
                if (sp.getIdSp().equals(id)) {
                    if (sp.getSoLuong() < sl) {
                        System.out.println("San pham hien tai khong du so luong");
                        return;
                    }
                    else {
                        sp.setSoLuong(sp.getSoLuong() - sl);
                        return;
                    }
                }
            }
        }
        else {
            System.out.println("San pham khong ton tai!");
        }
    }

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
}