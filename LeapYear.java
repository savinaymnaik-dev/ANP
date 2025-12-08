import java.util.Scanner;
public class LeapYear {
    public static boolean isLeap(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int yearInput = scanner.nextInt();
        scanner.close(); 
        
        if (isLeap(yearInput)) {
            System.out.println(yearInput + " is a LEAP YEAR");
        } else {
            System.out.println(yearInput + " is NOT a leap year");
        }
    }
}