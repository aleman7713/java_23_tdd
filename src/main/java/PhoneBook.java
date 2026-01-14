import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {

    private Map<String, String> books = new HashMap<>();
    private Map<String, String> numbers = new HashMap<>();

    public int add(String name, String number) {

        books.put(name, number);
        numbers.put(number, name);

        return  books.size();
    }

    public String findByNumber(String number) {
        return numbers.get(number);
    }

    public String findByName(String name) {
        return books.get(name);
    }

    public void printAllNames() {
        TreeMap<String, String> sorted = new TreeMap<>(books);

        for (Map.Entry<String,String> entry : sorted.entrySet()) {
            String key = entry.getKey();
            // String value = entry.getValue();

            System.out.println(key);
        }
    }
}
