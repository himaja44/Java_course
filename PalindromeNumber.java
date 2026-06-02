public class PalindromeNumber{
    public static void main(String[] args){
        int n=11153;
        int rev=0;
        int original=n;
        while(n>0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        if(rev==original)
        System.out.println("Palindrome");
        else
        System.out.println("Not");
    }
}