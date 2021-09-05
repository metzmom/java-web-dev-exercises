package org.launchcode.java.demos.lsn1datatypes;

public class Message {

    public static String getMessage(String lang) {

        if (lang.equals("sp")) {
            return "¡Hola, Cuidad Mundo!";
        } else if (lang.equals("fr")) {
            return "Bonjour, le city le monde!";
        } else if (lang.equals("jive")) {
            return "Jive talking, keepin it real!";
        } else {
            return "Hello,City World!";
        }
    }
}
