import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine().trim();

            if (str.isEmpty()) {
                System.out.println(0);
            } else {
                String[] words = str.split(" ");
                System.out.println(words.length);
            }
        }
    }
}