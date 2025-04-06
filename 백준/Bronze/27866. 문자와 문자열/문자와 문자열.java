import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String s = br.readLine();
            int i = Integer.parseInt(br.readLine());
            char c = 0;
            for (int j = 0; j < i; j++) {
                c = s.charAt(j);
            }
            System.out.println(c);
        }
    }
}