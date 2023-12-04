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
        soNha = checkLoi.checkDiaChi();
        System.out.println("Nhap ten duong: ");
        tenDuong = checkLoi.checkDiaChi();
        System.out.println("Nhap ten quan: ");
        tenQuan = checkLoi.checkDiaChi();
        System.out.println("Nhap ten tinh: ");
        tenTinh = checkLoi.checkDiaChi();
    }
    public void xuat(){
        System.out.println(soNha+", "+tenDuong+", Q"+tenQuan+", "+tenTinh);
    }
    @Override
    public String toString() {
        return 
            soNha + ", " +
            tenDuong + ", Q" +
            tenQuan + ", " +
            tenTinh;
    }
}
