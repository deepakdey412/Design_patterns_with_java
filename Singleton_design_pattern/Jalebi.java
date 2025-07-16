package Singleton_design_pattern;

public class Jalebi {
    // Static variable to hold the single instance of Singleton_design_pattern.Jalebi
    private static Jalebi jalebi;

    // Private constructor to prevent instantiation from outside the class
    private Jalebi() {
        // Constructor is private so no one else can create an object of this class
    }

    // Public method to provide access to the single instance
    public static Jalebi getJalebi() {
        // First check: If the instance is null, only then proceed to create
        if (jalebi == null) {
            // Synchronize on the class to make it thread-safe
            synchronized (Jalebi.class) {
                // Second check: Still ensure instance is null to avoid race condition
                jalebi = new Jalebi(); // Create the singleton instance
            }
        }
        return jalebi; // Return the single instance
    }
}


//🧁 Jalebi Analogy (Same as Your Class Name 😄):
//
//Ek halwai (sweet maker) shop me ek hi Jalebi-maker machine ho — sab customer usi machine ka use karte hain.
//
//Machine bar-bar nayi banayi nahi jaati, ek hi machine sabko serve karti hai.
//
//Waise hi, Singleton ek aisi class hai jiska sirf ek hi object banaya jata hai — aur sab jagah wahi reuse hota hai.