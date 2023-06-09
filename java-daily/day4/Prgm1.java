package day4;

public class Prgm1 {
    public static void main(String[] args) {
        String s1 = "s1";
        String s2 = "s500";
        s1 = s2;
        String s3 = new String("s3");
        String s4 = new String("s3");
        String s5 = s1.concat(" " + s3);
        System.out.println(s1);
        System.out.println(s1 == s2);
        System.out.println(s5.split(" "));

    }
}
