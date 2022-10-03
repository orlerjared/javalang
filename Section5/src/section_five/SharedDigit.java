package section_five;

public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b) {
        if (a < 10 || a > 99 || b < 10 || b > 99) {
            return false;
        }
        return a / 10 == b / 10 || a / 10 == b % 10 || b / 10 == a % 10 || a % 10 == b % 10;
    }
}




