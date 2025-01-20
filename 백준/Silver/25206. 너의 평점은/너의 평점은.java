import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str[] = new String[20];
        String gradeList[] = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
        double gradeScore[] = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};

        double totalSum = 0;
        double scoreSum = 0;

        for (int i = 0; i < 20; i++) {
            str[i] = br.readLine(); // 한 줄 입력 받고
            StringTokenizer st = new StringTokenizer(str[i], " ");  // 공백을 기준으로 구분
            String subject = st.nextToken(); // 과목명
            double score = Double.parseDouble(st.nextToken()); // 학점
            String grade = st.nextToken(); // 점수

            for (int j = 0; j < 10; j++) {
                if (grade.equals(gradeList[j])) {
                    totalSum += score * gradeScore[j]; // 학점 * 점수
                    if (j != 9) {   // Pass 과목 총 학점에서 제외
                        scoreSum += score;  // 학점 누적 저장
                    }
                }
            }
        }

        double average = totalSum/scoreSum;
        System.out.printf("%.6f\n", average);
        br.close();

    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
