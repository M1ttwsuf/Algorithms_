import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorEx {
    public static void main(String[] args) {
    /*
        TreeSet<Fruit> treeSet = new TreeSet<Fruit>();
        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 10000));
        treeSet.add(new Fruit("딸기", 6000));
    */
        TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());
        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 10000));
        treeSet.add(new Fruit("딸기", 600000));

        Iterator<Fruit> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            Fruit fruit = iterator.next();
            System.out.println(fruit.name + ":" + fruit.price);
        }
    }
}
