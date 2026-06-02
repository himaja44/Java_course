public class ReversePerfectNumber {
    public static void main(String[] args){
        StringBuilder result=new StringBuilder();
        int n=5;
        for(int i=1;i<=n;i++){
            int val=i*i;for(int j=1;j<=i;j++){
                result.append(val);
                if(j<i)
                    result.append(" ");
            }
            if(i>1)
                result.append("\n");
        }
        System.out.println(result.toString());
    }
}
