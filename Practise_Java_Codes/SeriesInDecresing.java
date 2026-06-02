public class SeriesInDecresing {
    public static void main(String[] args) {
        String output=" ";
        int n=1;
        int num=n;
        int step=1;
        while(num>100){
            if(output.length()==0)
                output=output+num;
            else
                output=output+","+num;
                num=num-step;
                step++;

        }
        System.out.println(output);
    }
}
