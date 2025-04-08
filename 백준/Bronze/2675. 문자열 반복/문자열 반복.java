import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int r = Integer.parseInt(br.readLine());
            for (int i = 0; i < r; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int n = Integer.parseInt(st.nextToken());
                String str = st.nextToken();
                for (int j = 0; j < str.length(); j++) {
                    for (int k = 0; k < n; k++) {
                        System.out.print(str.charAt(j));
                    }
                }
                if (i != r - 1) {
                    System.out.println();
                }
            }
        }
    }
}