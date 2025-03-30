import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int x = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            int sum = 0;
            for (int i = 0; i < n; i++) {
                String[] input = br.readLine().split(" ");
                sum += Integer.parseInt(input[0]) * Integer.parseInt(input[1]);
            }

            System.out.println(x == sum ? "Yes" : "No");
        }

    }

}