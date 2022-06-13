

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.stream.Collectors;

/*필터링해서 새로운 컬렉션 생성*/
public class ToListEx {
    public static void main(String[] args){
        List<Studeent> totalList = Arrays.asList(
          new Studeent ("홍길동",10,Studeent.Sex.MALE),
                new Studeent ("김수애",6,Studeent.Sex.FEMALE),
                new Studeent ("신용권",10,Studeent.Sex.MALE),
                new Studeent ("박수미",6,Studeent.Sex.FEMALE)
        );

        //남학생들만 묶어 List 생성
        List<Studeent> maleList = totalList.stream()
                .filter(s-> s.getSex() == Studeent.Sex.MALE)
                .collect(Collectors.toList());
maleList.stream()
                .forEach(s-> System.out.println(s.getName()));
        System.out.println();

        //여학생들만 묶어 HashSet 생성
        Set<Studeent> femaleSet = totalList.stream()
                .filter(s-> s.getSex() == Studeent.Sex.FEMALE)
                .collect(Collectors.toCollection(HashSet:: new));

        femaleSet.stream()
                .forEach(s-> System.out.println(s.getName()));
    }
}
