import java.util.*;
public class XAndYRandom{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value of x");
        int x=sc.nextInt();
         System.out.println("Enter a value of y");
        int y=sc.nextInt();
        int r= x+ (int)(Math.random() *(y-x+1));
        System.out.println("Enter your guess number: ");
        int user=sc.nextInt();
        if(user==r){
            System.out.println("Correct you guesses right");
        }
        else{
            System.out.println("The correct guess was: " +r);
        }
        sc.close();

    }
}