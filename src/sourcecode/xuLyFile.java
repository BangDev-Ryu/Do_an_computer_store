import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class xuLyFile {
    private static String sanPhamFilePath = "src/sourcefile/sanPham.txt";
    private static String khachHangFilePath = "src/sourcefile/khachHang.txt";
    private static String nhaCungCapFilePath = "src/sourcefile/nhaCungCap.txt";
    private static String hoaDonFilePath = "src/sourcefile/hoaDon.txt";
    private static String chiTietHoaDonFilePath = "src/sourcefile/chiTietHoaDon.txt";
    private static String phieuNhapFilePath = "src/sourcefile/phieuNhap.txt";
    private static String chiTietPhieuNhapFilePath = "src/sourcefile/chiTietPhieuNhap.txt";
    private static String baoHanhFilePath = "src/sourcefile/baoHanh.txt";

    public static ArrayList<sanPham> readSanPham(ArrayList<sanPham> arr) {
        try (BufferedReader reader = new BufferedReader(new FileReader(sanPhamFilePath))) {
            arr.clear();
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
        } catch (IOException ex) {
            System.out.println(ex);
            return arr;
        }
    }

    public static void writeSanPham(ArrayList<sanPham> arr) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(sanPhamFilePath))) {
            for (sanPham sp : arr) {
                writer.write(sp.toString());
                writer.write("\n");
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static ArrayList<khachHang> readKhachHang(ArrayList<khachHang> arr) {
        try (BufferedReader reader = new BufferedReader(new FileReader(khachHangFilePath))) {
            arr.clear();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                arr.add(new khachHang(parts[0], parts[1], parts[2], new diaChi(parts[3], parts[4], parts[5], parts[6])));
            }
            return arr;
        } catch (IOException ex) {
            System.out.println(ex);
            return arr;
        }
    }

    public static void writeKhachHang(ArrayList<khachHang> arr) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(khachHangFilePath))) {
            for (khachHang kh : arr) {
                writer.write(kh.toString());
                writer.write("\n");
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static ArrayList<nhaCungCap> readNhaCungCap(ArrayList<nhaCungCap> arr) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nhaCungCapFilePath))) {
            arr.clear();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                arr.add(new nhaCungCap(parts[0], parts[1], parts[2], parts[3]));
            }
            return arr;
        } catch (IOException ex) {
            System.out.println(ex);
            return arr;
        }
    }

    public static void writeNhaCungCap(ArrayList<nhaCungCap> arr) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nhaCungCapFilePath))) {
            for (nhaCungCap ncc : arr) {
                writer.write(ncc.toString());
                writer.write("\n");
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static ArrayList<hoaDon> readHoaDon(ArrayList<hoaDon> arr) {
        try (BufferedReader reader = new BufferedReader(new FileReader(hoaDonFilePath))) {
            arr.clear();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("[, -]+");
                arr.add(new hoaDon(parts[0], parts[1], new date(Integer.parseInt(parts[2]), Integer.parseInt(parts[3]), Integer.parseInt(parts[4])), Double.parseDouble(parts[5])));
            }
            return arr;
        } catch (IOException ex) {
            System.out.println(ex);
            return arr;
        }
    }

    public static void writeHoaDon(ArrayList<hoaDon> arr) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(hoaDonFilePath))) {
            for (hoaDon hd : arr) {
                writer.write(hd.toString());
                writer.write("\n");
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static ArrayList<chiTietHoaDon> readChiTietHoaDon(ArrayList<chiTietHoaDon> arr) {
        try (BufferedReader reader = new BufferedReader(new FileReader(chiTietHoaDonFilePath))) {
            arr.clear();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                arr.add(new chiTietHoaDon(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3], Double.parseDouble(parts[4]), Double.parseDouble(parts[5])));
            }
            return arr;
        } catch (IOException ex) {
            System.out.println(ex);
            return arr;
        }
    }

    public static void writeChiTietHoaDon(ArrayList<chiTietHoaDon> arr) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(chiTietHoaDonFilePath))) {
            for (chiTietHoaDon cthd : arr) {
                writer.write(cthd.toString());
                writer.write("\n");
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static ArrayList<phieuNhap> readPhieuNhap(ArrayList<phieuNhap> arr){
        try (BufferedReader reader = new BufferedReader(new FileReader(phieuNhapFilePath))) {
            arr.clear();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("[, -]+");
                arr.add(new phieuNhap(parts[0], parts[1], new date(Integer.parseInt(parts[2]), Integer.parseInt(parts[3]), Integer.parseInt(parts[4])), Double.parseDouble(parts[5])));
            }
            return arr;
        } catch (IOException ex) {
            System.out.println(ex);
            return arr;
        }
    }

    public static void writePhieuNhap(ArrayList<phieuNhap> arr) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(phieuNhapFilePath))) {
            for (phieuNhap pn : arr) {
                writer.write(pn.toString());
                writer.write("\n");
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static ArrayList<chiTietPhieuNhap> readChiTietPhieuNhap(ArrayList<chiTietPhieuNhap> arr) {
        try (BufferedReader reader = new BufferedReader(new FileReader(chiTietPhieuNhapFilePath))) {
            arr.clear();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                arr.add(new chiTietPhieuNhap(parts[0], parts[1], Integer.parseInt(parts[2]), Double.parseDouble(parts[3]), Double.parseDouble(parts[4])));
            }
            return arr;
        } catch (IOException ex) {
            System.out.println(ex);
            return arr;
        }
    }

    public static void writeChiTietPhieuNhap(ArrayList<chiTietPhieuNhap> arr) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(chiTietPhieuNhapFilePath))) {
            for (chiTietPhieuNhap ctpn : arr) {
                writer.write(ctpn.toString());
                writer.write("\n");
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static ArrayList<baoHanh> readBaoHanh(ArrayList<baoHanh> arr) {
        try (BufferedReader reader = new BufferedReader(new FileReader(baoHanhFilePath))) {
            arr.clear();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("[, -]+");
                arr.add(new baoHanh(parts[0], parts[1], 
                    new date(Integer.parseInt(parts[2]), Integer.parseInt(parts[3]), Integer.parseInt(parts[4])), 
                    new date(Integer.parseInt(parts[5]), Integer.parseInt(parts[6]), Integer.parseInt(parts[7])),
                    Integer.parseInt(parts[8]), Integer.parseInt(parts[9])));
            }
            return arr;
        } catch (IOException ex) {
            System.out.println(ex);
            return arr;
        }
    }

    public static void writeBaoHanh(ArrayList<baoHanh> arr) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(baoHanhFilePath))) {
            for (baoHanh bh : arr) {
                writer.write(bh.toString());
                writer.write("\n");
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}