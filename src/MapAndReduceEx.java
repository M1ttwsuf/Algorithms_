import java.util.Arrays;
import java.util.List;

public class MapAndReduceEx {
    public static void main(String[] args) {
        List<Students> studentList = Arrays.asList(
                new Students("홍길동", 10),
                new Students("신용권", 20),
                new Students("유미선", 30)
        );
        double avg = studentList.stream()
                .mapToInt(Students :: getScore)
                .average()
                .getAsDouble();
            System.out.println("평균 점수:" + avg);
    }
}
