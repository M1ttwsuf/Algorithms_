import java.util.Arrays;
import java.util.List;
/* 중복제거/ 필터링/ 중복 제거 후 필터링*/
public class FilteringEx {
    public static void main(String[] args){
        List<String> names = Arrays.asList("홍길동","신용권","김자바","신용권","신민월");

        names.stream()
                .distinct()
                .forEach(n-> System.out.println(n));
        System.out.println();

        names.stream()
                .filter(n -> n.startsWith("신"))
                .forEach(n -> System.out.println(n));
        System.out.println();

        names.stream()
                .filter(n-> n.startsWith("신"))
                .forEach(n-> System.out.println(n));
    }
}
