package day4;

public class log {
    public static void main(String[] args) {
        String timeStamp[] = new String[3];
        timeStamp[0] = "[" + String.valueOf(System.currentTimeMillis()) + "]";
        timeStamp[1] = "User-ID: 676";
        timeStamp[2] = "Logged in succesfully";
        System.out.println(String.join(" ", timeStamp));
    }

}
