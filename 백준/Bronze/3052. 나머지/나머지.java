import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> uniqueMods = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            uniqueMods.add(Integer.parseInt(br.readLine()) % 42);
        }

        System.out.println(uniqueMods.size());
    }
}