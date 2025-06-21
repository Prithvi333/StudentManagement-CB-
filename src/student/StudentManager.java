package student;

import java.util.List;

/**
 * The type Student manager.
 */
public class StudentManager {

    private Student student;

    /**
     * Instantiates a new Student manager.
     *
     * @param student the student
     */
    public StudentManager(Student student) {
        this.student = student;
    }

    /**
     * Add student string.
     *
     * @param student     the student
     * @param studentList the student list
     * @return the string
     */
    public String addStudent(Student student, List<Student> studentList) {

        if (student != null) {
            studentList.add(student);
            return "Student with name " + student.getName() + " added successfully";
        }

        return "Student entity should be valid";
    }

    /**
     * Search student by roll number.
     *
     * @param roll        the roll
     * @param studentList the student list
     */
    public void searchStudentByRollNumber(int roll, List<Student> studentList) {

        Student student = null;
        for (Student studentValue : studentList) {
            if (studentValue.getRollNumber() == roll) {
                student = studentValue;
                break;
            }
        }
        if (student == null)
            System.out.println("Student with the roll number not found");
        else {
            student.printStudentDetail(student);
        }
    }

    /**
     * Display all students.
     *
     * @param studentList the student list
     */
    public void displayAllStudents(List<Student> studentList) {
        if (studentList.isEmpty()) {
            System.out.println("Student list is empty");
            return;
        }
        studentList.forEach(value -> {
            student.printStudentDetail(value);
            System.out.println("--------------------------");
        });
    }


}
