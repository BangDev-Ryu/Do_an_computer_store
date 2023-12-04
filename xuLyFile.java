import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class xuLyFile {
    private static String sanPhamFilePath = "C:/Workspace/School/OOP/DoAn_temp/src/sourcefile/sanPham.txt";
    private static String khachHangFilePath = "C:/Workspace/School/OOP/DoAn_temp/src/sourcefile/khachHang.txt";
    private static String nhaCungCapFilePath = "C:/Workspace/School/OOP/DoAn_temp/src/sourcefile/nhaCungCap.txt";
    private static String hoaDonFilePath = "C:/Workspace/School/OOP/DoAn_temp/src/sourcefile/hoaDon.txt";
    private static String phieuNhapFilePath = "C:/Workspace/School/OOP/DoAn_temp/src/sourcefile/phieuNhap.txt";

    public static ArrayList<sanPham> readSanPham(ArrayList<sanPham> arr) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(sanPhamFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                if (parts[0].substring(0,2).equals("DE")) {
                    arr.add(new desktop(parts[0].substring(2), parts[1], Integer.parseInt(parts[2]), Double.parseDouble(parts[3])));
                }
                else if (parts[0].substring(0,2).equals("LA")) {
                    arr.add(new laptop(parts[0].substring(2), parts[1], Integer.parseInt(parts[2]), Double.parseDouble(parts[3])));
                }
            }
            return arr;
        }
    }

    public static void writeSanPham(ArrayList<sanPham> arr) throws IOException  {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(sanPhamFilePath))) {
            for (sanPham sp : arr) {
                writer.write(sp.toString());
                writer.write("\n");
            }
        }
    }

    public static ArrayList<khachHang> readKhachHang(ArrayList<khachHang> arr) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(khachHangFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                arr.add(new khachHang(parts[0], parts[1], parts[2], new diaChi(parts[3], parts[4], parts[5], parts[6])));
            }
            return arr;
        }
    }

    public static void writeKhachHang(ArrayList<khachHang> arr) throws IOException  {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(khachHangFilePath))) {
            for (khachHang kh : arr) {
                writer.write(kh.toString());
                writer.write("\n");
            }
        }
    }

    public static ArrayList<nhaCungCap> readNhaCungCap(ArrayList<nhaCungCap> arr) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(nhaCungCapFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                arr.add(new nhaCungCap(parts[0], parts[1], parts[2], parts[3]));
            }
            return arr;
        }
    }

    public static void writeNhaCungCap(ArrayList<nhaCungCap> arr) throws IOException  {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nhaCungCapFilePath))) {
            for (nhaCungCap ncc : arr) {
                writer.write(ncc.toString());
                writer.write("\n");
            }
        }
    }

    public static ArrayList<hoaDon> readHoaDon(ArrayList<hoaDon> arr) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(hoaDonFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("[, -]+");
                arr.add(new hoaDon(parts[0], parts[1], new date(Integer.parseInt(parts[2]), Integer.parseInt(parts[3]), Integer.parseInt(parts[4])), Double.parseDouble(parts[5])));
            }
            return arr;
        }
    }

    public static void writeHoaDon(ArrayList<hoaDon> arr) throws IOException  {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(hoaDonFilePath))) {
            for (hoaDon hd : arr) {
                writer.write(hd.toString());
                writer.write("\n");
            }
        }
    }

    public static ArrayList<phieuNhap> readPhieuNhap(ArrayList<phieuNhap> arr) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(phieuNhapFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                arr.add(new phieuNhap(parts[0], parts[1], new date(Integer.parseInt(parts[2]), Integer.parseInt(parts[3]), Integer.parseInt(parts[4])), Double.parseDouble(parts[5])));
            }
            return arr;
        }
    }

    public static void writePhieuNhap(ArrayList<phieuNhap> arr) throws IOException  {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(phieuNhapFilePath))) {
            for (phieuNhap pn : arr) {
                writer.write(pn.toString());
                writer.write("\n");
            }
        }
    }
}