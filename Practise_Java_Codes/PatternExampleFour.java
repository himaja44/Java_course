public class PatternExampleFour {
    public static void main(String[] args){
        StringBuilder result=new StringBuilder();
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                result.append(j);
                if(j<i)
                    result.append(" ");
            }
            if(i<n)
                result.append("\n");
        }
        System.out.println(result.toString());
    }
}
