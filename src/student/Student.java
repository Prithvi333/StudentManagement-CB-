package student;

/**
 * The type Student.
 */
public class Student {

    private String name;
    private int rollNumber;
    private String course;
    private int marks;

    /**
     * Instantiates a new Student.
     */
    public Student() {
    }

    /**
     * Instantiates a new Student.
     *
     * @param name       the name
     * @param rollNumber the roll number
     * @param course     the course
     * @param marks      the marks
     */
    public Student(String name, int rollNumber, String course, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
        this.marks = marks;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets roll number.
     *
     * @return the roll number
     */
    public int getRollNumber() {
        return rollNumber;
    }

    /**
     * Sets roll number.
     *
     * @param rollNumber the roll number
     */
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    /**
     * Gets course.
     *
     * @return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * Sets course.
     *
     * @param course the course
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /**
     * Gets marks.
     *
     * @return the marks
     */
    public int getMarks() {
        return marks;
    }

    /**
     * Sets marks.
     *
     * @param marks the marks
     */
    public void setMarks(int marks) {
        this.marks = marks;
    }

    /**
     * Print student detail.
     *
     * @param student the student
     */
    void printStudentDetail(Student student) {
        System.out.println("Student name : " + student.getName());
        System.out.println("Student roll number : " + student.getRollNumber());
        System.out.println("Student course name : " + student.getCourse());
        System.out.println("Student marks : " + student.getMarks());
    }

    /**
     * Update student marks.
     *
     * @param student the student
     * @param marks   the marks
     */
    void updateStudentMarks(Student student, int marks) {
        student.setMarks(marks);
        System.out.println("Student marks updated successfully");
    }

}
