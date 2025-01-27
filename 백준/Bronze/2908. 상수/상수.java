import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void solution() throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String text = br.readLine();
            StringTokenizer st = new StringTokenizer(text, " ");

            int left = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
            int right = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

            System.out.println(Math.max(left, right));

        }

    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}