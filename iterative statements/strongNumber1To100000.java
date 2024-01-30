public class strongNumber1To100000 {
    public static void main(String[] args) {
        for(int i=0;i<=100000;i++)
        {
            if(isStrong(i));
            System.out.println("strong number:"+i);
        }
    }
    static boolean isStrong(int num)
    {
        int sum=0;
        int n0=num;
        while (num>0)
        {
            int digit=num%10;
            sum+=fact(digit);
            num/=10;
        }
        return sum==n0;
    }

    public static int fact(int digit)
    {
        int f=1;
        for(int j=1;j<=digit;j++)
        {
            f*=j;
        }
        return f;
    }
}
