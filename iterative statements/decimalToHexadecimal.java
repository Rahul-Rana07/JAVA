import java.util.Scanner;

public class decimalToHexadecimal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter decimal number:");
        int n=sc.nextInt();
        String result=decimalTohexa(n);
        System.out.println("decimal number:"+n);
        System.out.println("hexadecimal number:"+result);
    }
    public static String decimalTohexa(int decimal)
    {
        StringBuilder hexa=new StringBuilder();
        int  remainder;
        while(decimal>0) {
            remainder = decimal % 16;
            if(remainder>=0 && remainder<=9)
            {
                hexa.insert(0,(char)('0'+remainder));
            } else{
                hexa.insert(0,(char)('A'+remainder-10));
            }
            decimal /= 16;
        }
        return hexa.toString();
    }
}
