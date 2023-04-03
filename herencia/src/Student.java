public class Student extends Person{
    private int controlNumber;
    private String career;
    private double generalAverage;
    private byte general;

    public Student() {
    }

    public Student(String name, String lastName, String email, String career) {
        super(name, lastName, email);
        this.career = career;
        this.generalAverage = generalAverage;
    }

    public Student(String address) {
        super(address);
    }

    public int getControlNumber() {
        return controlNumber;
    }

    public void setControlNumber(int controlNumber) {
        this.controlNumber = controlNumber;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public double getGeneral() {
        return general;
    }

    public Student(String name, String lastName, String email) {
        super(name, lastName, email);

    }
    // Es una sobrecarga en el toString
    public String toString(){
        return "En el toString de Student";
        }

    public String soy(){
        return "Soy una persona y estudiante";
    }

}
