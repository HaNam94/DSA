package demo;


import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagement management = new StudentManagement();

        while (true) {
            System.out.println("\nChọn chức năng:");
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Thêm sinh viên");
            System.out.println("3. Xoá sinh viên");
            System.out.println("4. Hiển thị danh sách sinh viên có GPA > 8");
            System.out.println("5. Thoát");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    management.displayStudents();
                    break;
                case 2:
                    System.out.println("Nhập ID:");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhập Tên:");
                    String name = scanner.nextLine();
                    System.out.println("Nhập Email:");
                    String email = scanner.nextLine();
                    System.out.println("Nhập GPA:");
                    double GPA = scanner.nextDouble();
                    management.addStudent(new Student(id, name, email, GPA));
                    break;
                case 3:
                    System.out.println("Nhập ID của sinh viên cần xoá:");
                    int removeId = scanner.nextInt();
                    management.removeStudent(removeId);
                    break;
                case 4:
                    management.displayStudentsWithGPAOver8();
                    break;
                case 5:
                    System.out.println("Kết thúc chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chọn không hợp lệ.");
            }
        }
    }
}

