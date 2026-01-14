import java.util.HashMap;
import java.util.Map;

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
}
