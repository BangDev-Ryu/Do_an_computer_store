import java.util.Scanner;

public class baoHanh {
    Scanner sc = new Scanner(System.in);

    public String idBH;
    public date ngayMua;
    public String tgianBh;

    
    public baoHanh() {
        this.idBH = null;
        this.ngayMua = new date();
        this.tgianBh = null;
    }

    public baoHanh(String idBH, date ngayMua, String tgianBh) {
        this.idBH = idBH;
        this.ngayMua = ngayMua;
        this.tgianBh = tgianBh;
    }

    public void Nhap() {
        System.out.print("Nhap id bao hanh: ");
        this.idBH=sc.nextLine();
        System.out.println();
        System.out.print("Nhap ngay mua san pham: ");
        this.ngayMua.nhap();
        System.out.println();
        System.out.print("Nhap thoi gian bao hanh: ");
        this.tgianBh=sc.nextLine();
        System.out.println();
    }

    public String getIdBH() {
        return idBH;
    }

    public date getNgayMua() {
        return ngayMua;
    }

    public String getTgianBh() {
        return tgianBh;
    }

    public void setIdBH(String idBH) {
        this.idBH = idBH;
    }

    public void setNgayMua(date ngayMua) {
        this.ngayMua = ngayMua;
    }

    public void setTgianBh(String tgianBh) {
        this.tgianBh = tgianBh;
    }

    @Override
    public String toString() {
        return "baoHanh{" + "idBH=" + idBH + ", ngayMua=" + ngayMua + ", tgianBh=" + tgianBh + '}';
    }

    public void xuat(){
        System.out.println("id bao hanh: "+this.idBH);
        System.out.println("ngay mua san pham: "+this.ngayMua);
        System.out.println("thoi gian bao hanh: "+this.tgianBh);
    }
}
