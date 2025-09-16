import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int cnt = 0;
            int sum = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());

            while (cnt < 5){
                int n = Integer.parseInt(st.nextToken());
                sum += n * n;
                cnt ++;
            }
            System.out.println(sum%10);

        }
    }
}