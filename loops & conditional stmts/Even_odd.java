import java.util.Scanner;
class Even_odd 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            System.out.println("Menu based app - Even/Odd Checker");
            System.out.print("Please enter the number: ");
            int num = sc.nextInt();
            if (num % 2 == 0) 
            {
                System.out.println("The given number - " + num + " is an EVEN Number");
            } 
            else 
            {
                System.out.println("The given number - " + num + " is a ODD Number");
            }
            System.out.print("Do you want to Continue? (y/n): ");
            choice = sc.next().charAt(0);
        } 
        while (choice == 'y' || choice == 'Y');
    }
}

