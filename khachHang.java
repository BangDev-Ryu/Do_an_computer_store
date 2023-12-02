import java.util.Scanner;
public class khachHang {
    Scanner sc = new Scanner(System.in);
    
    private String idKhach;
    private String tenKhach;
    private String sdt;
    private diaChi dc = new diaChi();
    private static int cntIdKH = 0;

    public khachHang() {
        idKhach = "KH" + cntIdKH;
        cntIdKH++;
    }

    public khachHang(String idKhach, String tenKhach, String sdt, diaChi dc) {
        this.idKhach = idKhach;
        this.tenKhach = tenKhach;
        this.sdt = sdt;
        this.dc = dc;
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
        System.out.println("Nhap ten khach hang");
        tenKhach = checkLoi.checkTenKhachHang();
        System.out.println("Nhap sdt khach hang");
        sdt = checkLoi.checkDiaChi();
        System.out.println("Nhap dia chi khach hang");
        dc.nhap();
    }

    public void xuatKH(){
        System.out.println("+-------------------------------------------------------------------------------------+");
        System.out.println("| ID khach |          Ho ten          |     SDT     |             Dia chi             |");
        System.out.println("+-------------------------------------------------------------------------------------+");

        String khach_format = "| %-8s | %-24s | %-11s | %-31s | %n";
        
    }

    public String toString() {
        return "Id: "+idKhach+" ten: "+ tenKhach+" so dien thoai: "+sdt+" dia chi "+dc;
    }
}
