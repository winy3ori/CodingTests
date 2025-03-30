import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int t = Integer.parseInt(br.readLine());

            for (int i = 0; i < t; i++) {
                for (int j = 0; j < i+1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}