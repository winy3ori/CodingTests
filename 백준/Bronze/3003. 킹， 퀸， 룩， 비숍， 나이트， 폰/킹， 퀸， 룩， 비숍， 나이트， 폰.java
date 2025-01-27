import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void solution() throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            StringBuilder sb = new StringBuilder().append("112228");
            StringBuilder res = new StringBuilder();

            for (int i = 0; i < sb.length(); i++) {
                int diff = Character.getNumericValue(sb.charAt(i)) - Integer.parseInt(st.nextToken());
                res.append(diff).append(" ");
            }
            System.out.println(res);
        }

    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}