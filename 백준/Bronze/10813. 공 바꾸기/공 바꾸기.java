import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) arr[i] = i;

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
        }

        int[] result = Arrays.copyOfRange(arr, 1, n + 1);
        String output = Arrays.toString(result).replaceAll("[\\[\\],]", "");
        System.out.println(output);
    }
}