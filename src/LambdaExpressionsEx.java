import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
/*stream 특징*/
/*람다식 사용 // 내부 반복자를 사용한다// 병렬 처리가 쉽다*/
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

/* 
* index -> for
* iterator -> while
* internal iterator // 쉬운 병렬처리
* */