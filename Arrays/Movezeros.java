class Movezeros
{
    public static void main(String[] args)
    {
        int[] arrNum = {3, 1, 4, 1, 2, 1, 8, 3, 2, 1};
        int[] newArr = new int[arrNum.length];
        int j = 0;
        for (int i = 0; i < arrNum.length; i++) 
        {
            if (arrNum[i] != 1) 
            {
                newArr[j] = arrNum[i];
                j++;
            }
        }
        for (int i = 0; i < arrNum.length; i++) 
        {
            if (arrNum[i] == 1) 
            {
                newArr[j] = arrNum[i];
                j++;
            }
        }
        System.out.print("Array elements after moving Ones to end: ");
        for (int i : newArr)
        {
            System.out.print(i + " ");
        }
    }
}

