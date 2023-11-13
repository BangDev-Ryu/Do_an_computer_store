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
public class baoHiem {
    public String idBaoHiem;
    public String tgianBaoHiem;
    public int tienBaoHiem;
    Scanner sc=new Scanner(System.in);
    
    public void Nhap() {
        System.out.println("Nhap id bao hiem");
        this.idBaoHiem=sc.nextLine();
        
        System.out.println("Nhap toi gian bao hiem");
        this.tgianBaoHiem=sc.nextLine();
        
        System.out.println("Nhap tien bao hiem");
        this.tienBaoHiem=sc.nextInt();
    }
    
    public baoHiem() {
        this.idBaoHiem = null;
        this.tgianBaoHiem = null;
        this.tienBaoHiem = 0;
    }

    public baoHiem(String idBaoHiem, String tgianBaoHiem, int tienBaoHiem) {
        this.idBaoHiem = idBaoHiem;
        this.tgianBaoHiem = tgianBaoHiem;
        this.tienBaoHiem = tienBaoHiem;
    }

    public String getIdBaoHiem() {
        return idBaoHiem;
    }

    public String getTgianBaoHiem() {
        return tgianBaoHiem;
    }

    public int getTienBaoHiem() {
        return tienBaoHiem;
    }

    public void setIdBaoHiem(String idBaoHiem) {
        this.idBaoHiem = idBaoHiem;
    }

    public void setTgianBaoHiem(String tgianBaoHiem) {
        this.tgianBaoHiem = tgianBaoHiem;
    }

    public void setTienBaoHiem(int tienBaoHiem) {
        this.tienBaoHiem = tienBaoHiem;
    }
    public void xuat(){
        System.out.println("id bao hiem: "+this.idBaoHiem);
        System.out.println("thoi gian bao hiem: "+this.tgianBaoHiem);
        System.out.println("tien bao hiem: "+this.tienBaoHiem);
    }
    @Override
    public String toString() {
        return "baoHiem{" + "idBaoHiem=" + idBaoHiem + ", tgianBaoHiem=" + tgianBaoHiem + ", tienBaoHiem=" + tienBaoHiem + '}';
    }
     public static void main(String[] args){
        
    }
}
