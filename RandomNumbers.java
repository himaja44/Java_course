import java.util.Scanner;
public class RandomNumbers{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double d=Math.random();
        int r=(int) (d*11) +40;
       // System.out.println(d);
         int user=sc.nextInt();
       // System.out.println(r==user);
       System.out.println("Random Numbers is:" + r);
        sc.close();



        
    }
}