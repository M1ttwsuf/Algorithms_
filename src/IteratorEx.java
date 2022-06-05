import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorEx {
    public static  void main(String[] args){
        List<String> list = Arrays.asList("홍길동","신용권","김자바");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }
        System.out.println();
       /*stream 으로 변경 /Iterator 사용보다 더 단순해진 코드*/
      // List<String> lists = Arrays.asList("홍길동","신용권","김자바");
       Stream<String> stream = list.stream();
       stream.forEach(name -> System.out.println(name)); //forEach 메소드 사용
    }
}
/*stream 특징 ? 람다식으로 요소 처리 코드 제공*/