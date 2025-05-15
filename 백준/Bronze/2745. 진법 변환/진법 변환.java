import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String n = st.nextToken();
            int b = Integer.parseInt(st.nextToken());
            System.out.println(Integer.parseInt(n, b));
        }
    }
}