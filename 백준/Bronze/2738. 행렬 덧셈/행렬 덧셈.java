import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[][] a = new int[n][m];
            int[][] b = new int[n][m];

            for (int i = 0; i < n; i++) {
                StringTokenizer aSt = new StringTokenizer(br.readLine());
                for (int j = 0; j < m; j++) {
                    a[i][j] = Integer.parseInt(aSt.nextToken());
                }
            }
            for (int i = 0; i < n; i++) {
                StringTokenizer bSt = new StringTokenizer(br.readLine());
                for (int j = 0; j < m; j++) {
                    b[i][j] = Integer.parseInt(bSt.nextToken());
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(a[i][j]+b[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}