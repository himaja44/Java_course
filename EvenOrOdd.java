import java.util.*;
public class EvenOrOdd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        if(n%2==0){//(((n/2)*2)==n)     // ((n&1)==0) in if conditions even or odd number
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
}