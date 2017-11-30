import static org.apache.commons.codec.digest.DigestUtils.*;
public class Lesson1{
    public static String hexus1(String Zahl){
        return sha1Hex(Zahl);
    } public static String hexus256(String Zahl) {
        return sha256Hex(Zahl);
    } public static String hexus384(String Zahl) {
        return sha384Hex(Zahl);
    } public static String hexus512(String Zahl) {
        return sha512Hex(Zahl);
    } public static void hd(String s){
        String hd1 = hexus1(s);
        String hd256 = hexus256(s);
        String hd384 = hexus384(s);
        String hd512 = hexus512(s);
        int SL0 = s.length();
        int SL1 = hd1.length();
        int SL256 = hd256.length();
        int SL384 = hd384.length();
        int SL512 = hd512.length();
        System.out.printf(s + "%n" + hd1 + "%n" + hd256 + "%n" + hd384 + "%n" + hd512);
        System.out.printf("%n" + SL0 + "%n" + SL1 + "%n" + SL256 + "%n" + SL384 + "%n" + SL512);
    } public static void main(String[] args) {
        String eins = "Hey Mario! Look what I made!";
        String zwei = "It's a stone Luigi! You didn't make it!";
        String drei = "It's a football! I chiseled it!";
        String vier = "Well, what are you waiting for? Throw me a pass!";
        hd(eins);
        System.out.println();
        hd(zwei);
        System.out.println();
        hd(drei);
        System.out.println();
        hd(vier);
    }
}