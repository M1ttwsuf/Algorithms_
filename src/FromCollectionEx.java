import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionEx {
    public static void main(String[] args){
        List<Studentt> studentList = Arrays.asList(
                new Studentt("홍길동",10),
                new Studentt("신용권",20),
                new Studentt("유미선",30)
        );
        Stream<Studentt> stream = studentList.stream();
        stream.forEach(s-> System.out.println(s.getName()));
    }
}
