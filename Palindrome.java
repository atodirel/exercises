package interviewEx;

import java.util.Arrays;

public class Palindrome {
    public boolean isPalindrome(String word) {

        boolean result = false;
        int length = word.length();
        char[] chars = new char[length];
        char[] chars1 = new char[length];
        for (int i=0; i<word.length(); i++){
            chars[i] = word.charAt(i);
            chars1[length-1] = word.charAt(i);
            length--;
        }

        if(Arrays.equals(chars, chars1)) {
            result = true;
            System.out.println("palindrome");
        }

        return result;


//        int i1 = 0;
//        int i2 = word.length() - 1;
//        while (i2 > i1) {
//            if (word.charAt(i1) != word.charAt(i2)) {
//                return false;
//            }
//            ++i1;
//            --i2;
//        }
//        return true;
    }

    public static void main(String[] args) {
        new Palindrome().isPalindrome("maaam");
    }

}
