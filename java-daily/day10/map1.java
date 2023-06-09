package day10;
import java.util.HashMap;
import java.util.Map;

class map1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("xyz", "va3l");
        map.put("abc", "val1");
        map.put("bce", "val2");
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("xyz", "va3l");
        map2.put("abc", "val1");
        map2.put("bce", "val2");
        System.out.println(map);
        System.out.println(map2);

    }
}