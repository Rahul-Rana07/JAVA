public class perfectNumber {
    public static void main(String[] args) {
        for (int i=1;i<=100000;i++)
        {
            if (perfect(i))
                System.out.println(i);
        }
    }

    public static boolean perfect(int num)
    {
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        if (sum==num)
            return true;
        else
        return false;
    }
}
