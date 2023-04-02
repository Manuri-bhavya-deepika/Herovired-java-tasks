import java.util.*;
class Frequency 
{
    public static void main(String[] args)
    {
        int[] arrSuperSet = {3, 1, 3, 4, 1, 2, 1, 8, 3, 2, 1, 1, 3, 2, 3, 3, 4};
        int[] arrSubSet = {1, 2, 3, 5, 9};
        Map<Integer, Integer> frequency = new HashMap<Integer, Integer>();
        for (int i = 0; i < arrSubSet.length; i++) 
        {
            frequency.put(arrSubSet[i], 0);
        }
        for (int i = 0; i < arrSuperSet.length; i++) 
        {
            if (frequency.containsKey(arrSuperSet[i])) 
            {
                frequency.put(arrSuperSet[i], frequency.get(arrSuperSet[i]) + 1);
            }
        }
        for (int key : frequency.keySet()) 
        {
            System.out.println("Frequency of " + key + ": " + frequency.get(key));
        }
    }
}

