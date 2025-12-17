import java.net.SocketOption;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class session3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Nhap thong tin
        System.out.print("Nhap ten khach hang: ");
        String customerName = scanner.nextLine();

        System.out.print("nhap ten san pham: ");
        String productName = scanner.nextLine();

        System.out.print("Nhap gia san pham: ");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhap so luong mua: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        System.out.print("Khach co the thanh vien khong (true/false): ");
        boolean memberCard = Boolean.parseBoolean(scanner.nextLine());

        // Chương trình thực hiện tính:
        double Amount = price * quantity;
        double discout = memberCard ? Amount * 0.10 : 0;
        double vat = Amount * 0.08;
        double totalAmount = (Amount - discout) + vat;

        // in ket qua
        System.out.println("\n===== THÔNG TIN THANH TOÁN =====");
        System.out.println("Khách hàng      : " + customerName);
        System.out.println("Sản phẩm        : " + productName);
        System.out.println("Số lượng        : " + quantity);
        System.out.printf("Đơn giá         : %.2f%n", price);
        System.out.printf("Thành tiền      : %.2f%n", Amount);
        System.out.printf("Giảm giá        : %.2f%n", discout);
        System.out.printf("Tiền VAT (8%%)   : %.2f%n", vat);
        System.out.printf("Tổng thanh toán : %.2f%n", totalAmount);

        scanner.close();
    }
}