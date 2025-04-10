import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            int[][] paper = new int[100][100];
            int cnt = 0;

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                for (int j = y; j < y + 10; j++) {
                    for (int k = x; k < x + 10; k++) {
                        paper[j][k] = 1;
                    }
                }
            }

            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    if (paper[i][j] == 1) {
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}