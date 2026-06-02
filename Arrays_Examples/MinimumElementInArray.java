public class MinimumElementInArray {
    public static void main(String[] args) {
        int[] arr={34,76,97,43,21,1};
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println(min);
    }
}
