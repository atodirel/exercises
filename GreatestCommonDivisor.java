package interviewEx;

//The Greatest Common Divisor of two positive integers is the largest integer that divides both without remainder.
//Write a method that returns the Greatest Common Divisor of p and q.

public class GreatestCommonDivisor {
    public Integer gcd(Integer p, Integer q) {
//        Integer greatestDivisor = 1;
//        int min = p;
//        if (p > q) min = q;
//
//        for (int i = min; i > 0; i--){
//            if (p % i == 0 && q % i == 0) {
//                greatestDivisor = i; break;
//            }
//        }
//        return greatestDivisor;

        if (q == 0) {
            return p;
        }
        return gcd(q, p % q);
    }

    public static void main(String[] args) {
        System.out.println("greatest common divisor is: " + new GreatestCommonDivisor().gcd(42,15));
    }
}
