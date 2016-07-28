import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map map = new LinkedHashMap(16, 0.75f, true);
        map.put("123", "John Smith");
        map.put("111", "George Smith");
        map.put("124", "Steve Yao");
        System.out.println(map.get("123"));
        System.out.println("(2) " + map);
        System.out.println("(1) " + new TreeMap(map));
        
    }
}