public class Test {
    public static void main(String[] args) {
        boolean b = true;
        System.out.println(boolToWord(b));
    }

    public static String boolToWord(boolean b) {
        return b ? "Yes" : "No";
    }
}
