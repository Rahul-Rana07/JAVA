import java.util.Scanner;

public class hexadecimalToDecimal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter hexadecimal number:");
        String n= sc.nextLine();
       int res= hextodecimal(n);
        System.out.println("hexadecimal  number:"+n);
        System.out.println("decimal number:"+res);
    }

    public static int hextodecimal(String hexadecimal) {
        int decimalValue = 0;
        int length = hexadecimal.length();
        for (int i = 0; i < length; i++) {
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
}

