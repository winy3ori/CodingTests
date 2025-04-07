import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String s = br.readLine().toUpperCase();
            for (char c = 'A'; c <= 'Z'; c++) {
                System.out.print(s.indexOf(c) + " ");
            }
        }
    }
}