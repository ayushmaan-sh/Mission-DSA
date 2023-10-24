package MissionDSA.BitwiseManipulation;

public class BitwiseOperators {

    public static void main(String[] args) {
        System.out.println("Binary AND of 5,6 : "+(5 & 6));  // only 1 and 1 will return 1.
        System.out.println("Binary OR of 5,6 : "+(5 | 6));  // only 0 and 0 will return 0.
        System.out.println("Binary XOR of 5,6 : "+(5 ^ 6)); // XOR of different bits will be 1
                                                            // and if the bits are same it'll be 0

        //binary 1's compliment
        System.out.println(~5); // the process for the ouput (-6) is the conversion of 1's to 2's compliment

        //binary left shift <<
        // if a << b, and if a = 00010110 b = 2, then it means a is shifting by b places.
        // Derivation -> a * 2 to the power b
        System.out.println("left shift of 5 by 2 is : "+ (5<<2) );

        //binary right shift >> , Opposite of left shift
        // Derivation -> a / 2 to the power b
        System.out.println("right shift of 5 by 2 is : "+ (5>>2) );
    }
}
