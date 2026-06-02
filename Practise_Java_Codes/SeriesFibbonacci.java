public class SeriesFibbonacci {
    public static void main(String[] args) {
        int n = 10; // Example input
        if(n < 0) {
            System.out.println("Invalid Input");
        } 
        int first=1,second=1;
        String result=" ";
        result +=first;
        if(n==1)
            System.out.println(result);
        result +=","+second;
        for(int i=3;i<=n;i++){
            int next=first+second;
            result +=","+next;
            first=second;
            second=next;
        }
        System.out.println(result);


    }
}
