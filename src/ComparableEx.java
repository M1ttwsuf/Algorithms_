import java.util.Iterator;
import java.util.TreeSet;

public class ComparableEx {
    public static void main(String[] args){
        TreeSet<Person> treeSet = new TreeSet<Person>();

        treeSet.add(new Person("김자바", 45)); //저장은 나이순으로 정렬된다
        treeSet.add(new Person("홍길동", 25));
        treeSet.add(new Person("신박원", 31));

        Iterator<Person> iterator = treeSet.iterator(); // 왼쪽 마지막 노드에서 오른쪽 마지막 노드 가져오기
        while(iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person.name + ":" + person.age);
        }
    }
}
