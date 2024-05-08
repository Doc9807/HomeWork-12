import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int yearOfPublishing;

    public Book(String title, Author author, int yearOfPublishing) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public String toString() {
        return "Book «" + title + ", " + author +
                ", " + yearOfPublishing + '»';
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearOfPublishing);
    }
    // Прошу простить за вопрос в неуместном месте, но подскажите пожалуйста, если вам не трудно, а как вот этот
    // получившийся Хэш Код передать в App для распечатывания? Я понимаю, что это вообще не нужно, просто стало
    // очень интересно, а я не понимаю, как реализовать... Прошу прощения, если это элементарно и было в теме урока,
    // но я что-то последние темы не очень хорошо местами понял. И как назло в интернете не нашёл ответа.


    @Override
    public boolean equals(Object v) {
        if (this == v) {
            return true;
        }
        if (v == null || getClass() != v.getClass()) {
            return false;
        }
        Book book = (Book) v;
        return yearOfPublishing == book.yearOfPublishing && Objects.equals(title, book.title)
                && Objects.equals(author, book.author);
    }
}
