package flat.company.project.lessons17;

import java.util.*;

public class task17 {
    public static Map<String, Long> searchWord(Collection<String> strings) {
        Map<String, Long> map = new HashMap<>();
        for (String el : strings) {
            if (map.containsKey(el)) {
                Long newRes = map.get(el);
                newRes++;
                map.put(el, newRes);
            } else {
                map.put(el, 1L);
            }

        }
        return map;
    }

    public static Map<String, Long> searchText(String word, String text) {
        Map<String, Long> map = new HashMap<>();
        String[] words = text.split(" ");
        for (String el : words) {
            if (el.equals(word)) {
                Long newRes = map.get(el);
                newRes++;
                map.put(el, newRes);
            } else {
                map.put(el, 1L);
            }
        }
        return map;
    }

    public static Map<Integer, List<String>> search(String text) {
        Map<Integer, List<String>> map = new HashMap<>();
        String[] words = text.split("\\s+");
        for (String el : words) {
            Integer size = el.length();
            if (map.containsKey(size)) {
                map.get(size).add(el);

            } else {
                List<String> list = new ArrayList<>();
                list.add(el);
                map.put(size, list);
            }
        }
        return map;
    }
    public static void searchWords(String text) {
        int mostFrequentWordsNumber = 10;
        Map<String, Integer> mapOfFrequentWords = new TreeMap<>();
        String[] words = text.split("\\s+");
        for (String word : words) {
            if (!mapOfFrequentWords.containsKey(word)) {
                mapOfFrequentWords.put(word, 1);
            } else {
                mapOfFrequentWords.put(word, mapOfFrequentWords.get(word) + 1);
            }
        }
        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(mapOfFrequentWords.entrySet());
        sortedEntries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        int count = 0;
        for (Map.Entry<String, Integer> entry : sortedEntries) {
            if (count >= 10) {
                break;
            }
            System.out.println(entry.getKey() + ": " + entry.getValue());
            count++;
        }
    }
}