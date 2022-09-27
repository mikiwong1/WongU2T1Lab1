public class School {

    // instance variables
    private String name;
    private int grade;
    private double gpa;

    // constructor
    public School( String schoolName, int gradeLevel, double overallGPA){
        name = schoolName;
        grade = gradeLevel;
        gpa = overallGPA;

    }

    // method
    public void introduce(){
        System.out.println("INFORMATION");
        System.out.println("School: " + name);
        System.out.println("Rank: " + grade);
        System.out.println("GPA: " + gpa);
    }
}
