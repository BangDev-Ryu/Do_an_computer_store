import java.util.Scanner;

public class computer {
        // Class data members
        public int No;
        public String ComName;
        public String BrandName;
        public int Price;
        public int ComQty;

        Scanner input = new Scanner(System.in);

        public computer() {
                System.out.println("Nhập mã sản phẩm:");
                this.No = input.nextInt();
                input.nextLine();

                System.out.println("Nhập tên sản phẩm:");
                this.ComName = input.nextLine();

                System.out.println("Nhập nhà sản xuất:");
                this.BrandName = input.nextLine();

                System.out.println("Nhập giá tiền:");
                this.Price = input.nextInt();

                System.out.println("Nhập số lượng:");
                this.ComQty = input.nextInt();
        }
}
