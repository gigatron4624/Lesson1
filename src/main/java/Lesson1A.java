import static org.apache.commons.codec.digest.DigestUtils.*;
public class Lesson1A extends Lesson1{
    public static boolean SH1LC(String s){
        return hexus1(s).length() == 40;
    } public static boolean SH256LC(String s){
        return hexus256(s).length() == 64;
    } public static boolean SH384LC(String s){
        return hexus384(s).length() == 96;
    } public static boolean SH512LC(String s){
        return hexus512(s).length() == 128;
    } public static void HashCheck(String s){
        if (!SH1LC(s) || !SH256LC(s) || !SH384LC(s) || !SH512LC(s)) {
            System.out.println("Error: Invalid String!");
        } else {
            System.out.println("Yay!");
        }
    } public static void main(String[] args) {
        String eins = "Hey Mario! Look what I made!";
        String zwei = "It's a stone Luigi! You didn't make it!";
        String drei = "It's a football! I chiseled it!";
        String vier = "Well, what are you waiting for? Throw me a pass!";
        HashCheck(eins);
        HashCheck(zwei);
        HashCheck(drei);
        HashCheck(vier);
    }
}