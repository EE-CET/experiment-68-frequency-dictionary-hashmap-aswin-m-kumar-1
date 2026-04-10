import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] words = line.split("\\s+");
            HashMap<String, Integer> map = new HashMap<>();
            
            for (String word : words) {
                if (!word.isEmpty()) {
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
            }
            
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
        scanner.close();
    }
}
