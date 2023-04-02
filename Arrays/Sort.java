import java.util.Arrays;
class Sort
{
    public static void main(String[] args)
    {
        int[] arrNum = {23, 21, 44, 32, 12};
        System.out.println("The elements in ascending order:");
        Arrays.sort(arrNum);
        for (int i : arrNum) 
        {
            System.out.print(i + " ");
        }
        System.out.println("\n\nThe elements in descending order:");
        for (int i = arrNum.length - 1; i >= 0; i--) 
        {
            System.out.print(arrNum[i] + " ");
        }
    }
}
