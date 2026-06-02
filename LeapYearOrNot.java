import java.util.*;
public class LeapYearOrNot{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int year=2030;
        if(year%4==0 && year %100!=0 || year %400==0){
            System.out.println("Leap year");
        }
        else{
            System.out.println(" Not Leap year");

        }
    }
}