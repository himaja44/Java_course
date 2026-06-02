public class PatternExampleThree {
    public static void main(String[] args){
        String result=" ";
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=i;j++){
                result +=j+" ";
            }
            result +="\n";
        }
        System.out.println(result);
    }
}
