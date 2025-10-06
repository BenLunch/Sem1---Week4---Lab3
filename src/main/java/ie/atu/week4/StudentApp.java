package ie.atu.week4;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class StudentApp {
    public static void main(String[] args) {
        int count = 0;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        List<Student> studentList = new ArrayList<Student>();

        System.out.println("Please enter the number of students: ");
        count = sc.nextInt();
        sc.nextLine();
        while(i < count){
            Student student1 = new Student();
            System.out.println("Please enter the student name: ");
            String name = sc.nextLine();
            System.out.println("Please enter the student email: ");
            String email = sc.nextLine();
            System.out.println("Please enter the student ID: ");
            String id = sc.nextLine();
            System.out.println("Please enter the student course: ");
            String course = sc.nextLine();
            System.out.println("---------------------------------");
            student1.setName(name);
            student1.setEmail(email);
            student1.setId(id);
            student1.setCourse(course);
            studentList.add(student1);
            i++;
        }

        int counter = 1;
        for (Student student : studentList) {
            System.out.println("Student" + counter + ":");
            System.out.println("Name: " + student.getName());
            System.out.println("Email: " + student.getEmail());
            System.out.println("StudentId: " + student.getId());
            System.out.println("Course: " + student.getCourse());
            System.out.println("---------------------------------");
            counter++;
        }
    }
}