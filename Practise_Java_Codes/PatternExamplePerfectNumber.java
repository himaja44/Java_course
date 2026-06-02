public class PatternExamplePerfectNumber {
    public static void main(String[] args){
        String result=" ";
        int n=5;
        for(int i=1;i<=n;i++){
            result +="0 ";
            for(int j=1;j<=i;j++){
                result +=(int) Math.pow(i,j)+" ";
            }
            result +=" \n ";
        }
        System.out.println(result);
    }
}
