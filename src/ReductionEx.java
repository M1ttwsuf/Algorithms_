import java.util.Arrays;
import java.util.List;

public class ReductionEx {
    public static void main(String[] args){
        List<Students> studentList = Arrays.asList(
          new Students("홍길동", 92),
          new Students("신용권",95),
          new Students("김자바",88)
        );

        int sum1 = studentList.stream() //스트림식 형식
                .mapToInt(Students :: getScore)
                .sum();
        int sum2 = studentList.stream()
                .map(Students :: getScore)
                .reduce((a,b) -> a+b)
                .get();

        int sum3 = studentList.stream()
                .map(Students :: getScore)
                .reduce(0,(a,b)-> a+b);

        System.out.println("sum1: "+ sum1);
        System.out.println("sum2: "+ sum2);
        System.out.println("sum3: "+ sum3);
    }
}
/*화살표는 람다식*/