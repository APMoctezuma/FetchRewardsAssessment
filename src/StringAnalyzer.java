package src;

import java.util.*;

public class StringAnalyzer {
    private String inputString;
    private Map<Character, Integer> counts;

    public StringAnalyzer(String inputString) {
        this.inputString = inputString.toLowerCase().trim();
        this.counts = new TreeMap<>();
        fillMap();
    }

    public Response isPyramid() {
        if(inputString == null || inputString.length() < 2) {
            return new Response(false, "invalid String");
        }
        Map<Character, Integer> sortedByValuesMap = sortbyValues();
        Object[] values = sortedByValuesMap.values().toArray();
        for(int i = 0, j = i+1; i < values.length && j < values.length - 1; ++i,++j) {
            Integer a = (Integer)values[i];
            Integer b = (Integer)values[j];
            if(a != b - 1) {
                return new Response(false, "valid word but not a pyramid word");
            }
        }
        return new Response(true);
    }

    private void fillMap() {
        for(int i = 0; i < inputString.length(); ++i) {
            Character currentChar = inputString.charAt(i);
            if(counts.containsKey(currentChar)) {
                counts.put(currentChar, counts.get(currentChar)+1);
            } else {
                counts.put(currentChar, 1);
            }
        }
    }

    private Map<Character, Integer> sortbyValues() {
        List<Map.Entry<Character,Integer>> entryList = new ArrayList<>(counts.entrySet());
        entryList.sort(Map.Entry.comparingByValue());
        Map<Character, Integer> newMap = new LinkedHashMap<>();
        for(Map.Entry<Character, Integer> entry : entryList) {
            newMap.put(entry.getKey(), entry.getValue());
        }
        return newMap;
    }
}
