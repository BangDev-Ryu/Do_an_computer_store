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

    public int ktngay(int n) {

        if (n < 1 || n > 31) {
            return 0;
        }
        return 1;

    }

    public int ktthang(int n) {

        if (n < 1 || n > 12) {
            return 0;
        }
        return 1;

    }

    public int ktnam(int n) {

        if (n < 1 || n > 9999) {
            return 0;
        }
        return 1;

    }

    public void nhap() {
        System.out.println("Nhap ngay:");
        ngay = sc.nextInt();
        if (ktngay(ngay) == 0) {
            System.out.println("nhap sai ngay");
            return;
        }
        System.out.println("Nhap thang:");
        if (ktthang(thang) == 0) {
            System.out.println("nhap sai thang");
            return;
        }
        thang = sc.nextInt();
        ktthang(thang);
        System.out.println("Nhap nam:");
        if (ktnam(nam) == 0) {
            System.out.println("nhap sai nam");
            return;
        }
        ktnam(nam);
        nam = sc.nextInt();
    }

    public void xuat() {
        System.out.println(ngay + "-" + thang + "-" + nam);
    }

    public String toString() {
        return ngay + "-" + thang + "-" + nam;
    }

}
