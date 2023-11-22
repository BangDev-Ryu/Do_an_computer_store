import java.util.Scanner;

public class nhaCungCap {

    private String idNCC;
    private String tenNCC;
    private String sdt;
    private String email;

    Scanner sc = new Scanner(System.in);

    public nhaCungCap() {

    }

    public nhaCungCap(String idNCC, String tenNCC, String sdt, String email) {
        this.idNCC = idNCC;
        this.tenNCC = tenNCC;
        this.sdt = sdt;
        this.email = email;
    }

    public String getIdNCC() {
        return idNCC;
    }

    public void setIdNCC(String idNCC) {
        this.idNCC = idNCC;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void nhap() {
        System.out.println("Nhap id nha cung cap:");
        idNCC = sc.nextLine();
        System.out.println("Nhap ten nha cung cap:");
        tenNCC = sc.nextLine();
        System.out.println("Nhap so dien thoai nha cung cap:");
        sdt = sc.nextLine();
        System.out.println("Nhap email nha cung cap:");
        email = sc.nextLine();
    }

    public void xuat() {
        System.out.println("id nha cung cap:" + idNCC);

        System.out.println("ten nha cung cap:" + tenNCC);

        System.out.println("so dien thoai nha cung cap:" + sdt);

        System.out.println("email nha cung cap:" + email);

    }

    @Override
    public String toString() {
        return "id nha cung cap:" + idNCC + ", ten nha cung cap:" + tenNCC + ", so dien thoai nha cung cap:" + sdt
                + ", email nha cung cap:" + email + ",";
    }

    public static void main(String[] args) {
        nhaCungCap a = new nhaCungCap();
        a.nhap();
        System.out.println(a);
    }
}
