
import java.util.HashMap;

public class Mappa {
    
    public static int main() {
        HashMap<String, Integer> numeriPreferiti = new HashMap<>();

        numeriPreferiti.put("Mario", 22);
        numeriPreferiti.put("Genny", 99);

        System.out.println(numeriPreferiti.get("Mario"));

        return 0;
    }
}
