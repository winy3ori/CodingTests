import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n / 4; i++) {
                System.out.print("long ");
            }
            System.out.println("int");
        }

    }

}