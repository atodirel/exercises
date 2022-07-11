package interviewEx;

//The Ceasar cipher is a basic encryption technique used by Julius Ceasar
// to securely communicate with his generals. Each letter is replaced by another
// letter N positions down the english alphabet. For example, for a rotation of 5,
// the letter 'c' would be replaced by an 'h'. In case of a 'z', the alphabet rotates and it is transformed into a 'd'.
//Implement a decoder for the Ceasar cipher where N = 5.
//TIP: Use code.toCharArray() to get an array of characters.

import java.util.stream.IntStream;

public class CaesarCipher {

    public String decode(String code) {
        String decoded = "";

//        char[] chars = code.toCharArray();
//        for (char c : chars) {
//            if (c >= 118){
//                int i = 96 + (5 - (122 - c));
//                c = (char) i;
//            } else{
//                c += 5;
//            }
//            decoded += c;
//        }

        int lastCharValue = 'z';
        int alphabetLength = 'z' -'a' + 1;
        for(char c : code.toCharArray()){
            int charNoRotation = c + 5;
            int charValue = charNoRotation < lastCharValue ? charNoRotation : charNoRotation - alphabetLength;
            decoded += (char)charValue;
        }
        return decoded;
    }

    public static void main(String[] args) {
        System.out.println(new CaesarCipher().decode("xvm"));
    }
}
