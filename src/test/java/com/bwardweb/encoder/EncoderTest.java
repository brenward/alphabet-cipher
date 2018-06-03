package com.bwardweb.encoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EncoderTest {

    Encoder encoder;

    @Before
    public void setup(){
        encoder = new Encoder();
    }

    @Test(expected = NullPointerException.class)
    public void testEncodeString_inValidKeyWord(){
        String keyword = null;
        String message = "myunencodedtestmessage";
        encoder.encodeString(keyword,message);
    }

    @Test(expected = NullPointerException.class)
    public void testEncodeString_inValidMessage(){
        String keyword = "test";
        String message = null;
        encoder.encodeString(keyword,message);
    }

    @Test
    public void testEncodeString_notNullValidInput(){
        String keyword = "test";
        String message = "myunencodedtestmessage";
        Assert.assertTrue(encoder.encodeString(keyword,message) != null);
    }

    @Test
    public void testEncodeString_notEmptyValidInput(){
        String keyword = "test";
        String message = "myunencodedtestmessage";
        Assert.assertTrue(!encoder.encodeString(keyword,message).equals(""));
    }

    @Test
    public void testEncodeString_correctInput(){
        String keyword = "snitch";
        String message = "thepackagehasbeendelivered";
        Assert.assertTrue(encoder.encodeString(keyword,message).equals("lumicjcnoxjhkomxpkwyqogywq"));
    }
}
