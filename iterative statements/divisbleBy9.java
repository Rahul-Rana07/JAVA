public class divisbleBy9 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=100;i<=200;i++)
        {
            if(i%9==0)
            {
                sum+=i;
                System.out.println("number is:"+i);
            }
        }
        System.out.println("sum is:"+sum);
    }
}
