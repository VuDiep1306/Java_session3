import java.sql.SQLOutput;
import java.util.Scanner;

public class session3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int soNhanVien = 0;
        double luong;
        double tongLuong = 0;
        double min = 500000001;
        double max = -1;
        double tongThuong = 0;
        do {
            System.out.println("***************MENU NHẬP LƯƠNG***************");
            System.out.println("1. Nhập lương nhân viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Tính tổng số tiền thưởng cho nhân viên");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("Nhập lương (-1 để kết thúc): ");
                        luong = sc.nextDouble();
                        if (luong == -1) {
                            break;
                        }
                        if (luong < 0 || luong > 500000000) {
                            System.out.println("❌ Lương không hợp lệ!");
                            continue;
                        }
                        soNhanVien++;
                        tongLuong += luong;
                        if (luong > max) max = luong;
                        if (luong < min) min = luong;
                        if (luong < 5000000) {
                            System.out.println("Thu nhập thấp");
                            tongThuong += luong * 0.05;
                        } else if (luong < 15000000) {
                            System.out.println("Thu nhập trung bình");
                            tongThuong += luong * 0.10;
                        } else if (luong < 50000000) {
                            System.out.println("Thu nhập khá");
                            tongThuong += luong * 0.15;
                        } else if (luong <= 100000000) {
                            System.out.println("Thu nhập cao");
                            tongThuong += luong * 0.20;
                        } else {
                            System.out.println("Thu nhập rất cao");
                            tongThuong += luong * 0.25;
                        }
                    }
                    break;
                case 2:
                    if (soNhanVien == 0) {
                        System.out.println("⚠️ Chưa có dữ liệu");
                        break;
                    }
                    System.out.println("------ THỐNG KÊ ------");
                    System.out.println("Số nhân viên: " + soNhanVien);
                    System.out.println("Lương trung bình: " + (tongLuong / soNhanVien));
                    System.out.println("Lương cao nhất: " + max);
                    System.out.println("Lương thấp nhất: " + min);
                    System.out.println("Tổng tiền lương: " + tongLuong);
                    break;
                case 3:
                    if (soNhanVien == 0) {
                        System.out.println("⚠️ Chưa có dữ liệu");
                        break;
                    }
                    System.out.println("Tổng số tiền thưởng: " + tongThuong);
                    break;
                case 4:
                    System.out.println("Kết thúc chương trình!");
                    System.exit(0);

                default:
                    System.out.println("❌ Lựa chọn không hợp lệ!");
            }
        } while (true);
    }
}
