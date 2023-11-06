import java.util.Scanner;

// CLass
public class computers {

    // Class data members
    computer theComs[] = new computer[50];
    public static int count;

    Scanner input = new Scanner(System.in);

    // So sánh
    public int compareComObjects(computer b1, computer b2) {

        // Trùng tên
        if (b1.ComName.equalsIgnoreCase(b2.ComName)) {

            System.out.println("Tên sản phẩm đã tồn tại");
            return 0;
        }

        // Trùng mã
        if (b1.No == b2.No) {

            System.out.println("Mã sản phẩm đã tồn tại");

            return 0;
        }
        return 1;
    }

    // Thêm sản phẩm
    public void addCom(computer b) {

        for (int i = 0; i < count; i++) {

            if (this.compareComObjects(b, this.theComs[i]) == 0)
                return;
        }
    }

    // TÌm theo mã sản phẩm
    public void searchByNo() {

        System.out.println("\t\t\t\tTìm theo mã sản phẩm\n");

        int No;
        System.out.println("Nhập mã sản phẩm:");
        No = input.nextInt();

        int flag = 0;
        System.out.println("No\t\tTên\t\tNhãn hiệu\t\tGiá\t\tTổng số lượng");

        // In thông tin
        for (int i = 0; i < count; i++) {
            if (No == theComs[i].No) {
                System.out.println(
                        theComs[i].No + "\t\t"
                                + theComs[i].ComName + "\t\t"
                                + theComs[i].BrandName + "\t\t"
                                + theComs[i].Price + "\t\t"
                                + theComs[i].ComQty);
                flag++;
                return;
            }
        }
        if (flag == 0)
            System.out.println("Không tìm thấy mã: " + No);
    }

    // Tìm theo nhãn hàng
    public void searchByBrandName() {

        System.out.println("\t\t\t\tTìm theo nhãn hàng");

        input.nextLine();

        System.out.println("Nhập nhãn hàng cần tìm:");
        String BrandName = input.nextLine();

        int flag = 0;

        System.out.println("No\\t\\tTên\\t\\tNhãn hiệu\\t\\tGiá\\t\\tTổng số lượng");

        for (int i = 0; i < count; i++) {

            if (BrandName.equalsIgnoreCase(
                    theComs[i].BrandName)) {

                // In thông tin
                System.out.println(
                        theComs[i].No + "\t\t"
                                + theComs[i].ComName + "\t\t"
                                + theComs[i].BrandName + "\t\t"
                                + theComs[i].Price + "\t\t"
                                + theComs[i].ComQty);
                flag++;
            }
        }

        // Không tìm thấy
        if (flag == 0)
            System.out.println("Không tìm thấy sản phẩm của hãng:  " + BrandName);
    }

    // Hiển thị danh sách sản phẩm
    public void showAllComs() {

        System.out.println("\t\t\t\tDanh sách sản phẩm\n");
        System.out.println("No\\t\\tTên\\t\\tNhãn hiệu\\t\\tGiá\\t\\tTổng số lượng");

        for (int i = 0; i < count; i++) {

            System.out.println(
                    theComs[i].No + "\t\t"
                            + theComs[i].ComName + "\t\t"
                            + theComs[i].BrandName + "\t\t"
                            + theComs[i].Price + "\t\t"
                            + theComs[i].ComQty);
        }
    }

    // Chỉnh sửa thông tin sản phẩm
    public void upgradeComQty() {

        System.out.println("\t\t\t\tSố lượng sản phẩm\n");
        System.out.println("Nhập mã sản phẩm: ");

        int No = input.nextInt();

        for (int i = 0; i < count; i++) {

            if (No == theComs[i].No) {

                System.out.println("Số lượng sản phẩm thêm vào:");

                int addingQty = input.nextInt();
                theComs[i].ComQty += addingQty;

                return;
            }
        }
    }

    // Tạo menu
    public void dispMenu() {

        System.out.println(
                "----------------------------------------------------------------------------------------------------------");
        System.out.println(" 1. Thêm sản phẩm mới");
        System.out.println(" 0. Exit ");
        System.out.println(
                "2. Cập nhật sản phẩm");
        System.out.println(" 3. Tìm sản phẩm");
        System.out.println(" 4. Tất cả sản phẩm");

        System.out.println(
                "----------------------------------------------------------------------------------------------------------");
    }

}
