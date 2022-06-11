import java.util.Arrays;
/*matching (allMatch(), anyMatch(), noneMatch())
* 스트림은 최종 처리 단계에서 특정 조건 만족하는지에 대한 3가지 matching 메소드 제공
*
* */
public class MatchEx {
    public static void main(String[] args){
        int[] intArr = {2,4,6};

        boolean res = Arrays.stream(intArr)
                .allMatch(a -> a%2 == 0);
        System.out.println("모두 2의 배수인가?" + res);

        res = Arrays.stream(intArr)
                .anyMatch(a-> a%3 ==0);
        System.out.println("하나라도 3의 배수가 있는가?" + res);

        res = Arrays.stream(intArr)
        .noneMatch(a-> a%3 == 0);
        System.out.println("3의 배수가 없는가? " + res);

    }
}
