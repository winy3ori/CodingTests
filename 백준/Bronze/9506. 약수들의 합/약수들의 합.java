import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                int n = Integer.parseInt(br.readLine());
                if (n == -1) break;

                List<Integer> list = new ArrayList<>();
                int sum = 0;

                for (int i = 1; i <= n / 2; i++) {
                    if (n % i == 0) {
                        list.add(i);
                        sum += i;
                    }
                }

                StringBuilder sb = new StringBuilder();
                sb.append(n);
                if (n == sum) {
                    sb.append(" = ");
                    for (int i = 0; i < list.size(); i++) {
                        sb.append(list.get(i));
                        if (i < list.size() - 1) {
                            sb.append(" + ");
                        }
                    }
                } else {
                    sb.append(" is NOT perfect.");
                }

                System.out.println(sb.toString());
              }
           }
        }
}