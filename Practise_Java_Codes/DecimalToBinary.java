import java.util.*;
public class DecimalToBinary{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        while(n>0){
            int rem=n%2;
            System.out.print(rem);
            n=n/2;
        }
        sc.close();
    }
}