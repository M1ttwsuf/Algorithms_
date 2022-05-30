import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSerEx2 {
    public static void main(String[] args){
        TreeSet<Integer> scores = new TreeSet<Integer>();
        scores.add(new Integer(87));
        scores.add(new Integer(98));
        scores.add(new Integer(75));
        scores.add(new Integer(95));
        scores.add(new Integer(80));

        NavigableSet<Integer> descendingSet = scores.descendingSet(); // 내림차순으로 정렬된 NavigableSet 반환
        for(Integer score : descendingSet){
            System.out.print(score + " "); // 내림차순 (큰 -> 작)
        }
        System.out.println();

        NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();

        for(Integer score : ascendingSet){
            System.out.print(score + " "); // 오름차순 (작 -> 큰)
        }
    }
}
