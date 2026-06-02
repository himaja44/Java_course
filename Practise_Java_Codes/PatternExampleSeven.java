public class PatternExampleSeven {
    public static void main(String[] args) {
        StringBuilder result=new StringBuilder();
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==n-i+1)
                    result.append("*").append(" ");
                else
                    result.append(j).append(" ");
            }
            if(i!=n)
                result.append("\n");
        }
        System.out.println(result.toString());
    }
}
