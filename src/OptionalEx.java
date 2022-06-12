/*optional 클래스 (Optional, OptionalInt, OptionalLong)클래스
* 집계값만 저장하는 것은아니고, 집계 값이 존재하지 않을 경우 디폴트 값을 설정하거나
* 집계값을 처리하는 Consumer 등록도 가능
**/

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalEx {
    public static void main(String [] args){
        List<Integer> list = new ArrayList<>();
        /*예외 발생 (java.util.NoSuchElementException)
        * double avg = list.stream()
        * .mapToInt(Integer :: intValue)
        * .average()
        * .getAsDouble();
        * */

        //방법 1
        OptionalDouble optional = list.stream()
                .mapToInt(Integer :: intValue)
                .average();
        if(optional.isPresent()){
            System.out.println("방법1_ 평균: " + optional.getAsDouble());
        }else{
            System.out.println("방법1_평균: 0.0");
       }

        //방법 2
        double avg = list.stream()
                .mapToInt(Integer :: intValue)
                .average()
                .orElse(0.0);
        System.out.println("방법2_평균: "+avg);

        //방법3
        list.stream()
                .mapToInt(Integer :: intValue)
                .average()
                .ifPresent(a-> System.out.println("방법3_평균: "+a));
    }
}
