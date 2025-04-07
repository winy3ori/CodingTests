import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            String m = br.readLine();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += Integer.parseInt(String.valueOf(m.charAt(i)));
            }
            System.out.println(sum);
        }
    }
}