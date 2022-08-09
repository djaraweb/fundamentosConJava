package com.udemy.fundamentos.usodepalabrafinal;

// Si la clase se declara como final no se podra heredar por ninguna clase.
// Cannot inherit from final   public final class Persona
public class Persona {
    // Para declarar constantes se debe usar (final static) y el nombre de la variable en mayuscula
    public final static int MI_CONSTANTE = 10;

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Si un metodo se declara como final no se puede modificar ni sobreescribir usando @Override
    public final void imprimir(){
        System.out.println("Mostrar mensaje - metodo imprimir en la clase persona.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
