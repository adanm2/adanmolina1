public class Person {
    private String name;
    private String lastName;
    private String email;
    private String address;
// terminan los contructores
    public Person() {
    }

    public Person(String address) {
        this.address = address;
    }

    public Person(String name, String lastName, String email) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;

    }
// empiezan getter y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    // terminan getters y setters

    //Metodo soy
    public String soy(){
        return "Soy una persona";
    }
}
