public class MyMath {
    public static int findSmallest(int x, int y, int z)
    {
        int smallest;
        smallest = x;

        if (y < smallest)
            smallest = y;

        if (z < smallest)
            smallest = z;

        return smallest;
    }

    public static int findPower(int x, int y)
    {
        int result = 1;

        if (x < 0)
           result = 0;

        for(int i=0;i < y; i++)
            result *= x;

        return result;
    }

    public static int sumNumbers(int n)
    {
        int result = 0;
        int num = 0;
        for(int i=0;i < n; i++) {
            num++;
            result += num;
        }
        return result;
    }

    public static int factorial(int n)
    {

        int result = 1;
        int num = 0;
        for(int i=0;i < n; i++) {
            num++;
            result *= num;
        }
        return result;
    }


}
