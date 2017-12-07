// This code uses TestNG to check if the lengths of the hash values are as expected when hashing different inputs.
import static org.apache.commons.codec.digest.DigestUtils.sha1Hex;
import static org.apache.commons.codec.digest.DigestUtils.sha256Hex;
import static org.apache.commons.codec.digest.DigestUtils.sha384Hex;
import static org.apache.commons.codec.digest.DigestUtils.sha512Hex;
import org.testng.Assert;
import org.testng.annotations.Test;
//
public class HashLengthCheck {
    private String s = "Join the light side!"; // this is a test string
    public String victory(int x) {
        return "I got " + x + " bytes! Dilly Dilly!";
    }
    @Test
    public void testHd() throws Exception {
        int SHA1L = sha1Hex(s).length();
        String M1 = victory(SHA1L);
        Assert.assertTrue(SHA1L == 40, M1);
        int SHA256L = sha256Hex(s).length();
        String M256 = victory(SHA256L);
        Assert.assertTrue(SHA256L == 64, M256);
        int SHA384L = sha384Hex(s).length();
        String M384 = victory(SHA384L);
        Assert.assertTrue(SHA384L == 96, M384);
        int SHA512L = sha512Hex(s).length();
        String M512 = victory(SHA512L);
        Assert.assertTrue(SHA512L == 128, M512);
    }
}
