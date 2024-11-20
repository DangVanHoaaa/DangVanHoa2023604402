package baitapweb.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyHocSinh {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Staff> staff = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        students.add(new Student("Nguyen Van A", "Ha Noi", "IT", 2024, 8.5));
        students.add(new Student("Tran Thi B", "Hai Phong", "Business", 2023, 4.9));
        students.add(new Student("Le Van C", "Da Nang", "Marketing", 2022, 6.0));

        staff.add(new Staff("Nguyen Van D", "HCM", "High School", 1500.0));
        staff.add(new Staff("Tran Thi E", "Hue", "University", 2000.0));
        staff.add(new Staff("Le Thi F", "Quang Ninh", "College", 1800.0));

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Hiển thị toàn bộ Staff");
            System.out.println("2. Hiển thị toàn bộ Student");
            System.out.println("3. Tìm kiếm theo tên");
            System.out.println("4. Tìm Staff có lương cao nhất");
            System.out.println("5. Lọc ra các Student có score < 5");
            System.out.println("6. Thoát");

            System.out.print("Chọn tùy chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng mới

            switch (choice) {
                case 1:
                    System.out.println("Danh sách Staff:");
                    for (Staff s : staff) {
                        System.out.println(s);
                    }
                    break;
                case 2:
                    System.out.println("Danh sách Student:");
                    for (Student s : students) {
                        System.out.println(s);
                    }
                    break;
                case 3:
                    System.out.print("Nhập tên cần tìm: ");
                    String name = scanner.nextLine();
                    boolean found = false;
                    for (Staff s : staff) {
                        if (s.getName().equalsIgnoreCase(name)) {
                            System.out.println(s);
                            found = true;
                        }
                    }
                    for (Student s : students) {
                        if (s.getName().equalsIgnoreCase(name)) {
                            System.out.println(s);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy nhân viên nào với tên: " + name);
                    }
                    break;
                case 4:
                    Staff highestSalaryStaff = null;
                    for (Staff s : staff) {
                        if (highestSalaryStaff == null || s.getSalary() > highestSalaryStaff.getSalary()) {
                            highestSalaryStaff = s;
                        }
                    }
                    if (highestSalaryStaff != null) {
                        System.out.println("Nhân viên có lương cao nhất:");
                        System.out.println(highestSalaryStaff);
                    }
                    break;
                case 5:
                    System.out.println("Danh sách Student có score < 5:");
                    for (Student s : students) {
                        if (s.getScore() < 5) {
                            System.out.println(s);
                        }
                    }
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}