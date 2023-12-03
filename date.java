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

        if (n < 2000 || n > 2100) {
            return 0;
        }
        return 1;

    }

    public void nhap() {
        do {
            System.out.println("Nhap nam:");
            nam = checkLoi.checkSoNguyen();
            if (ktnam(nam) == 0) {
                System.out.println("Nam qua tre hoac qua som!");
            }
            System.out.println("Moi nhap lai: ");
        } while (ktnam(nam) == 0);

        do {
            System.out.println("Nhap thang:");
            thang = checkLoi.checkSoNguyen();
            if (ktthang(thang) == 0) {
                System.out.println("Thang khong hop le!");
            }
            System.out.println("Moi nhap lai: ");
        } while (ktthang(thang) == 0);

        do {
            System.out.println("Nhap ngay:");
            ngay = checkLoi.checkSoNguyen();
            if (ktngay(ngay) == 0) {
                if ((thang == 4 || thang == 6 || thang == 9 || thang == 11) && ngay == 31) {
                    System.out.println("Ngay khong hop li!");
                }
            }
            System.out.println("Moi nhap lai: ");
        } while (ktngay(ngay) == 0);
    }

    public void xuat() {
        System.out.println(ngay + "-" + thang + "-" + nam);
    }

    public String toString() {
        return ngay + "-" + thang + "-" + nam;
    }

}
