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
            if (!map.containsKey(textField.charAt(i)) && Character.isLetter(textField.charAt(i))) {
                map.put(textField.charAt(i), 1);//нет такой мапы, запишем ее со значением 1
            } else if (Character.isLetter(textField.charAt(i))) {
                int value = map.get(textField.charAt(i)) + 1;//уже есть такая мапа
                map.put(textField.charAt(i), value);//добавим к ней 1
            }
        }
    }

    public int maxChar() {
        if (map.size() == 0) return -1;
        int maxCount = -1;
        for (char mChar : map.keySet()) {//вычисляем максимальное кол-во символов
            if (map.get(mChar) > maxCount) {
                maxCount = map.get(mChar);
            }
        }
        return maxCount;
    }

    public int minChar() {
        if (map.size() == 0) return -1;
        int minCount = Integer.MAX_VALUE;
        for (char mChar : map.keySet()) {//минимальное
            if (map.get(mChar) < minCount) {
                minCount = map.get(mChar);
            }
        }
        return minCount;
    }

    public Map<Character, Integer> CountChar() {
        int maxCount = maxChar(), minCount = minChar();
        Map<Character, Integer> resMap = new HashMap<>();
        if (map.size() == 0) return null;
        for (char mChar : map.keySet()) {//записываем только мин и макс символы
            if (map.get(mChar) == maxCount || map.get(mChar) == minCount) {
                resMap.put(mChar, map.get(mChar));
            }
        }
        return resMap;
    }
}
