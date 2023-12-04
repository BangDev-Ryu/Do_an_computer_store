import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

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

    public String getTenSanPham(String id) {
        for (sanPham sp : arr_sp) {
            if (sp instanceof desktop && sp.getIdSp().equals(id)) {
                return sp.getTenSp();
            }
            else if (sp instanceof laptop && sp.getIdSp().equals(id)) {
                return sp.getTenSp();
            }
        }
        return null;
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
        int soLuongMoi = checkLoi.checkSoLuong();

        for (sanPham sp : arr_sp) {
            if (sp.getIdSp().equals(id)) {
                sp.setSoLuong(soLuongMoi);
                return;
            }
        }
    }

    public void doiGiaTienSanPham(String id) {
        System.out.println("Nhap gia tien muon doi: ");
        double giaTienMoi = checkLoi.checkGiaTien();

        for (sanPham sp : arr_sp) {
            if (sp.getIdSp().equals(id)) {
                sp.setGiaTien(giaTienMoi);
                return;
            }
        }
    }

    public void xoaSanPham(String id) {
        Iterator<sanPham> it = arr_sp.iterator();
        while (it.hasNext()) {
            sanPham sp = it.next();
            if (sp.getIdSp().equals(id)) {
                arr_sp.remove(sp);
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

    public void themSanPhamMoi(String id, int sl) {
        if (id.substring(0,2).equals("DE")) {
            desktop desk = new desktop(id, sl);
            desk.setIdSp(desk.getIdSp().substring(2));
            System.out.println("Nhap ten san pham: ");
            String tenDesk = checkLoi.checkRong();
            System.out.println("Nhap gia tien: ");
            double giaDesk = checkLoi.checkGiaTien();
            desk.setTenSp(tenDesk);
            desk.setGiaTien(giaDesk);
            arr_sp.add(desk);
            return;
        }
        else if (id.substring(0,2).equals("LA")) {
            laptop lap = new laptop(id, sl);
            lap.setIdSp(lap.getIdSp().substring(2));
            System.out.println("Nhap ten san pham: ");
            String tenLap = checkLoi.checkRong();
            System.out.println("Nhap gia tien: ");
            double giaLap = checkLoi.checkGiaTien();
            lap.setTenSp(tenLap);
            lap.setGiaTien(giaLap);
            arr_sp.add(lap);
            return;
        }
        
    }

    public void themSanPham(sanPham sPham) {
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

    public void themSanPham(String id, int sl) {
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

    public void giamSoLuongSanPham(sanPham sPham) {
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

    public void giamSoLuongSanPham(String id, int sl) {
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

    public double getDonGia(String id) {
        for (sanPham sp : arr_sp) {
            if (sp.getIdSp().equals(id)) {
                return sp.getGiaTien();
            }
        }
        return 0;
    }

    public void taoDsCoSan() {
        desktop d1 = new desktop("001", "desk1", 10, 2000);
        desktop d2 = new desktop("002", "desk2", 7, 3000);
        desktop d3 = new desktop("003", "desk3", 2, 13000);
        desktop d4 = new desktop("004", "desk4", 5, 7000);
        desktop d5 = new desktop("005", "desk5", 15, 1000);
        laptop l1 = new laptop("001", "lap1", 4, 3000);
        laptop l2 = new laptop("002", "lap2", 9, 10000);
        laptop l3 = new laptop("003", "lap3", 12, 2000);
        laptop l4 = new laptop("004", "lap4", 10, 13000);
        laptop l5 = new laptop("005", "lap5", 7, 7000);
        themSanPham(d1);
        themSanPham(d2);
        themSanPham(d3);
        themSanPham(d4);
        themSanPham(d5);
        themSanPham(l1);
        themSanPham(l2);
        themSanPham(l3);
        themSanPham(l4);
        themSanPham(l5);
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

    public int tongSanPham() {
        int sum = 0;
        for (sanPham sp : arr_sp) {
            sum += sp.getSoLuong();
        }
        return sum;
    }

    public int tongDesktop() {
        int sum = 0;
        for (sanPham sp : arr_sp) {
            if (sp instanceof desktop) {
                sum += sp.getSoLuong();
            }
        }
        return sum;
    }

    public int tongLaptop() {
        int sum = 0;
        for (sanPham sp : arr_sp) {
            if (sp instanceof laptop) {
                sum += sp.getSoLuong();
            }
        }
        return sum;
    }
}