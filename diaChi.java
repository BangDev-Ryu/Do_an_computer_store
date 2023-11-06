import java.util.Scanner;
public class diaChi {
    private String soNha;
    private String tenDuong;
    private String tenQuan;
    private String tenTinh;

    Scanner sc = new Scanner(System.in);

    public diaChi(String soNha, String tenDuong, String tenQuan, String tenTinh) {
        this.soNha = soNha;
        this.tenDuong = tenDuong;
        this.tenQuan = tenQuan;
        this.tenTinh = tenTinh;
    }

    public diaChi() {
    }

    public String getSoNha() {
        return soNha;
    }

    public String getTenDuong() {
        return tenDuong;
    }

    public String getTenQuan() {
        return tenQuan;
    }

    public String getTenTinh() {
        return tenTinh;
    }

    public void setTenDuong(String tenDuong) {
        this.tenDuong = tenDuong;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public void setTenQuan(String tenQuan) {
        this.tenQuan = tenQuan;
    }

    public void setTenTinh(String tenTinh) {
        this.tenTinh = tenTinh;
    }
    public void nhap(){
        System.out.println("Nhap so nha: ");
        soNha = sc.nextLine();
        System.out.println("Nhap ten duong: ");
        tenDuong = sc.nextLine();
        System.out.println("Nhap ten quan: ");
        tenQuan = sc.nextLine();
        System.out.println("Nhập ten tinh");
    }
    public void xuat(){
        System.out.println(soNha+", duong "+tenDuong+", quan "+tenQuan+", tinh "+tenTinh);
    }
    @Override
    public String toString() {
        return
                "soNha=" + soNha + '\'' +
                ", tenDuong='" + tenDuong + '\'' +
                ", tenQuan='" + tenQuan + '\'' +
                ", tenTinh='" + tenTinh + '\''

                ;
    }

    public static void main(String[] args) {
        diaChi dc = new diaChi();
        dc.nhap();
        dc.xuat();
        System.out.println(dc);
    }
}
