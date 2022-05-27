import java.util.*;

public class HashMapEx2 {
    public static void main(String[] args){
        Map<Student, Integer> map = new HashMap<Student, Integer>();

        map.put(new Student(1,"홍길동"),95);
        map.put(new Student(1,"홍길동"),95);

        System.out.println("총 Entry 수 : " + map.size());



    }
}
