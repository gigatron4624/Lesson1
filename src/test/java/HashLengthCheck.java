package org.gigatron4624;
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

    public String woeisme(int x) { // This error message indicates that the test is unsuccessful.
        return "I didn't get " + x + " bytes! Oh noes!"; // Successful tests don't print this error message.
    }
    @Test // The test is right below this line.
    public void testHd() throws Exception { // checks byte count (or length) of each hex string through TestNG
        int SHA1L = sha1Hex(s).length(); // length of SHA-1 hex string
        Assert.assertTrue(SHA1L == 40, woeisme(SHA1L)); // asserts that the SHA-1 hex string takes 40 hex bytes

        int SHA256L = sha256Hex(s).length(); // length of SHA-256 hex string
        Assert.assertTrue(SHA256L == 64, woeisme(SHA256L)); // asserts that the SHA-256 hex string takes 64 hex bytes

        int SHA384L = sha384Hex(s).length(); // length of SHA-384 hex string
        Assert.assertTrue(SHA384L == 96, woeisme(SHA384L)); // asserts that the SHA-384 hex string takes 96 hex bytes

        int SHA512L = sha512Hex(s).length(); // length of SHA-512 hex string
        Assert.assertTrue(SHA512L == 128, woeisme(SHA512L)); // asserts that the SHA-512 hex string takes 128 hex bytes
    }
}
