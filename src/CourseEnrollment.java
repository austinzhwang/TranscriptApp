public class CourseEnrollment {

    private String courseCode;
    private int credits;
    private char grade;
    private double qualityPts;

    public CourseEnrollment() {

    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public double getQualityPts() {
        return qualityPts;
    }

    public void setQualityPts(char grade) {
        switch(grade) {
            case 'A' :
                this.qualityPts = 4.0;
                break;
            case 'B' :
                this.qualityPts = 3.0;
                break;
            case 'C' :
                this.qualityPts = 2.0;
                break;
            case 'D' :
                this.qualityPts = 1.0;
                break;
            case 'F' :
                this.qualityPts = 0.0;
                break;
        }
    }
}
