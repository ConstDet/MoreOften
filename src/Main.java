import java.util.HashMap;
import java.util.Map;

public class Main {
    private static String textField = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do " +
            "eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis " +
            "nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute " +
            "irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
            "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit " +
            "anim id est laborum.";
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < textField.length(); i++) {
            if (!map.containsKey(textField.charAt(i))) {
                map.put(textField.charAt(i), 1);//нет такой мапы, запишем ее со значением 1
            } else {
                int value = map.get(textField.charAt(i)) + 1;//уже есть такая мапа
                map.put(textField.charAt(i), value);//добавим к ней 1
            }
        }
        System.out.println("Hello world!");
    }
}