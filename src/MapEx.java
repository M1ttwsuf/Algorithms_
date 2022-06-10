import java.util.Arrays;
import java.util.List;

public class MapEx {
    public static void main(String[] args) {
        List<Studentsss> studentList = Arrays.asList(
                new Studentsss("홍길동", 10),
                new Studentsss("신용권", 20),
                new Studentsss("유미선", 30)

        );
        studentList.stream()
                .mapToInt(Studentsss :: getScore)
                .forEach(score -> System.out.println(score));
    }
}
