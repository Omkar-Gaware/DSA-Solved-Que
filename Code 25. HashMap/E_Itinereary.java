import java.util.HashMap;

public class E_Itinereary {
    public static String getStart(HashMap<String, String> map) {
        // find reverse map
        HashMap<String, String> revmap = new HashMap<>();

        for (String key : map.keySet()) {
            revmap.put(map.get(key), key);
        }

        for (String key : map.keySet()) {
            if (!revmap.containsKey(key)) {
                return key;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Chennai", "Bangaluru");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");

        String Start = getStart(map);
        System.out.print(Start);

        for (String key : map.keySet()) {
            System.out.print("->" + map.get(Start));
            Start = map.get(Start);
        }
    }
}