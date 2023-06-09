package day6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class maskedCard {
    public static void main(String[] args) {
        String s = "4253-1254-9658-9966";
        String pat = "\\d{4}-\\d{4}-\\d{4}";
        Pattern pattern = Pattern.compile(pat);
        Matcher match = pattern.matcher(s);
        String res = match.replaceAll("XXXX-XXXX-XXXX");
        System.out.println(res);
    }
}
