import java.util.Scanner;

public class Validator {

    private Transcript t;
    private CourseEnrollment ce;
    private Scanner in = new Scanner(System.in);

    public Validator() {

    }

    public void welcome() {
        System.out.println("Welcome to the transcript application.");
    }

    public void studentInfo() {
        t = new Transcript();
        System.out.print("Enter Student ID number: ");
        int id = in.nextInt();
        t.setId(id);
        in.nextLine();
        System.out.print("Enter Student's first name: ");
        String fName = in.nextLine();
        t.setfName(fName);
        System.out.print("Enter Student's last name: ");
        String lName = in.nextLine();
        t.setlName(lName);
        System.out.println();
    }

    public void courseInfo() {
        String anotherCourse;
        do {
            ce = new CourseEnrollment();
            System.out.print("Enter course: ");
            String course = in.nextLine();
            ce.setCourseCode(course);
            System.out.print("Enter credits: ");
            int credits = in.nextInt();
            ce.setCredits(credits);
            in.nextLine();
            System.out.print("Enter grade: ");
            char grade = in.nextLine().charAt(0);
            ce.setGrade(grade);
            t.addCourse(ce);
            System.out.print("Another course? (y/n): ");
            anotherCourse = in.nextLine();
            System.out.println();
        } while (anotherCourse.equalsIgnoreCase("y"));
    }

    public void printStudentInfo() {
        System.out.println(t.getStudentInfo());
        System.out.println();
    }

    public void printCourseInfo() {
        System.out.println("Course\t\tCredits\t\tGrade\t\tQuality Points");
        System.out.println("------\t\t ------\t\t------\t\t-------------");
        for (CourseEnrollment key : t.getCourses()) {
            key.setQualityPts(key.getGrade());
            System.out.print(key.getCourseCode() + "\t\t" + key.getCredits()
                    + "\t\t" + key.getGrade() + "\t\t\t" + key.getQualityPts() + "\n");
        }
        System.out.println();
        System.out.println(t.getFormattedGPA());
    }
}
