import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dial = {
                3, 3, 3,
                4, 4, 4,
                5, 5, 5,
                6, 6, 6,
                7, 7, 7,
                8, 8, 8, 8,
                9, 9, 9,
                10,10,10,10
        };
        String str = br.readLine();
        int sum = 0;
        for (char c : str.toCharArray()) {
            sum += dial[c - 'A'];
        }
        System.out.println(sum);
    }
}