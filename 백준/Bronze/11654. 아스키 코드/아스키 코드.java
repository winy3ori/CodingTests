import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            char alp = br.readLine().charAt(0);
            int ascii = (int) alp;
            System.out.println(ascii);
        }
    }
}