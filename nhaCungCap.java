import java.util.Scanner;

public class nhaCungCap {

    private String idNCC;
    private String tenNCC;
    private String sdt;
    private String email;
    dsNhaCungCap dsncc = new dsNhaCungCap();
    Scanner sc = new Scanner(System.in);
    private static int cntIdNCC = 1;

    public nhaCungCap() {
        if (cntIdNCC < 10)
            idNCC = "CC00" + cntIdNCC;
        else if (cntIdNCC < 100)
            idNCC = "CC0" + cntIdNCC;
        else
            idNCC = "CC" + cntIdNCC;
        cntIdNCC++;
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
        System.out.println("Nhap ten nha cung cap:");
        tenNCC = checkLoi.checkTenNhaCungCap();
        System.out.println("Nhap so dien thoai nha cung cap:");
        sdt = checkLoi.checkSDT();
        System.out.println("Nhap email nha cung cap:");
        email = sc.nextLine();//checkLoi.checkEmail();
    }

    public void xuatNCC() {
        String ncc_format = "| %-10s | %-25s | %-11s | %-30s |%n";
        System.out.format(ncc_format, idNCC, tenNCC, sdt, email);
    }

    @Override
    public String toString() {
        return "id nha cung cap:" + idNCC + ", ten nha cung cap:" + tenNCC + ", so dien thoai nha cung cap:" + sdt
                + ", email nha cung cap:" + email + ",";
    }
}
