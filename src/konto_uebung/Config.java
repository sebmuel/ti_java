package konto_uebung;

import java.util.HashMap;

public class Config {

    private static final HashMap<String, String> messageMap = new HashMap<>();
    // static Block to fill our map
    static{
        messageMap.put("welcome", "Willkommen bei ihrer Bank faggot :)");
        messageMap.put("promptUserInput", "Bitte wählen Sie: ");
    }

    public static String getMessage(String messageKey){
        return messageMap.get(messageKey);
    }
}
