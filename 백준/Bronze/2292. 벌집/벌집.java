import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n =  Integer.parseInt(br.readLine());

            int level = 1;
            int maxNum = 1;

            while (n > maxNum ) {
                maxNum += 6 * level;
                level++;
            }
            System.out.println(level);
        }
    }
}