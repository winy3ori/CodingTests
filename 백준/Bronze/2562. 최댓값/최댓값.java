import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int cnt = 0;
            int max = 0;

            for (int i = 0; i < 9; i++) {
                int n = Integer.parseInt(br.readLine());
                if (n > max) {
                    max = n;
                    cnt = i + 1;
                }
            }
            System.out.println(max + "\n" + cnt);
        }
    }
}