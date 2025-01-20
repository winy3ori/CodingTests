import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    private static final int SUBJECT_COUNT = 20;

    public static void solution() throws IOException {
        Map<String, Double> gradeMap = new HashMap<>();
        gradeMap.put("A+", 4.5);
        gradeMap.put("A0", 4.0);
        gradeMap.put("B+", 3.5);
        gradeMap.put("B0", 3.0);
        gradeMap.put("C+", 2.5);
        gradeMap.put("C0", 2.0);
        gradeMap.put("D+", 1.5);
        gradeMap.put("D0", 1.0);
        gradeMap.put("F", 0.0);
        gradeMap.put("P", 0.0);

        double totalSum = 0.0; // 총 점수 (학점 * 성적)
        double scoreSum = 0.0; // Pass 과목을 제외한 총 학점 합계

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 0; i < SUBJECT_COUNT; i++) {
                String line = br.readLine();
                StringTokenizer st = new StringTokenizer(line, " ");

                String subject = st.nextToken(); // 과목명
                double score = Double.parseDouble(st.nextToken()); // 학점
                String grade = st.nextToken(); // 성적

                double gradeValue = gradeMap.get(grade);
                totalSum += score * gradeValue;

                if (!grade.equals("P")) {
                    scoreSum += score; // 학점 누적
                }
            }
        }

        double average = totalSum / scoreSum;
        System.out.printf("%.6f\n", average);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}