package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        Pattern pattern = Pattern.compile("[^a-z0-9 ]");
        Matcher match = pattern.matcher("asd-");
        boolean matchFound = match.find();

        System.out.println(matchFound);


    }
}
