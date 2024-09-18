package pe.edu.cibertec.evaluaciones.guiada03Cajero.entity;

public class Cliente {

    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String tipoDucumento;
    private String numeroDocumento;
    private Cuenta cuenta;

    public Cliente(String nombres, String apellidoPaterno, String apellidoMaterno, String tipoDucumento, String numeroDocumento, Cuenta cuenta) {
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.tipoDucumento = tipoDucumento;
        this.numeroDocumento = numeroDocumento;
        this.cuenta = cuenta;
    }

    public Cliente() {
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getTipoDucumento() {
        return tipoDucumento;
    }

    public void setTipoDucumento(String tipoDucumento) {
        this.tipoDucumento = tipoDucumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cliente{");
        sb.append("nombres='").append(nombres).append('\'');
        sb.append(", apellidoPaterno='").append(apellidoPaterno).append('\'');
        sb.append(", apellidoMaterno='").append(apellidoMaterno).append('\'');
        sb.append(", tipoDucumento='").append(tipoDucumento).append('\'');
        sb.append(", numeroDocumento='").append(numeroDocumento).append('\'');
        sb.append(", cuenta=").append(cuenta);
        sb.append('}');
        return sb.toString();
    }
}
