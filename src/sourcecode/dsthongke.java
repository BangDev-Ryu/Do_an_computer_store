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
                String tGian_format =  "|   Thong ke thang %-2s-%-4s      | %n";
                String spNhap_format = "| So luong san pham da nhap: %-3s| %n";
                String spXuat_format = "| So luong san pham da ban: %-3s | %n";
                String pNhap_format = "| Tong phieu nhap da nhap: %-3s  | %n";
                String pXuat_format = "| Tong hoa don da xuat: %-3s     | %n";
                
                System.out.println("+-------------------------------+");
                System.out.format(tGian_format, tk.d.getThang(), tk.d.getNam());
                System.out.println("+-------------------------------+");
                System.out.format(spNhap_format, tk.getSoluongsanphamnhap());
                System.out.format(spXuat_format, tk.getSoluongsanphamban());
                System.out.format(pNhap_format, tk.getSoluongphhieunhap());
                System.out.format(pXuat_format, tk.getSoluonghoadon());
                System.out.println("+-------------------------------+");
                System.out.println("===================================================");
                return;
            }
        }
        System.out.println("Khong co giao dich vao " + thang + "/" + nam);

    }

}
