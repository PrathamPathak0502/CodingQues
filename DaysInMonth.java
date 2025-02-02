import java.util.Scanner;

public class DaysInMonth {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a month number (1-12): ");
    int month = scanner.nextInt();

    System.out.print("Enter year: ");
    int year = scanner.nextInt();

    int days = getDaysInMonth(month, year);

    if (days > 0) {
      System.out.println(month + " " + year + " has " + days + " days.");
    } else {
      System.out.println("Invalid month or year.");
    }

    scanner.close();
  }

  public static int getDaysInMonth(int month, int year) {

    if (month < 1 || month > 12) {
      return -1;
    }

    
    if (month == 2) {
      if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        return 29;
      } else {
        return 28;
      }
    }


    else if (month == 4 || month == 6 || month == 9 || month == 11) {
      return 30;
    }

    else {
      return 31;
    }
  }
}
//Addvance java concepts