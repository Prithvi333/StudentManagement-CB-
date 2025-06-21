import student.Student;
import student.StudentManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The type Main.
 */
public class Main {

    /**
     * The Student manager.
     */
    private StudentManager studentManager;
    private List<Student> studentList;

    /**
     * Instantiates a new Main.
     *
     * @param studentManager the student manager
     */
    public Main(StudentManager studentManager) {
        System.out.println("Welcome to the student management system");
        this.studentManager = studentManager;
        this.studentList = new ArrayList<>();

    }

    /**
     * Instantiate and add student.
     *
     * @param sc          the sc
     * @param studentList the student list
     */
    void addStudents(Scanner sc, List<Student> studentList) {
        int i = 1;
        while (true) {
            System.out.println("Enter the student name");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Enter the student roll number");
            int roll = sc.nextInt();
            System.out.println("Enter the student course name");
            sc.nextLine();
            String course = sc.nextLine();
            System.out.println("Enter the student marks");
            int marks = sc.nextInt();
            Student student = new Student(name, roll, course, marks);
            String result = studentManager.addStudent(student, studentList);
            System.out.println(result);
            System.out.println("----------------------------------------------");
            System.out.println("Do you want to add more students Yes/No");
            String nextFlag = sc.next();
            if (nextFlag.equalsIgnoreCase("No")) {
                break;
            }
            i++;
        }
    }

    /**
     * Display student by roll number.
     *
     * @param scanner the scanner
     */
    void displayStudentByRollNumber(Scanner scanner) {
        System.out.println("Please enter student roll number");
        int roll = scanner.nextInt();
        studentManager.searchStudentByRollNumber(roll, studentList);

    }

    /**
     * Display all student.
     *
     * @param scanner the scanner
     */
    void displayAllStudent(Scanner scanner) {
        studentManager.displayAllStudents(studentList);
    }

    /**
     * Start system.
     *
     * @param sc the sc
     */
    void startSystem(Scanner sc) {
        boolean continueFlag = true;
        while (continueFlag) {
            System.out.println("-----------------------------------------");
            System.out.println("Enter 1 to add student details");
            System.out.println("Enter 2 to print student details");
            System.out.println("Enter 3 to print all student details");
            System.out.println("Enter 4 to exit the system");
            System.out.println("------------------------------------------");
            int option = sc.nextInt();

            switch (option) {
                case 1: {
                    addStudents(sc, studentList);
                    break;
                }
                case 2: {
                    displayStudentByRollNumber(sc);
                    break;
                }
                case 3: {
                    displayAllStudent(sc);
                    break;
                }
                case 4: {
                    continueFlag = false;
                    System.out.println("Thanks for visiting our system");
                    break;
                }
                default: {
                    System.out.println("Do you want to exit from the system : Y/N");
                    char opt = sc.next().charAt(0);
                    if (opt == 'N' || opt == 'n') {
                        continueFlag = false;
                        System.out.println("Thanks for visiting our system");
                    }
                }
            }

        }
    }


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager studentManager = new StudentManager(new Student());
        Main main = new Main(studentManager);
        main.startSystem(sc);
    }
}