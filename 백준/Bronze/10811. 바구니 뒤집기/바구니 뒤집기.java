import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(i + 1);
            }

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int j = Integer.parseInt(st.nextToken());
                int k = Integer.parseInt(st.nextToken());
                Collections.reverse(list.subList(j-1, k));
            }
            for (int num : list) {
                System.out.print(num + " ");
            }

        }
    }
}