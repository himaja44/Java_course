public class SeperationOfDigits{
    public static void main(String[] args){
        int n=5463;
        int count=0,sum=0,product=1;
        while(n>0){
            int d=n%10;
            n=n/10;
            count++;
            sum=sum+d;
            product=product*d;
           System.out.println(d + " ");
            
        }
        System.out.println(sum);
        System.out.println(count);
        System.out.println(product);
            
    }
}