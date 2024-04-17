package demo;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentManagement {
    private ArrayList<Student> studentList;

    public StudentManagement() {
        studentList = new ArrayList<>();
    }

    public void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
            return;
        }
        System.out.println("Danh sách sinh viên:");
        for (Student student : studentList) {
            System.out.println("ID: " + student.getId() + ", Tên: " + student.getName() + ", Email: " + student.getEmail() + ", GPA: " + student.getGPA());
        }
    }

    public void addStudent(Student student) {
        studentList.add(student);
        System.out.println("Sinh viên đã được thêm vào danh sách.");
    }

    public void removeStudent(int id) {
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId() == id) {
                iterator.remove();
                System.out.println("Sinh viên đã được xoá khỏi danh sách.");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên có ID " + id);
    }

    public void displayStudentsWithGPAOver8() {
        System.out.println("Danh sách sinh viên có GPA > 8:");
        for (Student student : studentList) {
            if (student.getGPA() > 8) {
                System.out.println("ID: " + student.getId() + ", Tên: " + student.getName() + ", Email: " + student.getEmail() + ", GPA: " + student.getGPA());
            }
        }
    }

}
