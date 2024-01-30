public class evenUpto100 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=0;i<=100;i++)
        {
            if(i%2==0)
            {
                System.out.println("even number:"+i);
                sum+=i;
                System.out.print("sum is:"+sum);
            }
        }
    }
}
