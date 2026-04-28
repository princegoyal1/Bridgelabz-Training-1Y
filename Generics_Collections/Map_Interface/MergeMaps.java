import java.util.*;

class MergeMaps {
    public static Map<String, Integer> merge(Map<String, Integer> m1,
                                             Map<String, Integer> m2) {
        Map<String, Integer> result = new HashMap<>(m1);

        for (Map.Entry<String, Integer> entry : m2.entrySet()) {
            result.put(entry.getKey(),
                result.getOrDefault(entry.getKey(), 0) + entry.getValue());
        }

        return result;
    }

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        System.out.println(merge(map1, map2));
    }
}