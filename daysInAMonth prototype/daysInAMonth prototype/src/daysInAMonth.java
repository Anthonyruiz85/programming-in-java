import java.util.Calendar;
import java.util.*;

class daysInAMonth {
  public static void main(String[] args) {    

    Scanner userInput = new Scanner(System.in);

    System.out.println("Please enter a month number: ");//userinput
    int userMonth = userInput.nextInt();
    System.out.println("Please enter the year: ");
    int userYear= userInput.nextInt();

     Calendar calendar = new GregorianCalendar(userYear, userMonth, 0);
    System.out.printf("The number of days in month %s in the year %s is %s",userMonth, userYear, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

  }
}