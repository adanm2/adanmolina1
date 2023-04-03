public class Teacher extends Person{
    public Teacher() {
    }

    public Teacher(String address) {
        super(address);
    }

    public Teacher(String name, String lastName, String email) {
        super(name, lastName, email);
        }

    public String toString() {
        return "En el toString() de teacher";
    }
}

