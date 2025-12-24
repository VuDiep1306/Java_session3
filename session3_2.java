import java.util.Scanner;

public class session3_2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int soHocVien = 0;
        double tongDiem = 0;
        double diem, max = -1, min = 11;

        do {
            // Hiển thị menu
            System.out.println("\n*************** MENU NHẬP ĐIỂM ***************");
            System.out.println("1. Nhập điểm học viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    // nhập điểm
                    while (true) {
                        System.out.print("Nhập điểm (-1 để kết thúc): ");
                        diem = sc.nextDouble();

                        if (diem == -1) {
                            break; // thoát vòng nhập
                        }

                        if (diem < 0 || diem > 10) {
                            System.out.println("❌ Điểm không hợp lệ!");
                            continue; // bỏ lượt này, nhập lại
                        }

                        soHocVien++;
                        tongDiem += diem;

                        if (diem > max) max = diem;
                        if (diem < min) min = diem;

                        // if-else xếp loại
                        if (diem < 5)
                            System.out.println("Xếp loại: Yếu");
                        else if (diem < 7)
                            System.out.println("Xếp loại: Trung Bình");
                        else if (diem < 8)
                            System.out.println("Xếp loại: Khá");
                        else if (diem < 9)
                            System.out.println("Xếp loại: Giỏi");
                        else
                            System.out.println("Xếp loại: Xuất sắc");
                    }
                    break;

                case 2:
                    if (soHocVien == 0) {
                        System.out.println("⚠️ Chưa có dữ liệu");
                        break;
                    }

                    System.out.println("----- THỐNG KÊ -----");
                    System.out.println("Số học viên: " + soHocVien);
                    System.out.println("Điểm trung bình: " + (tongDiem / soHocVien));
                    System.out.println("Điểm cao nhất: " + max);
                    System.out.println("Điểm thấp nhất: " + min);
                    break;

                case 3:
                    System.out.println("Kết thúc chương trình!");
                    return; // thoát main

                default:
                    System.out.println("❌ Lựa chọn không hợp lệ!");
            }
        } while (true);
    }
}
