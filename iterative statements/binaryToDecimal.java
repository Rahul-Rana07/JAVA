import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter binary number:");
        int n=sc.nextInt();
        String result=binaryToDeecimal(n);
        System.out.println("binary number:"+n);
        System.out.println("deciml number:"+result);
    }

    //function to convert binary to decimal;
    public static String binaryToDeecimal(int decimal)
    {
        StringBuilder deci=new StringBuilder();
        int decimalNUmber=0;
        int decimalBase=1;
        while(decimal>0)
        {
            int remainder=decimal%10;
            decimalNUmber+=remainder*decimalBase;
            decimal/=10;
            decimalBase*=2;
        }
        return Integer.toString(decimalNUmber);
    }
}
