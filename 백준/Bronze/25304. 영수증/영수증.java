import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int x = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            StringTokenizer st;

            int sum = 0;
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                sum += a * b;
            }

            if (x == sum) {
                System.out.println("Yes");
            } else System.out.println("No");

        }

    }

}