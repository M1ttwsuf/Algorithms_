import java.util.Collection;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByEx {
    public static void main(String[] args){
        List<Studeent> totalList = Arrays.asList(
               new Studeent("홍길동",10,Studeent.Sex.MALE,Studeent.City.Seoul),
                new Studeent("김수애",6,Studeent.Sex.FEMALE,Studeent.City.Pusan),
                new Studeent("신용권",10,Studeent.Sex.MALE,Studeent.City.Seoul),
                new Studeent("박수미",6,Studeent.Sex.FEMALE,Studeent.City.Pusan)
        );

        Map<Studeent.Sex,List<Studeent>> mapBySex = totalList.stream()
                .collect(Collectors.groupingBy(Studeent :: getSex));

        System.out.print("[남학생]");
        mapBySex.get(Studeent.Sex.MALE).stream()
                .forEach(s-> System.out.print(s.getName()+" "));

        System.out.print("\n[여학생]");
        mapBySex.get(Studeent.Sex.FEMALE).stream()
                .forEach(s-> System.out.print(s.getName()+" "));

        System.out.println();

        Map<Studeent.City, List<String>> mapByCity = totalList.stream()
                .collect(
                  Collectors.groupingBy(
                        Studeent::getCity,
                          Collectors.mapping(Studeent::getName, Collectors.toList())
                          )
                );
        System.out.print("\n[서울]");
        mapByCity.get(Studeent.City.Seoul).stream().forEach(s->System.out.print(s+" "));

        System.out.print("\n[부산]");
        mapByCity.get(Studeent.City.Pusan).stream().forEach(s->System.out.print(s+" "));
    }
}
