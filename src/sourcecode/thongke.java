import java.util.Scanner;

public class thongke {

    date d = new date();
    private int soluongsanphamnhap;
    private int soluongsanphamban;
    private int soluongphhieunhap;
    private int soluonghoadon;
    Scanner sc = new Scanner(System.in);

    public thongke() {
    }

    public thongke(date d, int soluongsanphamnhap, int soluongsanphamban, int soluongphhieunhap, int soluonghoadon) {
        this.d = d;
        this.soluongsanphamnhap = soluongsanphamnhap;
        this.soluongsanphamban = soluongsanphamban;
        this.soluongphhieunhap = soluongphhieunhap;
        this.soluonghoadon = soluonghoadon;
    }

    public date getD() {
        return d;
    }

    public void setD(date d) {
        this.d = d;
    }

    public int getSoluongsanphamnhap() {
        return soluongsanphamnhap;
    }

    public void setSoluongsanphamnhap(int soluongsanphamnhap) {
        this.soluongsanphamnhap = soluongsanphamnhap;
    }

    public int getSoluongsanphamban() {
        return soluongsanphamban;
    }

    public void setSoluongsanphamban(int soluongsanphamban) {
        this.soluongsanphamban = soluongsanphamban;
    }

    public int getSoluongphhieunhap() {
        return soluongphhieunhap;
    }

    public void setSoluongphhieunhap(int soluongphhieunhap) {
        this.soluongphhieunhap = soluongphhieunhap;
    }

    public int getSoluonghoadon() {
        return soluonghoadon;
    }

    public void setSoluonghoadon(int soluonghoadon) {
        this.soluonghoadon = soluonghoadon;
    }

    public void nhap() {
        System.out.println("Nhap thang:");
        d.setThang(sc.nextInt());
        System.out.println("Nhap nam:");
        d.setNam(sc.nextInt());
    }

    @Override
    public String toString() {
        return "thongke [d=" + d + ", soluongsanphamnhap=" + soluongsanphamnhap + ", soluongsanphamban="
                + soluongsanphamban + ", soluongphhieunhap=" + soluongphhieunhap + ", soluonghoadon=" + soluonghoadon
                + "]";
    }

}