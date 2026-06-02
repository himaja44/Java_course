public class SpyNumber{
    public static void main(String[] args){
        int n=12345;
        int sum=0;
        int product=1;
        while(n>0){
            int d=n%10;
            sum=sum+d;
            product=product+d;
        }
        System.out.println(sum);
        System.out.println(product);
        if(sum==product)
        System.out.println("Spy Number");
        else
        System.out.println("Not");
    }
}