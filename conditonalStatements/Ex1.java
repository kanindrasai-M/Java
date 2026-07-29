package conditonalStatements;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number_of_DaysInMonth = 0;
        String MonthOfName = "Unknown";

        System.out.println("Input a month number: ");
        int month = sc.nextInt();

        System.out.println("Enter Year: ");
        int year = sc.nextInt();

        switch(month) {
            case 1:
                MonthOfName = "January";
                number_of_DaysInMonth = 31;
                break;
            case 2:
                MonthOfName = "Febuary";
                if((year % 400 == 0 ) || ((year % 100 == 0) && (year % 4 == 0))) {
                    number_of_DaysInMonth = 29;
                }
                else {
                    number_of_DaysInMonth = 28;
                }
                break;
            case 3:
                MonthOfName = "March";
                number_of_DaysInMonth = 31;
                break;
            case 4:
                MonthOfName = "April";
                number_of_DaysInMonth = 30;
                break;
            case 5:
                MonthOfName = "May";
                number_of_DaysInMonth = 31;
                break;
            case 6:
                MonthOfName = "June";
                number_of_DaysInMonth = 30;
                break;
            case 7:
                MonthOfName = "July";
                number_of_DaysInMonth = 31;
                break;
            case 8:
                MonthOfName = "Augest";
                number_of_DaysInMonth = 31;
                break;
            case 9:
                MonthOfName = "September";
                number_of_DaysInMonth = 30;
                break;
            case 10:
                MonthOfName = "October";
                number_of_DaysInMonth = 31;
                break;
            case 11 :
                MonthOfName = "November";
                number_of_DaysInMonth = 30;
                break;
            case 12:
                MonthOfName = "December";
                number_of_DaysInMonth = 31;
                break;
            default:
                System.out.println("invalid input!");
                break;
        }
        System.out.print(MonthOfName + " " + year + " has " + number_of_DaysInMonth + " days\n");

    }
}
