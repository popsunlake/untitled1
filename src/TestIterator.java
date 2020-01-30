import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestIterator {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("hh");
        list.add("hehe");
        list.add("huhu");
        System.out.println(list);
        ListIterator it = list.listIterator();
        it.add("wuwu");
        it.add("kuku");
        System.out.println("it.next() = " + it.next());
        it.remove();
        System.out.println(list);
    }
}
