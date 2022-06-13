import java.util.ArrayList;
import java.util.List;
/*남학생이 저장되는 컨테이너*/
public class MaleStudent {
    private List<Studeent> list;

    public MaleStudent(){
        list = new ArrayList<Studeent>();
        System.out.println("["+ Thread.currentThread().getName()+"]+ MaleStudent()");
    }
    public void  accumulate(Studeent student){
        list.add(student);
        System.out.println("[" + Thread.currentThread().getName()+"] accumulate()");

    }
    public  void combine(MaleStudent other){
        list.addAll(other.getList());
        System.out.println("[" + Thread.currentThread().getName()+"] combine()");
    }
    public List<Studeent> getList(){
        return list;
    }
}
