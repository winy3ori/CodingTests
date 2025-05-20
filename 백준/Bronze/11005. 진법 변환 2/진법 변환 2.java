import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());  // 10진법 수
            int b = Integer.parseInt(st.nextToken());   // 진법
            System.out.println((Integer.toString(n, b)).toUpperCase());
        }
    }
}