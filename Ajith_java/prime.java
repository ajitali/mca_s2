public class prime {
    public static void main(String[] args) {
        int n = 25; // number to check for primality
        boolean isPrime = true;
        
        if (n <= 1) {
            System.out.println("Number must be greater than 1.");
            isPrime = false;
        } else {
            for (int i=2; i*i<=n; ++i){
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        if (isPrime) {
            System.out.print("The number " + n + " is a prime number.");
        } else {
            System.out.println("The number " + n + " is not a prime number.");
        }
    }
}

    