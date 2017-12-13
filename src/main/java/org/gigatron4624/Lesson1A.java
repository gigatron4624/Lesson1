package org.gigatron4624;
/* This program simply checks if the secure hash algorithms yield the correct output for all input strings.
* The program is now expendable since TestNG assertion methods validate lengths of secure hash algorithms. */

import static org.apache.commons.codec.digest.DigestUtils.sha1Hex;
import static org.apache.commons.codec.digest.DigestUtils.sha256Hex;
import static org.apache.commons.codec.digest.DigestUtils.sha384Hex;
import static org.apache.commons.codec.digest.DigestUtils.sha512Hex;

public class Lesson1A {

    /* Private Methods */

    /* checks if SHA-1 hash has 40 hexadecimal bytes, or 160 bits */
    private boolean SH1LC(String s){
        return sha1Hex(s).length() == 40;
    }

    /* checks if SHA-1 hash has 64 hexadecimal bytes, or 256 bits */
    private boolean SH256LC(String s){
        return sha256Hex(s).length() == 64;
    }

    /* checks if SHA-1 hash has 96 hexadecimal bytes, or 384 bits */
    private boolean SH384LC(String s){
        return sha384Hex(s).length() == 96;
    }

    /* checks if SHA-1 hash has 128 hexadecimal bytes, or 512 bits */
    private boolean SH512LC(String s){
        return sha512Hex(s).length() == 128;
    }

    /* This method validates whether hex strings follow standard procedure. */
    private void HashCheck(String s){

        // all four boolean methods must return true
        if (!SH1LC(s) || !SH256LC(s) || !SH384LC(s) || !SH512LC(s)) {
            System.out.println("Off to the Pit of Misery!"); // The algorithms don't work.
        }
        else {
            System.out.println("Yay!"); // The algorithms work! Dilly dilly!
        }
    }

    /* Main Method */
    /* The main method contains the sample strings and calls the HashCheck method. */
    public static void main(String[] args) {

        // pgm is short for program
        Lesson1A pgm = new Lesson1A(); // creates instance of class

        /* sample strings*/
        String eins = "The cake is a lie!"; // eins is German for 1
        String zwei = "I like turtles!"; // zwei is German for 2
        String drei = "It's a me! Mario!"; // drei is German for 3
        String vier = "Game Over Yeah!!!!!!!!!!!"; // vier is German for 4

        pgm.HashCheck(eins); // runs first sample string through HashCheck
        pgm.HashCheck(zwei); // runs second sample string through HashCheck
        pgm.HashCheck(drei); // runs third sample string through HashCheck
        pgm.HashCheck(vier); // runs last sample string through HashCheck
    }
}
