import java.util.HashMap;
import java.util.Map;

public class Demomap {
    public static void main(String[] args) {
        
        Map <String,Integer> add = new HashMap<>();

        add.put("Rajesh", 65);
        add.put("Navin", 85);
        add.put("Suesh", 70);
        add.put("Lokesh", 82);
        add.put("Kayalan", 78);
        add.put("Navin", 73);
        add.remove("Navin");
        
       
        System.out.println(add);
        
    }
}