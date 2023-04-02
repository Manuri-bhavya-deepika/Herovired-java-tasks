import java.util.Scanner;
class Percentage
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the marks obtained by the student: ");
        double marksObtained = sc.nextDouble();

        System.out.print("Enter the total marks: ");
        double totalMarks = sc.nextDouble();

        double percentage = (marksObtained / totalMarks) * 100;
        System.out.println("Percentage: " + percentage + "%");

        char grade;
        double gpa;

        if (percentage >= 90) {
            grade = 'A';
            gpa = 4.0;
        } else if (percentage >= 80) {
            grade = 'B';
            gpa = 3.0;
        } else if (percentage >= 70) {
            grade = 'C';
            gpa = 2.0;
        } else if (percentage >= 60) {
            grade = 'D';
            gpa = 1.0;
        } else {
            grade = 'F';
            gpa = 0.0;
        }
        System.out.println("Grade " + grade + ", GPA = " + gpa);
    }
}
