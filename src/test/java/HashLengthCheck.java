import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HashLengthCheck {
    public String s = "Join the dark side!";
    @Test
    public void testHd() throws Exception {
        int SHA1L = Lesson1.hexus1(s).length();
        int SHA256L = Lesson1.hexus256(s).length();
        int SHA384L = Lesson1.hexus384(s).length();
        int SHA512L = Lesson1.hexus512(s).length();
    }

}