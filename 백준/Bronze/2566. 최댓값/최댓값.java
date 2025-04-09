import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[][] s = new int[9][9];
            int max = Integer.MIN_VALUE;
            int[] rowCol = new int[2];
            for (int i = 0; i < 9; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 9; j++) {
                    int n = Integer.parseInt(st.nextToken());
                    s[i][j] = n;
                    if (n > max) {
                        max = n;
                        rowCol[0] = i+1;
                        rowCol[1] = j+1;
                    }
                }
            }
            System.out.println(max);
            System.out.println(rowCol[0] + " " + rowCol[1]);
        }
    }
}