public class App {
    public static void main(String[] args) {
        Author tolkien = new Author("John", "Tolkien");
        Author king = new Author("Stephen", "King");
        Book theHobbit = new Book("The Hobbit", tolkien, 1918);
        Book underTheDome = new Book("Under the Dome", king, 2009);
        theHobbit.setYearOfPublishing(1937);

        System.out.println(theHobbit);
        // Оставлено сугубо для проверки. Прошу не обращать внимания.
    }
}