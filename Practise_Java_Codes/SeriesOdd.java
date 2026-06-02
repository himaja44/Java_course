public class SeriesOdd {
    public static void main(String[] args) {
        int n=10;
        int num=1;
        String output=" ";
        while(num<=n){
            if(output.length()==0)
                output=output+num;
            else
                output=output+","+num;
                num=num*2+1;


        }
        System.out.println(output);
    }
}
