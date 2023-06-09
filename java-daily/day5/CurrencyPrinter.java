package day5;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyPrinter {

    public static void rupee_dollar(int control, int val) {
        System.out.format("%.2f", (val * Math.pow(82, control)));
    }

    public static void dollar_eruo(int control, int val) {
        System.out.format("%.2f", (val * Math.pow(1.10, control)));
    }

    public static void rupee_euro(int control, int val) {
        System.out.format("%.2f", (val * Math.pow(90, control)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input currency 1:INR 2:USD 3:EURO");
        int from = sc.nextInt();
        System.out.println("Enter the output currency 1:INR 2:USD 3:EURO");
        int to = sc.nextInt();
        System.out.println("Enter the value to convert");
        int val = sc.nextInt();
        if (from == 1 && to == 2)
            rupee_dollar(-1, val);
        else if (from == 2 && to == 1)
            rupee_dollar(1, val);
        else if (from == 2 && to == 3)
            dollar_eruo(-1, val);
        else if (from == 3 && to == 2)
            dollar_eruo(1, val);
        else if (from == 1 && to == 3)
            rupee_euro(-1, val);
        else if (from == 3 && to == 1)
            rupee_euro(1, val);
        else
            System.out.println("Invalid inputs");
        sc.close();
    }
}
