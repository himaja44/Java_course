public class ArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr={1,4,6,8,9};
        boolean isSorted=true;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted.");
        }
        else{
            System.out.println("The array is not sorted.");
        }
    }
}
