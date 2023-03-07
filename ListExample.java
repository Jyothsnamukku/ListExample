import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListExample {
    public Map<String,String>getAllListGender() {
        Map<String,String> map = new HashMap();
        map.put("Jyo","female");
        map.put("dev","male");
        map.put("mouni","female");
        return map;
    }

    public static void main(String[] args) {
        ListExample listExample=new ListExample();
        Map<String,String> map = listExample.getAllListGender();
        System.out.println(map);
    }
}
