public class PatternExamplleSix {
    public static void main(String[] args) {
        StringBuilder result=new StringBuilder();
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                result.append(j);
                //n++;

            }
            //if(i!=n)
                result.append("\n");
        }
        System.out.println(result.toString());
    }
}
