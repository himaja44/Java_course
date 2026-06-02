import java.util.*;

public class Armstrong{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n;
        int digits = 0;

        // count digits
        while(temp > 0){
            digits++;
            temp = temp / 10;
        }

        temp = n;
        int sum = 0;

        // calculate power sum
        while(temp > 0){
            int rem = temp % 10;
            sum += Math.pow(rem, digits);
            temp = temp / 10;
        }

        if(sum == n){
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}