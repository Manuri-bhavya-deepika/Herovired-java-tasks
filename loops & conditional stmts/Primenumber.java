import java.util.Scanner;
class Primenumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        boolean isPrime = true;
        if (num < 2) 
        {
            isPrime = false;
        } 
        else 
        {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) 
                {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) 
        {
            System.out.println("The given number " + num + " is a Prime number");
        } 
        else 
        {
            System.out.println("The given number " + num + " is NOT a Prime number");
        }
    }
}

