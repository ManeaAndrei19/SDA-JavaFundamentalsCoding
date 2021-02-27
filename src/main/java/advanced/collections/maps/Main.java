package advanced.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();
        countries.put("Poland", "Warsaw");
        countries.put("Germany", "Berlin");

        System.out.println(countries);
        countries.put("Germany", "Berlin");

        for (Map.Entry<String, String> dictionary : countries.entrySet()) {
            String country = dictionary.getKey();
            String capital = dictionary.getValue();
            System.out.printf("%s : %s\n", country, capital);
        }

    }
}
