import java.util.Scanner;

public class ProgramA1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        int rem1 = year % 4;
        int rem2 = year % 100;
        int rem3 = year % 400;

        switch (rem1) {
            case 0:
                switch (rem2) {
                    case 0:
                        switch (rem3) {
                            case 0:
                                System.out.println(year + " is a leap year.");
                                break;
                            default:
                                System.out.println(year + " is not a leap year.");
                                break;
                        }
                        break;
                    default:
                        System.out.println(year + " is a leap year.");
                        break;
                }
                break;
            default:
                System.out.println(year + " is not a leap year.");
                break;
        }
    }
}
