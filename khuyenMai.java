/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doan;

import java.util.Scanner;
/**
 *
 * @author TrongPhuc
 */
public class khuyenMai {
    public String tenKM;
    public String idKM;
    public date ngayBD;
    public date ngayKT;
    public int tongKM;
    Scanner sc=new Scanner(System.in);

    public void Nhap() {
        System.out.println("Nhap ten Khuyen mai");
        this.tenKM = sc.nextLine();
        System.out.println("Nhap id Khuyen mai");
        this.idKM = sc.nextLine();
        System.out.println("Nhap ngay bat dau");
        //this.ngayBD = ;
        System.out.println("Nhap ngay ket thuc");
        //this.ngayKT = ;
        System.out.println("Nhap tong khuyen mai");
        this.tongKM = sc.nextInt();
    }

    public khuyenMai() {
        this.tenKM = null;
        this.idKM = null;
        this.ngayBD = new date() ;
        this.ngayKT = new date();
        this.tongKM = 0;
    }
    
    public khuyenMai(String tenKM, String idKM, date ngayBD, date ngayKT, int tongKM) {
        this.tenKM = tenKM;
        this.idKM = idKM;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
        this.tongKM = tongKM;
    }

    public String getTenKM() {
        return tenKM;
    }

    public String getIdKM() {
        return idKM;
    }

    public date getNgayBD() {
        return ngayBD;
    }

    public date getNgayKT() {
        return ngayKT;
    }

    public int getTongKM() {
        return tongKM;
    }

    public void setTenKM(String tenKM) {
        this.tenKM = tenKM;
    }

    public void setIdKM(String idKM) {
        this.idKM = idKM;
    }

    public void setNgayBD(date ngayBD) {
        this.ngayBD = ngayBD;
    }

    public void setNgayKT(date ngayKT) {
        this.ngayKT = ngayKT;
    }

    public void setTongKM(int tongKM) {
        this.tongKM = tongKM;
    }
    
    public void xuat(){
        System.out.println("id khuyen mai: "+this.idKM);
        System.out.println("ten khuyen mai: "+this.tenKM);
        System.out.println("ngay bat dau: "+this.ngayBD);
        System.out.println("ngay ket thuc: "+this.ngayKT);
        System.out.println("tong khuyen mai: "+this.tongKM);
    }
    
    @Override
    public String toString() {
        return "khuyenMai{" + "tenKM=" + tenKM + ", idKM=" + idKM + ", ngayBD=" + ngayBD + ", ngayKT=" + ngayKT + ", tongKM=" + tongKM + '}';
    }
     public static void main(String[] args){
        
    }
}
