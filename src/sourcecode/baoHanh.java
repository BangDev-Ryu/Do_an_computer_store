import java.util.Scanner;

public class baoHanh {
    Scanner sc = new Scanner(System.in);

    private String idBH;
    private String idCTHD;
    private date ngayMua = new date();
    private date ngayKt = new date();
    private int phi;
    private int tgBh;

    public baoHanh() {
        
    }
    
    public baoHanh(String idBH, int tgBh) {
        this.idBH = idBH;
        this.tgBh = tgBh;
    }

    public baoHanh(String idBH, String idCTHD ,date ngayMua, date ngayKt, int phi, int tgBh) {
        this.idBH = idBH;
        this.idCTHD = idCTHD;
        this.ngayMua = ngayMua;
        this.ngayKt = ngayKt;
        this.phi = phi;
        this.tgBh = tgBh;
    }

    public String getIdBH() {
        return idBH;
    }

    public String getIdCTHD() {
        return idCTHD;
    }

    public date getNgayMua() {
        return ngayMua;
    }

    public date getNgayKt() {
        return ngayKt;
    }

    public void setIdBH(String idBH) {
        this.idBH = idBH;
    }

    public void setNgayMua(date ngayMua) {
        this.ngayMua = ngayMua;
    }

    public void setNgayKt(date ngayKt) {
        this.ngayKt = ngayKt;
    }

    public void setIdCTHD(String id) {
        idCTHD = id;
    }

    public int getPhi() {
        return phi;
    }

    public void setPhi(int phi) {
        this.phi = phi;
    }

    public int getTgBh() {
        return tgBh;
    }

    public void setTgBh(int tgBh) {
        this.tgBh = tgBh;
    }
    
    public void nhapBH() {
        System.out.print("Nhap id bao hanh: ");
        this.idBH=sc.nextLine();
        System.out.print("\nNhap ngay mua san pham: \n");
        this.ngayMua.nhap();
        System.out.print("Nhap thoi gian bao hanh: ");
        
        System.out.println("Nhap vao 1: 12 thang");
        System.out.println("Nhap vao 2: 24 thang");
        System.out.println("Nhap vao 3: 36 thang");
        int k;
        do{
            k=sc.nextInt();
            switch(k){
                case 1:{ 
                    this.tgBh = 12;
                    }  
                case 2:{ 
                    this.tgBh = 24;
                    break;
                }    
                case 3:{ 
                    this.tgBh = 36;
                    break;
                }    
            } 
        }
        while(k<1 || k>3);
        int y=this.ngayMua.getNam()+tgBh/12;
        this.ngayKt.setNgay(this.ngayMua.getNgay());
        this.ngayKt.setThang(this.ngayMua.getThang());
        this.ngayKt.setNam(y);
    }
    
    @Override
    public String toString() {
        return idBH + ", " + idCTHD + ", " + ngayMua + ", " + ngayKt + ", " + phi + ", " + tgBh;
    }
    
    public void xuatBH(){
        System.out.println("+------------------------------------------------------------------+");
        System.out.println("| ID bao hanh | Ngay mua hang | Ngay ket thuc | Thoi gian bao hanh |");
        System.out.println("+------------------------------------------------------------------+");

        String bh_format = "|   %-8s  |    %-10s |   %-10s  |      %-2s thang      | %n";
        
            System.out.format(bh_format, this.getIdBH(), this.getNgayMua(), this.getNgayKt(), this.getTgBh());
        
        System.out.println("+------------------------------------------------------------------+");
    }
}