
import java.util.HashMap;

public class Mappa {
    
    public static int main() {
        HashMap<String, Integer> mappa = new HashMap<>();

        mappa.put("Mario", 22);
        mappa.put("Genny", 99);

        System.out.println(mappa.get("Mario"));


        return 0;
    }
}
