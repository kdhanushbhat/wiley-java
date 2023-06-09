package day1;
public class VariableArgs {
    public static void main(String[] args) {
        call(1000, 7640, 3200, 20);
        int[] ar = { 1000, 3200, 20 };
        call(ar);
    }

    public static void call(int... a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println("Sum: " + sum);
        if (sum > 10000) {
            System.out.println("Discount: " + (sum * 0.1));
            System.out.println("Total: " + (sum - (sum * 0.1)));
        } else {
            System.out.println("Total: " + sum);
        }
    }
}
