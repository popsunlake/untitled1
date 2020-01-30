import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestLinkedHashMap {
    public static void main(String[] args){
        //默认false为插入顺序，true为访问顺序
        Map<String, Integer> map = new LinkedHashMap<>(10, 0.75f, true);
        System.out.println(map.put("2", 3));
        System.out.println(map.put(null, 4));
        System.out.println(map.put("1", null));//键值都s可以为null
        System.out.println(map.put(null, 6));
        System.out.println(map.put("hh", 6));//put返回的是上一个值。
        System.out.println(map);
    }
}
