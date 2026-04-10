import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] words = line.split("\\s+");
            TreeMap<String, Integer> map = new TreeMap<>();
            
            for (String word : words) {
                if (!word.isEmpty()) {
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
            }
            
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.print(entry.getKey() + ": " + entry.getValue() + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
