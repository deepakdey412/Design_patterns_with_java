package Factory_design_pattern;

public class FactoryMethodClass{

    public static Notification createNotification(String input){

        if(input == null || input.isEmpty()){
            return null;
        }

        switch (input.toUpperCase()){
            case "SMS" :
                return new SmsNotification();
            case "EMAIL" :
                return new EmailNotification();
            case "MISSCALL" :
                return new MissCallNotification();
            default:
                throw new IllegalArgumentException("Unknown notification type " + input);

        }
    }

}
