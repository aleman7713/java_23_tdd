import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private Map<String, String> book = new HashMap<>();

    public int add(String name, String number) {

        book.put(name, number);

        return  book.size();
    }

    public String findByNumber(String number) {
        return null;
    }
}
