import java.util.Arrays;
import java.util.List;

public class StreamPipelinesEx {
    public static void main(String[] args){
        List<Members> list = Arrays.asList(
           new Members("홍길동",Members.MALE,30),
                new Members("  김나리",Members.FEMALE,20),
                new Members("신용권",Members.MALE,45),
                new Members("박수미",Members.FEMALE,27)
        );

        double ageAvg = list.stream()
                .filter(m-> m.getSex() == Members.MALE)
        .mapToInt(Members :: getAge)
                .average()
                .getAsDouble();

        System.out.println("남자 평균 나이: " + ageAvg);
    }
}
