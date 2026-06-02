public class PatternExampleTwo {
    public static void main(String[] args){
        String result=" ";
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j){
                    result +=i+" ";
                }else{
                    result +="0 ";
                }
            }
            result +=" \n ";
        }
        System.out.println(result);
    }
}
