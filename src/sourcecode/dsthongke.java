import java.util.ArrayList;

public class dsthongke {
    ArrayList<thongke> arr_tk = new ArrayList<>();

    dsthongke() {
    }

    public void tangsoluongsanphamban(int thang, int nam, int sl) {
        for (thongke tk : arr_tk) {
            if (tk.d.getThang() == thang && tk.d.getNam() == nam) {
                tk.setSoluongsanphamban(tk.getSoluongsanphamban() + sl);
                return;
            }
        }
        thongke tk = new thongke();
        tk.d.setThang(thang);
        tk.d.setNam(nam);
        tk.setSoluongsanphamban(sl);
        arr_tk.add(tk);
    }

    public void tangsoluongsanphamnhap(int thang, int nam, int sl) {
        for (thongke tk : arr_tk) {
            if (tk.d.getThang() == thang && tk.d.getNam() == nam) {
                tk.setSoluongsanphamnhap(tk.getSoluongsanphamnhap() + sl);
                return;
            }
        }
        thongke tk = new thongke();
        tk.d.setThang(thang);
        tk.d.setNam(nam);
        tk.setSoluongsanphamnhap(sl);
        arr_tk.add(tk);
    }

    public void giamsoluongsanphamnhap(int thang, int nam, int sl) {
        for (thongke tk : arr_tk) {
            if (tk.d.getThang() == thang && tk.d.getNam() == nam) {
                tk.setSoluongsanphamnhap(tk.getSoluongsanphamnhap() - sl);
                return;
            }
        }
    }

    public void tangsoluongphieunhap(int thang, int nam) {
        for (thongke tk : arr_tk) {
            if (tk.d.getThang() == thang && tk.d.getNam() == nam) {
                tk.setSoluongphhieunhap(tk.getSoluongphhieunhap() + 1);
                return;
            }
        }
        thongke tk = new thongke();
        tk.d.setThang(thang);
        tk.d.setNam(nam);
        tk.setSoluongphhieunhap(1);
        arr_tk.add(tk);
    }

    public void tangsoluonghoadon(int thang, int nam) {
        for (thongke tk : arr_tk) {
            if (tk.d.getThang() == thang && tk.d.getNam() == nam) {
                tk.setSoluonghoadon(tk.getSoluonghoadon() + 1);
                return;
            }
        }
        thongke tk = new thongke();
        tk.d.setThang(thang);
        tk.d.setNam(nam);
        tk.setSoluonghoadon(1);
        arr_tk.add(tk);
    }

    public void xuatDSTK(int thang, int nam) {
        for (thongke tk : arr_tk) {
            if (tk.d.getThang() == thang && tk.d.getNam() == nam) {
                System.out.println("+------------------------------------------------------------+");
                System.out.println("Trong thang " + tk.d.getThang() + " nam " + tk.d.getNam());
                System.out.println("So luong san pham da nhap:" + tk.getSoluongsanphamnhap());
                System.out.println("So luong sam pham da ban:" + tk.getSoluongsanphamban());
                System.out.println("tong phieu nhap da nhap:" + tk.getSoluongphhieunhap());
                System.out.println("tong hoa don da xuat:" + tk.getSoluonghoadon());
                System.out.println("+------------------------------------------------------------+");
                System.out.println(
                        "=========================================================================");
                return;
            }
        }
        System.out.println("Khong co giao dich vao " + thang + "/" + nam);

    }

}
