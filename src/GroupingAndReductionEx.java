import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndReductionEx {
    public static void main(String[] args) {
        List<Studeent> totalList = Arrays.asList(
                new Studeent("홍길동", 10, Studeent.Sex.MALE),
                new Studeent("김수애", 12, Studeent.Sex.FEMALE),
                new Studeent("신용권", 10, Studeent.Sex.MALE),
                new Studeent("박수미", 12, Studeent.Sex.FEMALE)
        );

        Map<Studeent.Sex, Double> mapBySex = totalList.stream()
                .collect(
                        Collectors.groupingBy(
                                        Studeent:: getSex,
                                Collectors.averagingDouble(Studeent::getScore)
                        )
                );
        System.out.println("남학생 평균 점수: " + mapBySex.get(Studeent.Sex.MALE));
        System.out.println("여학생 평균 점수: " + mapBySex.get(Studeent.Sex.FEMALE));

        Map<Studeent.Sex, String> mapByName = totalList.stream()
                .collect(
                        Collectors.groupingBy(
                                Studeent :: getSex,
                                Collectors.mapping(
                                        Studeent :: getName,
                                        Collectors.joining(",")
                                )
                        )
                );
        System.out.println("남학생 전체 이름: " + mapByName.get(Studeent.Sex.MALE));
        System.out.println("여학생 전체 이름: " + mapByName.get(Studeent.Sex.FEMALE));
    }
}
