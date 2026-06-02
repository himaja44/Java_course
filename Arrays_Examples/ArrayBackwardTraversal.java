public class ArrayBackwardTraversal {
    public static void main(String[] args){
        int[] arr={1,2,3,4,};
        int sum=0;
        int n=3;
        for(int i=n;i>=0;i--){
            sum=sum+arr[i];

        }
        System.out.println(sum);
    }   
}
