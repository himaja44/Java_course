import java.util.*;

public class MinutesAndHours {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hours = sc.nextInt();
        int minutes = sc.nextInt();
        int seconds = sc.nextInt();

        if(hours >= 0 && hours <= 23) {
            if(minutes >= 0 && minutes <= 59) {
                if(seconds >= 0 && seconds <= 59) {
                    System.out.println("Valid");
                } else {
                    System.out.println("Invalid");
                }
            } else {
                System.out.println("Invalid");
            }
        } else {
            System.out.println("Invalid");
        }

        sc.close();
    }
}
