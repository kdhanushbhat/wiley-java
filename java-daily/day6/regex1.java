package day6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex1 {
    public static void main(String[] args) {
        String s = "Ab ad ut";
        String pat = "..";
        Pattern pattern = Pattern.compile(pat);
        Matcher match = pattern.matcher(s);
        while (match.find()) {
            System.out.println(match.start() + " " + match.end());
        }
    }
}
