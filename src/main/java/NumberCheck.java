public class NumberCheck {

    public static boolean check(int n) {
        int sum = 0;

        // vòng lặp
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        // branching (1 if -> 2 paths)
        if (sum % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(check(3)); // true
        System.out.println(check(2)); // false
    }
}
