import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    private PhoneBook book;

    @BeforeEach
    public void initTest() {
        book = new PhoneBook();
    }

    @Test
    @DisplayName("Добавление нового абонента")
    public void addTest() {
        int result = book.add("Вася", "123-45-67");
        Assertions.assertEquals(1, result);

        result = book.add("Петя", "222-22-22");
        Assertions.assertEquals(2, result);

        result = book.add("Вася", "123-45-67");
        Assertions.assertEquals(2, result);
    }
}
