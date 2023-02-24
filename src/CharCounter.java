import java.util.HashMap;
import java.util.Map;

public class CharCounter {
    private String textField;
    private Map<Character, Integer> map;

    public CharCounter(String textField) {
        this.textField = textField;
        map = new HashMap<>();
        charCount();
    }

    private void charCount() {
        for (int i = 0; i < textField.length(); i++) {
            if (!map.containsKey(textField.charAt(i))) {
                map.put(textField.charAt(i), 1);//нет такой мапы, запишем ее со значением 1
            } else {
                int value = map.get(textField.charAt(i)) + 1;//уже есть такая мапа
                map.put(textField.charAt(i), value);//добавим к ней 1
            }
        }
    }

    public Map<Character, Integer> maxMinChar() {
        int maxCount = -1, minCount = Integer.MAX_VALUE;
        char keyChar = 0;
        Map<Character, Integer> resMap = new HashMap<>();
        for (char mChar : map.keySet()) {
            if (map.get(mChar) > maxCount && Character.isLetter(mChar)) {
                maxCount = map.get(mChar);
            }
        }
        for (char mChar : map.keySet()) {
            if (map.get(mChar) < minCount && Character.isLetter(mChar)) {
                minCount = map.get(mChar);
            }
        }
        for (char mChar : map.keySet()) {
            if (map.get(mChar) == maxCount || map.get(mChar) == minCount && Character.isLetter(mChar)) {
                resMap.put(mChar, map.get(mChar));
            }
        }
        return resMap;
    }
}
