import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int days;
        int hours;
        int minutes;
        int seconds;
        int weeks;


        System.out.print("Enter the number of weeks: ");
        weeks = input.nextInt();
        days = weeks * 7;
        System.out.println(days + " days. ");

        hours = weeks * 168;
        System.out.println(hours + " hours. ");

        minutes = weeks * 10080;
        System.out.println(minutes + " minutes. ");

        seconds = weeks * 604800;
        System.out.println(seconds + " seconds. ");

    }
}






