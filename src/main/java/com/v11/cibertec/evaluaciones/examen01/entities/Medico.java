package pe.edu.cibertec.evaluaciones.examen01.entities;

public class Medico extends Persona {
    private double PrecioConsulta=0.0;
    private String Especialidad;

    public Medico(){}

    public double getPrecioConsulta() {
        return PrecioConsulta;
    }

    public void setPrecioConsulta(double precioConsulta) {
        PrecioConsulta = precioConsulta;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String especialidad) {
        Especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "PrecioConsulta=" + PrecioConsulta +
                ", Especialidad='" + Especialidad + '\'' +
                '}';
    }
}
