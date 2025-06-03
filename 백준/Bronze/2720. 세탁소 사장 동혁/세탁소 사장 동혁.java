import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine());   // 테스트 케이스 개수
            List<Double> ex = List.of(0.25, 0.10, 0.05, 0.01);

            while (T-- > 0) {
                List<Integer> result = new ArrayList<>();
                double C = Integer.parseInt(br.readLine()) / 100.0;

                for(double change : ex) {
                    int cnt = (int)(C / change);
                    result.add(cnt);

                    C -= cnt * change;
                    C = Math.round(C * 100.0) / 100.0;
                }
                for (int r : result) {
                    System.out.print(r + " ");
                }
                System.out.println();
            }

        }
    }
}