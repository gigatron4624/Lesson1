package org.gigatron4624;
/* This file uses TestNG to check if the lengths of the hash values are as expected when hashing different inputs.
* TestNG is an upgrade compared to JUnit, the original Java unit testing framework.
* The main method is optional for this test class and is thus excluded. */

import static org.apache.commons.codec.digest.DigestUtils.sha1Hex;
import static org.apache.commons.codec.digest.DigestUtils.sha256Hex;
import static org.apache.commons.codec.digest.DigestUtils.sha384Hex;
import static org.apache.commons.codec.digest.DigestUtils.sha512Hex;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HashLengthCheck {

    private String s = "Join the light side!"; // this is a test string

    /* WoeIsMe: error message indicating that the actual and expected lengths don't match */
    public String WoeIsMe(int x) {
        return "I didn't get " + x + " bytes! Oh noes!";
    }
    @Test // The test is right below this line.

    /* testHd: checks byte count (or length) of each hex string through TestNG assertion methods
    * testHd throws an exception if the actual and expected lengths of any hex string do not match.
    * If testHd doesn't throw an exception, the assertion methods pass */
    public void testHd() throws Exception {

        int SHA1L = sha1Hex(s).length(); // length of SHA-1 hex string

        // asserts that the SHA-1 hex string takes 40 hex bytes
        Assert.assertTrue(SHA1L == 40, WoeIsMe(SHA1L));

        int SHA256L = sha256Hex(s).length(); // length of SHA-256 hex string

        // asserts that the SHA-256 hex string takes 64 hex bytes
        Assert.assertTrue(SHA256L == 64, WoeIsMe(SHA256L));

        int SHA384L = sha384Hex(s).length(); // length of SHA-384 hex string

        // asserts that the SHA-384 hex string takes 96 hex bytes
        Assert.assertTrue(SHA384L == 96, WoeIsMe(SHA384L));

        int SHA512L = sha512Hex(s).length(); // length of SHA-512 hex string

        // asserts that the SHA-512 string takes 128 hex bytes
        Assert.assertTrue(SHA512L == 128, WoeIsMe(SHA512L));
    }
}
