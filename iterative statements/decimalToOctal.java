import java.util.Scanner;

public class decimalToOctal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter decimal number:");
        int n =sc.nextInt();
        String result=deciToOctal(n);
        System.out.println("Decimal number:"+n);
        System.out.println("octal number:"+result);
    }
    //function

    public static String deciToOctal(int decimal)
    {
        StringBuilder octal=new StringBuilder();
        while (decimal>0)
        {
            int remainder=decimal%8;
            octal.insert(0,remainder);
            decimal/=8;
        }
        return octal.toString();
    }
}
