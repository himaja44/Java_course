public class IncrementAndDecrement{
    public static void main(String[] args){
        int a=5;
        int b=4;
        int c=a++ + ++a + --b + b--;
        System.out.println(c);
    }
}