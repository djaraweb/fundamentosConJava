package pe.edu.cibertec.evaluaciones.examen01.entities;

public class Paciente extends Persona implements Medible {
    private String fechaConsulta;
    private Medico medicoTratante;

    static final int BAJO_DE_PESO = -1;
    static final int NORMAL = 0;
    static final int SOBREPESO = 1;

    public Paciente() {
    }

    public String getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(String fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public Medico getMedicoTratante() {
        return medicoTratante;
    }

    public void setMedicoTratante(Medico medicoTratante) {
        this.medicoTratante = medicoTratante;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "fechaConsulta='" + fechaConsulta + '\'' +
                ", medicoTratante=" + medicoTratante +
                '}';
    }

    @Override
    public int cacularIMC() {
        double pesoIdeal = getPeso() / Math.pow(getAltura(), 2);
        if (pesoIdeal >= 1.0 && pesoIdeal <= 18.5) {
            return BAJO_DE_PESO;
        } else if (pesoIdeal > 18.5 && pesoIdeal <= 24.9) {
            return NORMAL;
        } else {
            return SOBREPESO;
        }
    }

    public String mensajeSegunIMC(int imc){
        String msg="";
        switch (imc){
            case -1:
                msg = "por debajo de su peso ideal";
                break;
            case 0:
                msg = "en su peso ideal";
                break;
            case 1:
                msg = "con sobrepeso";
                break;
        }
        return msg;
    }
}
