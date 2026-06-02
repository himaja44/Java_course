public class MaximumElementInArray {
    public static void main(String[] args) {
        int[] arr={1,2,56,78,43};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println(max);
    }
}
