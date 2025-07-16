package Factory_design_pattern;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Notification notification = FactoryMethodClass.createNotification(input);
        notification.notifyUser();
    }
}


// IN ENGISH:

// In Factory Design Pattern, the responsibility of object creation is removed from the client and delegated to a separate factory class.
// The client only provides an input (like "EMAIL"), and the factory returns the correct object (like EmailNotification) based on that input.
// This hides the actual implementation details from the client and allows us to add new types easily without modifying the client code.
// This pattern is best for achieving loose coupling and scalability.

// IN HINGLISH
// Factory Design Pattern me hum object creation ka kaam client se hata kar ek separate factory class me daalte hain.
// Client sirf ek input deta hai (jaise "EMAIL"), aur factory uske basis par correct class ka object return karti hai
// (jaise EmailNotification). Isse client code ko actual implementation ke baare me pata nahi hota, aur hum easily naye
// types add kar sakte hain bina client code badle. Ye pattern loose coupling aur scalability ke liye best hota hai.

