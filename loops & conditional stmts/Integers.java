import java.util.Scanner;
class Integers 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        int smallest = num1;
        if (num2 < smallest) 
        {
            smallest = num2;
        }
        if (num3 < smallest) 
        {
            smallest = num3;
        }

        int largest = num1;
        if (num2 > largest) 
        {
            largest = num2;
        }
        if (num3 > largest) 
        {
            largest = num3;
        }

        double average = (num1 + num2 + num3) / 3.0;

        System.out.println("The Smallest Number: " + smallest);
        System.out.println("The Largest Number: " + largest);
        System.out.println("Average of all three numbers: " + average);
    }
}

