package Singleton_design_pattern;

public class Samosa {
    //For reference
    private static Samosa samosa;

    //Creation of sonstructor
    private Samosa(){
        // private constructor: direct object creation prevent
    }

    //Creating method to make the constructor and will return the object
    public static Samosa getSamosa(){
        if (samosa==null){
            samosa = new Samosa();
        }
        return samosa;
    }
}


/**
 * Singleton pattern ka use hum tab karte hain jab hume pure project me
 * kisi class ka sirf ek hi object banana ho (jaise Logger, ConfigManager,
 * Database Connection, etc).
 *
 * Isme object create karne ka kaam ek static method (usually getInstance())
 * karta hai, jo sirf pehli baar object banata hai aur baad me wahi object
 * baar-baar return karta hai.
 *
 * Chahe tum kitne bhi references banao (logger1, logger2), agar wo sab
 * getInstance() se ban rahe hain to sab same memory location (object) ko
 * point karte hain.
 *
 * Yehi reason hai ki agar tum ek reference se kuch data set karte ho
 * (setLogLevel("DEBUG")), to wo change baaki references me bhi reflect hota hai.
 *
 * Is pattern ko hum tab use karte hain jab hume global access point chahiye ho
 * kisi resource ka, bina baar-baar naya object banaye.
 *
 * Lekin haan, ye normal class jaise Student, Product, etc ke liye use nahi hota —
 * unka har object alag hona chahiye.
 *
 * Singleton mainly shared services ke liye hota hai jaha ek hi instance sufficient hai.
 */
