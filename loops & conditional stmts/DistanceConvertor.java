import java.util.Scanner;
class DistanceConvertor
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        double value;
        do 
        {
            System.out.println("Menu based app - Unit conversion for Distance\n");
            System.out.println("1. CM to M");
            System.out.println("2. M to KM");
            System.out.println("3. KM to M");
            System.out.println("4. M to CM\n");
            System.out.print("Enter your menu - ");
            choice = sc.nextInt();
            switch (choice) 
            {
                case 1:
                    System.out.print("\nPlease enter the CM Value: ");
                    value = sc.nextDouble();
                    System.out.println(value + " CM = " + (value / 100) + " M\n");
                    break;

                case 2:
                    System.out.print("\nPlease enter the M Value: ");
                    value = sc.nextDouble();
                    System.out.println(value + " M = " + (value / 1000) + " KM\n");
                    break;

                case 3:
                    System.out.print("\nPlease enter the KM Value: ");
                    value = sc.nextDouble();
                    System.out.println(value + " KM = " + (value * 1000) + " M\n");
                    break;

                case 4:
                    System.out.print("\nPlease enter the M Value: ");
                    value = sc.nextDouble();
                    System.out.println(value + " M = " + (value * 100) + " CM\n");
                    break;

                default:
                    System.out.println("\nInvalid Choice. Please choose again.\n");
                    break;
            }
            System.out.print("Do you want to Continue? (y/n): ");
        } 
        while (sc.next().equalsIgnoreCase("y"));
        sc.close();
    }
}
