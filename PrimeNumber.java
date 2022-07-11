package interviewEx;

//A prime number is a natural number greater than 1 that has no positive divisors
// other than 1 and itself.
//Write a method that checks if a number is a prime number.

public class PrimeNumber {
    public Boolean isPrime(Integer n) {
        boolean result = true;
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                result = false;
            }
        }

        return result;
    }

    public static void main(String[] args) {

//        PrimeNumber primeNumber = new PrimeNumber();
        System.out.println(new PrimeNumber().isPrime(38973));
    }
}
