import java.util.Scanner;

public class date {
    private int ngay;
    private int thang;
    private int nam;
    Scanner sc = new Scanner(System.in);

    public date() {

    }

    public date(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public void nhap() {
        System.out.println("Nhap ngay:");
        ngay = sc.nextInt();
        System.out.println("Nhap thang:");
        thang = sc.nextInt();
        System.out.println("Nhap nam:");
        nam = sc.nextInt();
    }

    public void xuat() {
        System.out.println(ngay + "-" + thang + "-" + nam);
    }

    public String toString() {
        return ngay + "-" + thang + "-" + nam + ",";
    }

}
