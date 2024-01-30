import java.util.Scanner;

public class marksAnalyzer {
    public static void main(String[] args) {
        System.out.println("Menu:");
        System.out.println("1. Enter student's marks");
        System.out.println("0. Quit");
        System.out.print("Enter your choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
            do {
                if (choice == 1) {
                    System.out.print("Enter student's marks (out of 100): ");
                    int marks = sc.nextInt();

                    if (marks >= 90) {
                        System.out.println("This is Good");
                    } else if (marks >= 60) {
                        System.out.println("This is also Good");
                    } else if (marks >= 0) {
                        System.out.println("This is Good as well");
                    } else {
                        System.out.println("Invalid input. Marks should be between 0 and 100.");
                    }
                }
                System.out.println("want to continue ? (yes(1) or no(0))");
                choice = sc.nextInt();
            }while (choice== 1);
             ;
    }
}

