import java.util.ArrayList;

public class Transcript {

    private int id;
    private String fName;
    private String lName;

    private ArrayList<CourseEnrollment> ceList;

    public Transcript() {
        ceList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void addCourse(CourseEnrollment course) {
        ceList.add(course);
    }

    public ArrayList<CourseEnrollment> getCourses() {
        return ceList;
    }

    public String getStudentInfo() {
        return getfName() + " " + getlName() + "\nStudent ID: " + getId() ;
    }

    public double getOverallGPA() {
        double sum = 0, gpa = 0;

        for (CourseEnrollment key : getCourses()) {
            switch(key.getGrade()) {
                case 'A' :
                    sum += 4;
                    break;
                case 'B' :
                    sum += 3;
                    break;
                case 'C' :
                    sum += 2;
                    break;
                case 'D' :
                    sum += 1;
                    break;
                case 'F' :
                    sum += 0;
                    break;
            }
        }
        gpa = sum / getCourses().size();
        return gpa;
    }

    public String getFormattedGPA() {
        return "GPA: " + getOverallGPA();
    }




}
