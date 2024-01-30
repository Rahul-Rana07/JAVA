import java.util.Scanner;

public class binaryToOctal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter binary number:");
        int n=sc.nextInt();
        String result=binaryToOct(n);
        System.out.println("binary number:"+n);
        System.out.println("octl number:"+result);
    }
    //function to convert binary to octal

    public static String binaryToOct(int decimal)
    {
        StringBuilder octal=new StringBuilder();
        int octalNumber=0;
        int decimalBase=1;
        while(decimal>0)
        {
          int remainder=decimal%8;
            octalNumber+=remainder*decimalBase;
            decimal/=8;
            decimalBase*=2;
        }
        return Integer.toString(octalNumber);
    }
}
