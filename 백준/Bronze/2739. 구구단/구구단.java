//todo BufferReader, BufferedWriter, StringTokenizer

import java.io.*;

public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d%n", n, i, n * i);
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
