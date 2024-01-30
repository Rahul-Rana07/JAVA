import java.util.Scanner;

public class onesComplement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter binary number:");
        String binaryNumber= sc.nextLine();
        String res=findOnesComplemenT(binaryNumber);
        System.out.println("binary number:"+binaryNumber);
        System.out.println("ones compleent of binary:"+res);
    }

    //function to find ones complement

    public static String findOnesComplemenT(String binary)
    {
        StringBuilder onesComplement=new StringBuilder();
        for (int i=0;i<binary.length();i++)
        {
            char bit=binary.charAt(i);
            if(bit=='0')
            {
                onesComplement.append('1');
            } else if (bit=='1') {
                onesComplement.append('0');
            }
            else
            {
                System.out.println("found invalid input in binary");
                return null;
            }
        }
        return onesComplement.toString();
    }
}
