import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 28; i++) {
            list.add(Integer.valueOf(br.readLine()));
        }

        List<Integer> num = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            if (!list.contains(i)) {
                num.add(i);
            }
        }
        Collections.sort(num);
        for (int result : num) {
            System.out.println(result);
        }

    }
}