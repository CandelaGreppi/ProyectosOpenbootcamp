public class proyecto8 {
    public static void main(String[] args) {

        Personas persona = new Personas();
        persona.setNombre("candela");


        Personas edad = new Personas();
        edad.setNombre("edad");
        edad.setEdad(22);

        Personas numero = new Personas();
        numero.setNombre("numero");
        numero.setTelefono(541198019);

        System.out.println(persona.getNombre());
        System.out.println(edad.getEdad());
        System.out.println(numero.getTelefono());

    }
}


class Personas {

    private String nombre = "candela";
    private int edad = 22;
    private int telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getTelefono(){
        return this.telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

}


