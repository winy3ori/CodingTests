import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int t = Integer.parseInt(br.readLine());

            for (int i = 0; i < t; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                bw.write(a + b + "\n");
            }
            bw.flush();
            bw.close();

            }

    }
}