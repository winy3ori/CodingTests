import javax.swing.border.SoftBevelBorder;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[][] str = new String[5][];
            int max = 0;

            for (int i = 0; i < 5; i++) {
                String n = br.readLine();
                str[i] = new String[n.length()];
                if (n.length() > max) max = n.length();
                for (int j = 0; j < n.length(); j++) {
                    str[i][j] = String.valueOf(n.charAt(j));
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < max; i++) {
                for (int j = 0; j < 5; j++) {
                    if (i < str[j].length && str[j][i] != null) {
                        sb.append(str[j][i]);
                    }
                }
            }
            System.out.println(sb);
        }
    }
}