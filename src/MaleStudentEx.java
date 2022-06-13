import java.util.Arrays;
import java.util.List;
/*List, Set, Map이 아닌 사용자 정의 컨테이너 객체에 수집하기 */
public class MaleStudentEx {
    public static void main(String[] args){
        List<Studeent> totalList = Arrays.asList(
          new Studeent("홍길동", 10, Studeent.Sex.MALE),
                new Studeent("김수애", 16, Studeent.Sex.FEMALE),
        new Studeent("신용권", 10, Studeent.Sex.MALE),
                new Studeent("박수미", 6, Studeent.Sex.FEMALE)
        );

        MaleStudent maleStudent = totalList.stream()
                .filter(s-> s.getSex() == Studeent.Sex.MALE)
                .collect(MaleStudent :: new, MaleStudent :: accumulate, MaleStudent :: combine );
    maleStudent.getList().stream()
            .forEach(s-> System.out.println(s.getName()));

    }
}
