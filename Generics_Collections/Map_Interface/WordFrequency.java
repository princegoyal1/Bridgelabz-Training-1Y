import java.io.*;
import java.util.*;

class WordFrequency {
    public static void main(String[] args) throws Exception {
        File file = new File("input.txt"); // your file

        Map<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            String line = sc.nextLine().toLowerCase();

            line = line.replaceAll("[^a-zA-Z0-9 ]", "");

            String[] words = line.split("\\s+");

            for (String word : words) {
                if (!word.isEmpty()) {
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
            }
        }

        sc.close();
        System.out.println(map);
    }
}