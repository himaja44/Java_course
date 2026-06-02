public class ArrayEvenOrOdd {
    public static void main(String[] args) {
        int[] arr={1,4,5,6};
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]+" is even");
            }
            else{
                System.out.println(arr[i]+" is odd");
            }
        }
    }
}
