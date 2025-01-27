import java.io.*;

public class Main {

    public static void solution() throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String word = br.readLine();
            String reverseWord = new StringBuilder(word).reverse().toString();
            System.out.println(word.equals(reverseWord) ? 1 : 0);
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}