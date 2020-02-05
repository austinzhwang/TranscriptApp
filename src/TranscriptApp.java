public class TranscriptApp {

    public static void main (String[] args) {

        Validator v = new Validator();

        v.welcome();
        v.studentInfo();
        v.courseInfo();

        v.printStudentInfo();
        v.printCourseInfo();
    }
}
