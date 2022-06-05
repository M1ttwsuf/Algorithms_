import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionsEx {
    public static void main(String[] args){
        List<Students> list = Arrays.asList(
                new Students("홍길동",90),
                new Students("신용권",92)
        );

        Stream<Students> stream = list.stream();
        stream.forEach( s->{
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + "-" + score);
        });
    }
}
