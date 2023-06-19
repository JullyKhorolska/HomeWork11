package unique;

import java.util.*;

public class Unique {
    String str;

    public Unique(String str) {
        this.str = str;
    }

    public void hashSet() {
        String[] words = str.trim().split("[;,.\s]");
        Set<String> uniqueStr = new HashSet<>(Arrays.asList(words));
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].compareToIgnoreCase(words[j]) == 0) {
                    if (uniqueStr.contains(words[i])) {
                        uniqueStr.remove(words[j]);
                    }
                }
            }
        }
        System.out.println("Method HashSet");
        System.out.println("Unique HashSet: " + uniqueStr);
        System.out.println("Without duplicates: " + String.join(" ", uniqueStr) + "\n");
    }

    public void hashMap() {
        String[] words = str.trim().split("[;,.\s]");
        Map<String, Integer> counterStr = new HashMap<>();
        for (String word : words) {
            int newValue = counterStr.getOrDefault(word, 0) + 1;
            counterStr.put(word, newValue);

        }
        System.out.println("------HashMap-------");
        System.out.println("String: " + str);
        System.out.println("HashMap: " + counterStr);
    }
}