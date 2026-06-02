public class Bitwise{
    public static void main(String[] args){
        int a=5;
        int b=4;
        int c=a&b;//bitwise AND
        int d=a|b;//bitwise OR
        int e=a^b;//bitwise XOR
        
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(~a);//bitwise NOT
        System.out.println(a<<3);//LeftShift
        System.out.println(a>>1);//RightShift
    }
}