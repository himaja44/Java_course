import java.util.*;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        char op = sc.next().charAt(0);   // fixed input line

        switch(op) {   // switch should be lowercase

            case '+':
                System.out.println(val1 + "+" + val2 + "=" + (val1 + val2));
                break;

            default:
                System.out.println("Invalid");
        }
    }
}
