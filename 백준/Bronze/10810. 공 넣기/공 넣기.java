import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[] arr = new int[n];
            for (int x = 0; x < m; x++) {
                StringTokenizer input = new StringTokenizer(br.readLine());
                int i = Integer.parseInt(input.nextToken());
                int j = Integer.parseInt(input.nextToken());
                int k = Integer.parseInt(input.nextToken());

                for (int y = i - 1; y < j; y++) {
                    arr[y] = k;
                }
            }
            for (int x = 0; x < n; x++) {
                System.out.print(arr[x] + " ");
            }
        }
    }
}