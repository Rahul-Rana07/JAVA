import java.util.Scanner;

public class hexadecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hexadecimal number:");
        String n = sc.nextLine();
        int rel=hexadecimalToDecimal(n);
        String result= decimalToBinary(rel);
        System.out.println("hexadecimal number:"+n);
        System.out.println("binary number"+result);
    }
    public static int hexadecimalToDecimal(String hexadecimal)
    {
        int decimalValue=0;
        int length=hexadecimal.length();
        for(int i=0;i<length;i++)
        {
            char hexdigit=hexadecimal.charAt(i);
            int decimalDigit=0;

            if(hexdigit>='0' && hexdigit<='9')
            {
                decimalDigit=hexdigit-'0';
            } else if (hexdigit>='A' && hexdigit<='F') {
                decimalDigit=hexdigit-'A'+10;
            } else if (hexdigit>='a' && hexdigit<='f') {
                decimalDigit=hexdigit-'a'+10;
            }
            else
            {
                System.out.println("invalid input");
            }
            int power= length-i-1;
            decimalValue+=decimalDigit*Math.pow(16,power);
        }
        return decimalValue;
    }
    public static String decimalToBinary(int decimal)
    {
        StringBuilder binary = new StringBuilder();
        while(decimal>0)
        {
            int remainder=decimal%2;
            binary.insert(0,remainder);
            decimal/=2;
        }
        return binary.toString();
    }
    }

