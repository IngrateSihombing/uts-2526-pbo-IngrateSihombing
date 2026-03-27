
public class driver4 {
    
}
package Fintech.driver;

import java.util.Scanner;
import java.util.ArrayList;
import academic.model.Course;
import academic.model.Student;
import academic.model.Enrollment;

public class Driver4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System. someIn);
        
        // Menggunakan ArrayList agar penyimpanan dinamis (multiple entries)
        ArrayList<Course> courses = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Enrollment> enrollments = new ArrayList<>();

        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            
            // Berhenti jika input adalah "---"
            if (input.equals("---")) {
                break;
            }

            // Memecah baris berdasarkan simbol #
            String[] data = input.split("#");
            String command = data[0];

            // Logika pemilihan entitas berdasarkan segmen pertama
            switch (command) {
                case "course-add":
                    courses.add(new Course(data[1], data[2], Integer.parseInt(data[3]), data[4]));
                    break;
                case "student-add":
                    students.add(new Student(data[1], data[2], data[3], data[4]));
                    break;
                case "enrollment-add":
                    enrollments.add(new Enrollment(data[1], data[2], data[3], data[4]));
                    break;
            }
        }

        // Menampilkan output sesuai urutan: Course -> Student -> Enrollment
        for (Course c : courses) {
            System.out.println(c.toString());
        }
        for (Student s : students) {
            System.out.println(s.toString());
        }
        for (Enrollment e : enrollments) {
            System.out.println(e.toString());
        }

        sc.close();
    }
}