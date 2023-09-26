import java.util.Calendar;

class Student {
    public String name;
    public String surname;
    private int enrolmentYear;
    private String program;
    private int numberOfAssignments;
    private double[] grades = new double[100];
    private boolean isOnline = false;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void printFullName() {
        System.out.println(name + " " + surname);
    }

    public int getEnrolmentYear() {
        return enrolmentYear;
    }

    public void setEnrolmentYear(int year) {
        enrolmentYear = year;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String newProgram) {
        program = newProgram;
    }

    public int getYearOfStudy() {
        return Calendar.getInstance().get(Calendar.YEAR) - getEnrolmentYear();
    }

    public int getGraduationYear() {
        return getEnrolmentYear() + 4;
    }

    public int getNumberOfAssignments() {
        return numberOfAssignments;
    }

    public void setNumberOfAssignments(int newNumber) {
        numberOfAssignments = newNumber;
    }

    public void setGrade(int assignmentNumber, double assignmentPoints) {
        grades[assignmentNumber] = assignmentPoints;
    }

    public double getGrade(int assignmentNumber) {
        return grades[assignmentNumber];
    }

    public boolean getOnline() {
        return isOnline;
    }

    public void setOnline(boolean newValue) {
        isOnline = newValue;
    }

    public double getTotalPoints() {
        double sum = 0;
        for (int i = 0; i < getNumberOfAssignments(); i++) {
            sum += grades[i];
        }
        return sum;
    }

    public void printFullInformation() {
        printFullName();
        System.out.println();
        System.out.println("Enrollment year: " + getEnrolmentYear());
        System.out.println("Program: " + getProgram());
        System.out.println("Year of study: " + getYearOfStudy());
        System.out.println("Online: " + getOnline());
        System.out.println("Number of assignments: " + getNumberOfAssignments());
        System.out.println("Total points: " + getTotalPoints());
    }
}

public class Part1 {
    public static void main(String[] args) {
        Student petro = new Student("Petro", "Petrenko");
        petro.setEnrolmentYear(2022);
        petro.setProgram("BDS");
        petro.setNumberOfAssignments(5);
        petro.setGrade(0, 9.9);
        petro.setGrade(1, 15);

        Student mykyta = new Student("Mykyta", "Derii");
        mykyta.setEnrolmentYear(2023);
        mykyta.setProgram("BSE");
        mykyta.setOnline(true);
        mykyta.setNumberOfAssignments(4);
        mykyta.setGrade(0, 10);
        mykyta.setGrade(1, 10);
        mykyta.setGrade(2, 15);

        petro.name = "Mykola";
        //petro.isOnline = true;

        petro.printFullInformation();
        System.out.println("------------------------------");
        mykyta.printFullInformation();
    }
}
