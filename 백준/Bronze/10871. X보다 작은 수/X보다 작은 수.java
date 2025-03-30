import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            StringTokenizer nums = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int j = Integer.parseInt(nums.nextToken());
                if (j < x) {
                    System.out.print(j + " ");
                }
            }

        }
    }
}