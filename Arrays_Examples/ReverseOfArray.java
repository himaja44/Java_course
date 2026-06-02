public class ReverseOfArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] result=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            result[i]=arr[arr.length-i-1];
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(result[i] + " ");
        }
    }
}
