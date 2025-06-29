import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            List<Integer> divisors = new ArrayList<>();

            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    divisors.add(i);
                    if (i != n / i) {
                        divisors.add(n / i);
                    }
                }
            }

            divisors.sort(Integer::compareTo);

            if (k > divisors.size()) {
                System.out.println("0");
            } else {
                System.out.println(divisors.get(k - 1));
            }

        }
    }
}