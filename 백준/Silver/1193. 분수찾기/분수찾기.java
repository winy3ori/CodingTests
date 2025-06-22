import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int x =  Integer.parseInt(br.readLine());

            int diagnalOrder = 1;   // 대각선 카운트
            int sum = 1;    // 대각선 마지막 번호

            while (x > sum) {   // 1 3 6 10 15 ...
                diagnalOrder++;
                sum += diagnalOrder;
            }

            int position = x - (sum - diagnalOrder);

            if (diagnalOrder % 2 == 0){ // 짝수 : 분모 감소, 분자 증가
                System.out.printf(position + "/" + (diagnalOrder - position + 1));
            } else {    // 홀수 : 분모 증가, 분자 감소
                System.out.printf((diagnalOrder - position + 1) + "/" + position);
            }
        }
    }
}