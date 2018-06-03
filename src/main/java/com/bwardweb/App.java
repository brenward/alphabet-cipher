package com.bwardweb;

import com.bwardweb.encoder.Encoder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        String keyword1 = "bond";
        String message1 = "theredfoxtrotsquietlyatmidnight";
        String keyword2 = "train";
        String message2 = "murderontheorientexpress";
        String keyword3 = "garden";
        String message3 = "themolessnuckintothegardenlastnight";

        Encoder encoder = new Encoder();

        System.out.println(encoder.encodeString(keyword1,message1));
        System.out.println(encoder.encodeString(keyword2,message2));
        System.out.println(encoder.encodeString(keyword3,message3));

    }
}
