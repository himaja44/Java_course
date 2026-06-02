import java.util.*;
public class RevrseNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt(); 
        int rev=0;
        while(n!=0){
            int rev1=n%10;
            rev=rev*10+rev1;
            n=n/10;
        }
        System.out.println("Reverse of the number is: "+rev);
    }
}