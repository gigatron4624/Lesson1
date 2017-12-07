package org.gigatron4624;
// This program uses secure hash algorithms to transmogrify various strings to hexadecimal hash values.
import static org.apache.commons.codec.digest.DigestUtils.sha1Hex; // imports SHA-1 from Commons Codec repository
import static org.apache.commons.codec.digest.DigestUtils.sha256Hex; // imports SHA-256 from Commons Codec repository
import static org.apache.commons.codec.digest.DigestUtils.sha384Hex; // imports SHA-384 from Commons Codec repository
import static org.apache.commons.codec.digest.DigestUtils.sha512Hex; // imports SHA-512 from Commons Codec repository

public class Lesson1{

    // SHA stands for Secure Hash Algorithm. Secure hash algorithms
    // Zahl is the German word for number.
    // hexus: hex = hexadecimal, u = unique, s = string
    // transmogrify: another word for convert or transform

    private String hexus1(String Zahl){ // uses SHA-1 to create a 160-bit hexadecimal string
        return sha1Hex(Zahl); // transmogrifies input string to a hexadecimal string through DigestUtils.sha1Hex()
    }

    private String hexus256(String Zahl) { // uses SHA-256 to create a 256-bit hexadecimal string
        return sha256Hex(Zahl); // transmogrifies input string to a hexadecimal string through DigestUtils.sha256Hex()
    }

    private String hexus384(String Zahl) { // uses SHA-384 to create a 384-bit hexadecimal string
        return sha384Hex(Zahl); // transmogrifies input string to a hexadecimal string through DigestUtils.sha384Hex()
    }

    private String hexus512(String Zahl) { // uses SHA-512
        return sha512Hex(Zahl); // transmogrifies input string to a hexadecimal string through DigestUtils.sha512Hex()
    }

    private void hd(String s){ // hd is short for hexadecimal, not high-definition
        String hd1 = hexus1(s); // assigns hexadecimal representation of SHA1 string to variable
        String hd256 = hexus256(s); // assigns hexadecimal representation of SHA256 string to variable
        String hd384 = hexus384(s); // assigns hexadecimal representation of SHA384 string to variable
        String hd512 = hexus512(s); // assigns hexadecimal representation of SHA512 string to variable

        int SL0 = s.length(); // returns the number of figures in the original string
        int SL1 = hd1.length(); // determines and stores the length of hexadecimal SHA1 string
        int SL256 = hd256.length(); // determines and stores the length of hexadecimal SHA256 string
        int SL384 = hd384.length(); // determines and stores the length of hexadecimal SHA384 string
        int SL512 = hd512.length(); // determines and stores the length of hexadecimal SHA512 string

        System.out.printf(s + "%n" + hd1 + "%n" + hd256 + "%n" + hd384 + "%n" + hd512); // prints strings to screen
        System.out.printf("%n" + SL0 + "%n" + SL1 + "%n" + SL256 + "%n" + SL384 + "%n" + SL512); // prints lengths of strings to screen
    }

    public static void main(String[] args) {
        Lesson1 code = new Lesson1(); // instance of class org.gigatron4624.Lesson1
        String eins = "Hey Mario! Look what I made!"; // eins is German for one
        String zwei = "It's a stone Luigi! You didn't make it!"; // zwei is German for two
        String drei = "It's a football! I chiseled it!"; // drei is German for three
        String vier = "Well, what are you waiting for? Throw me a pass!"; // vier is German for four

        code.hd(eins); // calls hd method
        System.out.println();
        code.hd(zwei); // calls hd method
        System.out.println();
        code.hd(drei); // calls hd method
        System.out.println();
        code.hd(vier); // calls hd method
    }
}
