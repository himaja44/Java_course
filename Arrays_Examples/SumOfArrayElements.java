public class SumOfArrayElements {
    public static void main(String[] args){
        int[] arr={1,4,6,2};
        int sum=0;
        for(int i=1;i<=arr.length-1;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
