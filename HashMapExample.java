/* HashMap store items in key/value pairs */
import java.util.HashMap;

class HashMapExample {

    public static void main(String... arguments) {

	HashMap<String, String>	capitalCities = new HashMap<String, String>();

	capitalCities.put("England", "London");
	capitalCities.put("Indonesia", "Jakarta");

	System.out.println(capitalCities);

    }

}
