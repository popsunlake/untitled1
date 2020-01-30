import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();
        System.out.println(map.put("2", 3));
        System.out.println(map.put(null, 4));
        System.out.println(map.put("1", null));//键值都可以为null
        System.out.println(map.put(null, 6));
        System.out.println(map.put("hh", 6));//put返回的是上一个值。
        System.out.println(map);
        Integer a = map.put("hello", 7);
        System.out.println(a);
        System.out.println(map.get(null));
    }
}
