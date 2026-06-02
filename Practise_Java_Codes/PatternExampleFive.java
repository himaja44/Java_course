public class PatternExampleFive {
    public static void main(String[] args){
        int n=5;
        StringBuilder result=new StringBuilder();
        for(int i=1;i<=n;i++){
        char ch=(i%2==1)?'1':'0';
        for(int j=1;j<=n;j++){
            result.append(ch).append(" ");
            if(j<n)
                result.append(" ");
        }
        if(i<n)
            result.append("\n");
    }
    System.out.println(result.toString());
}
}
