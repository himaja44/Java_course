public class Factors{
    public static void main(String[] args){
        int n=8;
        int count=0;
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n % i==0)
            sum=sum+i;
            //count++;
        }    
            //System.out.println(i);
            //System.out.println(count);
            System.out.println(sum);
        

    }
}