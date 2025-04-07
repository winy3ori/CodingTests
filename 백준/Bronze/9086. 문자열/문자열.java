import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int t = Integer.parseInt(br.readLine());
            for (int i = 0; i < t; i++) {
                String word = br.readLine();
                char first = word.charAt(0);
                char last = word.charAt(word.length() -1);
                System.out.println(first + "" + last);

            }
        }
    }
}