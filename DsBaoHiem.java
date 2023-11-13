
package doan; 

import java.util.Arrays;
import java.util.Scanner;

public class DsBaoHiem {
    public int n;
    baoHiem [] arr;
    Scanner sc=new Scanner(System.in);
    public DsBaoHiem()
    {
        arr=null;
        n=0;
    }
public void nhapds() 
    {
        
        System.out.println("Nhap vao so luong phan tu:");
        n=sc.nextInt();
        arr=new baoHiem[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhap vao phan tu thu:" +(i+1));
            
                baoHiem a = new baoHiem();
                a.Nhap();
                arr[i]=a;   
        }
    }
    public void timkiem()
    {
        System.out.println("Nhap vao id bao hanh can tim:");
        String id=sc.nextLine();
        for(int i=0; i<arr.length; i++)
            if(arr[i].getIdBaoHiem().equalsIgnoreCase(id))
                arr[i].xuat();
            else
                System.out.println("khong tim thay");
    }
    public void them1()
    {
        System.out.println("Nhap thong tin bao hanh can them:");
        baoHiem a = new baoHiem();
        a.Nhap();
        arr= Arrays.copyOf(arr, arr.length +1);  
        arr[n]=a;
        n++;        
    }
    public void them()
    {
       
        System.out.println("Nhap vao so phan tu can them:");
        int k=sc.nextInt();
        for(int i=0;i<k;i++){
            this.them1();
        }
    }
    
    public int timkiem1(String ma)
    {
        int k=0;
        for(int i=0; i<this.arr.length; i++)
            if(arr[i].getIdBaoHiem().equalsIgnoreCase(ma))
                k=i;
        return k;           
    }
    public void sua(){
        System.out.println("Nhap vao id can sua:");
        String id=sc.nextLine();
        int k =this.timkiem1(id);
        baoHiem a = new baoHiem();
            a.Nhap();
            arr[k]=a;
    }
    public void xoa()// lỗi ko xoa dc
    {
        System.out.println("Nhap vao id can xoa:");
        String id=sc.nextLine();
        int k =this.timkiem1(id);
        for(int i=k; i<arr.length; i++)
                arr[i]=arr[i+1];
        n--;
    }
    public void xuatds(){
        for(int i=0;i<arr.length;i++){
            System.out.println("phan tu thu:"+(i+1));
            arr[i].xuat(); 
        }
        System.out.println("\n");
    }
    
    public static void main(String[] args) {
        DsBaoHiem mang=new DsBaoHiem();
        
        mang.nhapds();
        mang.xuatds();
        
    }
}

