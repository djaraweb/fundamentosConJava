package pe.edu.cibertec.capitulo5;

public class Persona {
    int codigo;
    String nombre;
    int edad;

    public Persona(){}
    public Persona(int codigo, String nombre, int edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
    }

    void comer() {
        System.out.println(nombre + " esta comiendo desde los " + +edad + " años");
    }

    void beber() {
    }
}
