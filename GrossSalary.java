import java.util.*;
public class GrossSalary{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double basicSalary=sc.nextDouble();
        double hra,da,gross;
        if(basicSalary<=10000){
            hra=0.20*basicSalary;
            da=0.80*basicSalary;
        }
        else if(basicSalary<=20000){
            hra=0.25*basicSalary;
            da=0.90*basicSalary;
        }
        else{
            hra = 0.30 * basicSalary;
            da  = 0.95 * basicSalary;

        }
        gross=basicSalary+hra+da;
        System.out.printf("Rs.%2f" ,gross);

    }

}