public class SeriesPrimeNumbers {
    
    public static void main(String[] args) {
        String output = "";
        int n = 20; 

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                if (output.length() == 0)
                    output = output + i;
                else
                    output = output + "," + i;
            }
        }

        System.out.println(output);
    }

    // method should be outside main
    public static boolean isPrime(int num) {
        if (num < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}