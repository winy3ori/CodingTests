import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String s = br.readLine();
            int i = Integer.parseInt(br.readLine());
            System.out.println(s.charAt(i-1));
        }
    }
}