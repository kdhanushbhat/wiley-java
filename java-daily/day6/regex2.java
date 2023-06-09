package day6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex2 {
    public static void main(String[] args) {
        String s = "http://www.wileyedge.com 56";
        String pat = "\\d";
        Pattern pattern = Pattern.compile(pat);
        Matcher match = pattern.matcher(s);
        while (match.find()) {
            System.out.println(match.start() + " " + match.end());
            System.out.println(match.matches());
            System.out.println(match.start() + " " + match.end());

        }
    }
}
