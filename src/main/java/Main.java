public class Main {
    public static void main(String[] args) {

        PhoneBook book = new PhoneBook();

        book.add("Вася", "123-45-67");
        book.add("Петя", "222-22-22");
        book.add("Гриша", "333-33-33");
        book.add("Костя", "444-44-44");

        book.printAllNames();
    }

}
