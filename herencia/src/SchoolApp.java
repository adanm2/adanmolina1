public class SchoolApp {
    public static void main(String[] args) {
        Student student1 = new Student ("Juan", "Perez", "Juanpi@gmail.com", "Conocido en Iguala Gro");
        Teacher teacher1 = new Teacher ("Maria", "Morales", "mariaqgmail.com");

        System.out.println(" El nombre del student1 = "+ student1.getName()+ "" + student1.getName());
        System.out.println(" El nombre del teacher1= " + teacher1.getName()+ "" + teacher1.getName());
        student1.setControlNumber(123456);

        // Probando la sobrecarga de metodos
        System.out.println("Metodo toString() de student" + student1.toString());
        System.out.println("metodo toString() de teacher" + teacher1.toString());
        System .out.println("El student es " + student1.soy());
        System .out.println("El teacher es " + teacher1.soy());
    }

}
