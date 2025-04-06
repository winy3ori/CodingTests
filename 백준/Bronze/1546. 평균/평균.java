import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<Double> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(Double.valueOf(st.nextToken()));
            }
            Double max = Collections.max(list);
            for (int i = 0; i < n; i++) {
                list.set(i, (list.get(i)/max) * 100);
            }
            double sum = 0;
            for (double num : list) {
                sum += num;
            }
            System.out.println(sum/n);
        }
    }
}