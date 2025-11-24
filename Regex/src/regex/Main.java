package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static void main() {
        Pattern pattern = Pattern.compile("[0-9]{3}-[0-9]{3}-[0-9]{4}]");
        Matcher matcher = pattern.matcher("557-885-9657");
        boolean result = matcher.matches();
        System.out.println(result);

        Pattern pattern2 = Pattern.compile("[a-z]+");
        Matcher matcher2 = pattern2.matcher("This is a Text 8776");
        boolean result2 = matcher2.matches();
        System.out.println(result2);
        while (matcher2.find()){
            System.out.println(matcher2.group());
        }

        // replace example
        String text = "Phone Numbers 234-343-9987 998-097-3215 554-677-9832";
        String changed = text.replaceAll("([0-9]{3})-([0-9]{3}-[0-9]{4})", "$1-xxx-xxxx");
        System.out.println("Original String: " + text);
        System.out.println("Replaced String: "+ changed);

    }
}
