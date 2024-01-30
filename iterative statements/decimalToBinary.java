import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter decimal number:");
        int n=sc.nextInt();
        String result=dectoBinary(n);
        System.out.println("Decimal number:"+n);
        System.out.println("binary number:"+result);
    }
    //functin to convert decimal to binary

    public static String  dectoBinary(int decimal)
    {
        StringBuilder binary=new StringBuilder();
        while(decimal>0)
        {
            int remainder=decimal%2;
            binary.insert(0,remainder);
            decimal/=2;
        }
        return binary.toString();
    }
}
