import java.util.*;
public class PowerOfTwo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        while(n>1){
            if(n%2!=0){
                System.out.println("Not power of 2");
                return;
            }
            n/=2;
        }
        System.out.println("Is power of 2");

    }
}