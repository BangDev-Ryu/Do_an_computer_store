import java.util.Scanner;
public class khachHang {
    private String idKhach;
    private String tenKhach;
    private String sdt;
    diaChi dc;

    Scanner sc = new Scanner(System.in);
    public khachHang(String idKhach, String tenKhach, String sdt, diaChi dc) {
        this.idKhach = idKhach;
        this.tenKhach = tenKhach;
        this.sdt = sdt;
        this.dc = dc;
    }
    
    public khachHang() {
    }

    public String getTenKhach() {
        return tenKhach;
    }

    public diaChi getDc() {
        return dc;
    }

    public String getidKhach() {
        return idKhach;
    }

    public String getSdt() {
        return sdt;
    }

    public void setTenKhach(String tenKhach) {
        this.tenKhach = tenKhach;
    }

    public void setidKhach(String idKhach) {
        this.idKhach = idKhach;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setDc(diaChi dc) {
        this.dc = dc;
    }
    public void nhap(){
        dc = new diaChi();
        System.out.println("Nhap id khach hang");
        idKhach = sc.nextLine();
        System.out.println("Nhap ten khach hang");
        tenKhach =sc.nextLine();
        System.out.println("Nhap sdt khach hang");
        sdt = sc.nextLine();
        System.out.println("Nhap dia chi khach hang");
        dc.nhap();
    }
    public void xuat(){
        System.out.println("Id: "+idKhach+" ten: "+ tenKhach+" so dien thoai: "+sdt+" dia chi "+dc);
    }
    @Override
    public String toString() {
        return "Id: "+idKhach+" ten: "+ tenKhach+" so dien thoai: "+sdt+" dia chi "+dc;
    }
}
