import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int t = Integer.parseInt(br.readLine());

            for (int i = t; i > 0; i--) {
                System.out.println(" ".repeat(i-1) + "*".repeat(t-i+1));
            }
        }
    }
}