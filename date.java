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
        do {
            System.out.println("Nhap ngay:");
            ngay = sc.nextInt();
            if (ktngay(ngay) == 0) {
                System.out.println("nhap sai ngay");
            }
        } while (ktngay(ngay) == 0);

        do {
            System.out.println("Nhap thang:");
            thang = sc.nextInt();
            if (ktthang(thang) == 0) {
                System.out.println("nhap sai thang");
            }
        } while (ktthang(thang) == 0);

        do {
            System.out.println("Nhap nam:");
            nam = sc.nextInt();
            if (ktnam(nam) == 0) {
                System.out.println("nhap sai nam");
            }
        } while (ktnam(nam) == 0);
    }

    public void xuat() {
        System.out.println(ngay + "-" + thang + "-" + nam);
    }

    public String toString() {
        return ngay + "-" + thang + "-" + nam;
    }

}
