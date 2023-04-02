import java.util.Scanner;
class Substring 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        System.out.print("Enter the starting index: ");
        int start = sc.nextInt();

        System.out.print("Enter the ending index: ");
        int end = sc.nextInt();

        String subStr = str.substring(start, end + 1);
        System.out.println("Substring of " + str + " from " + start + " to " + end + " is: " + subStr);
        sc.close();
    }
}
