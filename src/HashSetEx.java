import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args){
        Set<String> set = new HashSet<String>();

        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("JAVA");
        set.add("iBatis");

        int size = set.size();
        System.out.println("총 객체수: " + size);
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println("\t"+element);
        }
        set.remove("JDBC");
        set.remove("ibatis");

        System.out.println("총 객체수: "+ set.size());

        iterator = set.iterator();
        while(iterator.hasNext()){
            String elemnet = iterator.next();
            System.out.println("\t" + elemnet);
        }
                set.clear();
            if(set.isEmpty())
                System.out.println("비어 있음");


    }
}
