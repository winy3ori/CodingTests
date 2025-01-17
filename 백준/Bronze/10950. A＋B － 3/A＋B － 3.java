//todo BufferReader, BufferedWriter, StringTokenizer

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine(), " ");   // 각 줄을 공백으로 분리
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a + b).append("\n");
        }

        br.close();
        System.out.println(sb);

    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
