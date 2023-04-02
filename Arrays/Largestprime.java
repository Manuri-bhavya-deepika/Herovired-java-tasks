class Largestprime 
{
    public static void main(String[] args)
    {
        int[] arrNum = {2, 29, 51, 8, 4};
        int largestPrime = 0;
        for (int i : arrNum) 
        {
            if (isPrime(i) && i > largestPrime) 
            {
                largestPrime = i;
            }
        }
        if (largestPrime == 0) 
        {
            System.out.println("No prime numbers found in the array.");
        } 
        else 
        {
            System.out.println("The largest prime number in the given array: " + largestPrime);
        }
    }

    public static boolean isPrime(int n) 
    {
        if (n <= 1) 
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) 
            {
                return false;
            }
        }
        return true;
    }
}

