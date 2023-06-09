package day5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {

    public static void main(String[] args) {
        String s = "Pattern is beutiful is pattern";
        Pattern pattern = Pattern.compile("Pattern", Pattern.CASE_INSENSITIVE);
        Matcher match = pattern.matcher(s);
        while (match.find()) {
            System.out.println(match.start() + " to " + match.end());
        }
    }
}
