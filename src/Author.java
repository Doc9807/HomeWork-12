import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return  firstName + " " + lastName;
    }

    @Override
    public int hashCode(){
        return Objects.hash(firstName, lastName);
    }

    @Override
    public boolean equals(Object v) {
        if (this == v) {
            return true;
        }
        if (v == null || this.getClass() != v.getClass()) {
            return false;
        }
        Author author = (Author) v;
        return Objects.equals(firstName,author.firstName) && Objects.equals(lastName,author.lastName);
    }
}
