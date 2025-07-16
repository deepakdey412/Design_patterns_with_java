package Singleton_design_pattern;

public class Main {
    public static void main(String args[]){
        //Calling samosa
        Samosa s1 = Samosa.getSamosa();
        System.out.println(s1.hashCode());

        Samosa s2 = Samosa.getSamosa();
        System.out.println(s2.hashCode());

        //Calling jalebi
        Jalebi j1 = Jalebi.getJalebi();
        System.out.println(j1.hashCode());

    }
}
