import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void solution() throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String word = br.readLine().toUpperCase();
            Map<Character, Integer> count = new HashMap<>();

            for (char c : word.toCharArray()) {
                count.put(c, count.getOrDefault(c, 0) + 1);
            }

            int maxCount = 0;
            char res = '?';

            for (Map.Entry<Character, Integer> entry : count.entrySet()) {
                if (entry.getValue() > maxCount) {
                    res = entry.getKey();
                    maxCount = entry.getValue();
                } else if (entry.getValue() == maxCount) {
                    res = '?';

                }
            }

            System.out.println(res);

        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}