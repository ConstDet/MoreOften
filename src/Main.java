import java.util.Set;

public class Main {
    private static String textField = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do " +
            "eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis " +
            "nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute " +
            "irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
            "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit " +
            "anim id est laborum.";
    public static void main(String[] args) {
        CharCounter chrC = new CharCounter(textField);
        Set<Character> set = chrC.maxMinCountChar().keySet();
        for (char chr : set) {
            int value = chrC.maxMinCountChar().get(chr);
            System.out.println(chr + " встречается " + value + " раз");
        }
    }
}