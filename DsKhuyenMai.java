
package doan; 

import java.util.Arrays;
import java.util.Scanner;

public class dsKhuyenMai {
    public int n;
    khuyenMai [] arr;
    Scanner sc=new Scanner(System.in);
    public dsKhuyenMai()
    {
        arr=null;
        n=0;
    }
public void nhapds() 
    {
        
        System.out.println("Nhap vao so luong phan tu:");
        n=sc.nextInt();
        arr=new khuyenMai[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhap vao phan tu thu:" +(i+1));
            
                khuyenMai a = new khuyenMai();
                a.Nhap();
                arr[i]=a;   
        }
    }
    public void timkiem()
    {
        System.out.println("Nhap vao id khuyen mai can tim:");
        String id=sc.nextLine();
        for(int i=0; i<arr.length; i++)
            if(arr[i].getIdKM().equalsIgnoreCase(id))
                arr[i].xuat();
            else
                System.out.println("khong tim thay");
    }
    public void them1()
    {
        System.out.println("Nhap thong tin khuyen mai can them:");
        khuyenMai a = new khuyenMai();
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
            if(arr[i].getIdKM().equalsIgnoreCase(ma))
                k=i;
        return k;           
    }
    public void sua(){
        System.out.println("Nhap vao id can sua:");
        String id=sc.nextLine();
        int k =this.timkiem1(id);
        khuyenMai a = new khuyenMai();
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
        dsKhuyenMai mang=new dsKhuyenMai();
        
        mang.nhapds();
        
    }
}

